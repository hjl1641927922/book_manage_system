package com.lm.config;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 111111
 * 、
 * 秀秀龙牛逼
 * @author super
 */

public class LoginInterceptor implements HandlerInterceptor {
    /**
     * return true为放行 false为不放行
     * postHandle
     * afterCompletion
     * 以上两个方法为记录日志用，实现功能只需实现preHandle方法
     *
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //判断什么情况下没有登录session
        //放行判断，判断什么情况下登录
        String loginSession ="userLoginInfo";
        final HttpSession session = request.getSession();
        if (request.getRequestURI().contains("toLogin")){
            return true;
        }
        if (session.getAttribute(loginSession) != null) {
            return true;
        }
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request,response);
        return false;
    }

}
