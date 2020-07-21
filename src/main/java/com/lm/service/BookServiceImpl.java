package com.lm.service;

import com.lm.mapper.BookMapper;
import com.lm.pojo.Books;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author super
 */
@Service
public class BookServiceImpl implements BookService{
   private BookMapper bookMapper;

   @Autowired
   @Qualifier("bookMapper")
   public void setBookMapper(BookMapper bookMapper) {
      this.bookMapper = bookMapper;
   }

   @Override
   public void addBook(Books books) {
      bookMapper.addBook(books);
   }

   @Override
   public void deleteBookById(int id) {
      bookMapper.deleteBookById(id);
   }

   @Override
   public void updateBook(Books books) {
      bookMapper.updateBook(books);
   }

   @Override
   public Books queryBookById(int id) {
      return bookMapper.queryBookById(id);
   }

   @Override
   public List<Books> queryBookList() {
      return bookMapper.queryBookList();

   }

   @Override
   public List<Books> queryBookByName(String bookName) {
      return bookMapper.queryBookByName(bookName);
   }
}
