package com.lm.mapper;

import com.lm.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    /**
     * 增加一本书
     * @param books 
     */
    void addBook(Books books);

    /**
     * 按照书的id删除一本书
     * @param id
     */
    void deleteBookById(@Param("id") int id);

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
    Books queryBookById(@Param("id") int id);

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
    List<Books> queryBookByName(@Param("bookName") String bookName);

}
