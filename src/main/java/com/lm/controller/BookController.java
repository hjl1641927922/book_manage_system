package com.lm.controller;

import com.lm.pojo.Books;
import com.lm.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author super
 */
@Controller
@RequestMapping("/book")
public class BookController {

    private BookService bookService;

    @Autowired
    @Qualifier("bookServiceImpl")
    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/allBook")
    public String list(Model model) {
        List<Books> books = bookService.queryBookList();
        model.addAttribute("books", books);
        return "allBook";
    }

    @RequestMapping("/toAddBookPage")
    public String add() {
        return "addBook";
    }

    @RequestMapping("/addBook")
    public String addBook(Books books) {
        System.out.println("addBooks" + books);
        bookService.addBook(books);
        //重定向到请求，请求复用
        return "redirect:/book/allBook";
    }

    /**
     * 跳转到修改书籍页面
     *
     * @return
     */
    @RequestMapping("/toUpdateBookPage/{id}")
    public String update(@PathVariable int id, Model model) {
        Books books = bookService.queryBookById(id);
        model.addAttribute("books", books);
        return "updateBook";
    }

    @RequestMapping("/updateBook")
    public String updateBook(Books books) {
        bookService.updateBook(books);
        System.out.println("updateBook" + books);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable int id) {
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/query")
    public String queryBooks(String queryBookName, Model model) {
        List<Books> books = bookService.queryBookByName(queryBookName);
        model.addAttribute("books", books);
        return "allBook";
    }

}
