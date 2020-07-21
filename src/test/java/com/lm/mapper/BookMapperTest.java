package com.lm.mapper;

import com.lm.pojo.Books;
import com.lm.service.BookService;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookMapperTest extends TestCase {
    final ApplicationContext context =
            new ClassPathXmlApplicationContext("applicationContext.xml");
    final BookService mapper =context.getBean("bookServiceImpl", BookService.class);
//
//    public void testAddBook() {
//        mapper.addBook(new Books("Mybatis",100,"持久化框架"));
//    }
//
//    public void testDeleteBook() {
//        mapper.deleteBookById(4);
//    }
//
//    public void testUpdateBook() {
//        mapper.updateBook(new Books(5,"Mybatis",90,"持久化框架"));
//    }
//
//    public void testQueryBookById() {
//        System.out.println(mapper.queryBookById(2));
//    }

//    public void testQueryBookList() {
//        for (Books books : mapper.queryBookList()) {
//            System.out.println(books);
//        }
//    }

    public void testQueryBookByName() {
        for (Books books : mapper.queryBookByName("My")) {
            System.out.println(books);
        }
    }
}