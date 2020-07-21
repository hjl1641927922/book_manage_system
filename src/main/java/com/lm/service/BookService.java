package com.lm.service;

import com.lm.pojo.Books;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author super
 */
@Service
public interface BookService {
    /**
     * 增加一本书
     * @param books
     */
    void addBook(Books books);

    /**
     * 按照书的id删除一本书
     * @param id
     */
    void deleteBookById( int id);

    /**
     * 新增一本书
     * @param books
     */
    void updateBook(Books books);

    /**
     * 按id查询书籍
     * @param id
     * @return
     */
    Books queryBookById( int id);

    /**
     * 返回书的列表
     * @return
     */
    List<Books> queryBookList();

    /**
     * 按照书名查找书籍
     * @param bookName
     * @return
     */
    List<Books> queryBookByName(String bookName);

}
