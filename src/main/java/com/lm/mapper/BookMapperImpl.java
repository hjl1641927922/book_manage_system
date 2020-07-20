package com.lm.mapper;

import com.lm.pojo.Books;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @author super
 */
public class BookMapperImpl extends SqlSessionDaoSupport implements BookMapper {

    @Override
    public void addBook(Books books) {
        getSqlSession().getMapper(BookMapper.class).addBook(books);
    }

    @Override
    public void deleteBookById(int id) {
        getSqlSession().getMapper(BookMapper.class).deleteBookById(id);
    }

    @Override
    public void updateBook(Books books) {
        getSqlSession().getMapper(BookMapper.class).updateBook(books);
    }

    @Override
    public Books queryBookById(int id) {
        return getSqlSession().getMapper(BookMapper.class).queryBookById(id);
    }

    @Override
    public List<Books> queryBookList() {
        return getSqlSession().getMapper(BookMapper.class).queryBookList();

    }
}
