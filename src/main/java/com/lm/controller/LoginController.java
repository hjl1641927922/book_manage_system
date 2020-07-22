package com.lm.controller;

import com.lm.pojo.User;
import com.lm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @author super
 */
@Controller
public class LoginController {

    private UserService userService;

    @Autowired
    @Qualifier("userServiceImpl")
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/user/toAllBook")
    public String toAllBook() {
        return "redirect:/book/allBook";
    }

    @RequestMapping("/user/toLogin")
    public String toLogin() {
        return "login";
    }

    @RequestMapping("/login")
    public String login(HttpSession session, String username, String password) {
        if (userService.queryUser(new User(username,password))!=null) {
            session.setAttribute("userLoginInfo", username);
            return "redirect:/book/allBook";
        }else {
            return "login";
        }
    }
    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute("userLoginInfo");
        return "login";
    }
    @RequestMapping("/toRegister")
    public String toRegister(){
        return "register";
    }
    @RequestMapping("/register")
    public String register(String username,String password){
        userService.addUser(new User(username,password));
        return "login";
    }
}
