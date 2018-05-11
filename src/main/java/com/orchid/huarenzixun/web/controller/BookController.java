package com.orchid.huarenzixun.web.controller;

import com.orchid.huarenzixun.model.Book;
import com.orchid.huarenzixun.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/books")
public class BookController {

    private static final String MAX_LONG_AS_STRING = "9223372036854775807";

    private BookRepository bookRepository;

    @Autowired
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    @RequestMapping(method=RequestMethod.GET)
    public Iterable<Book> books() {
        return bookRepository.findAll();
    }

    @RequestMapping(value="/{bookId}", method=RequestMethod.GET)
    public String book(
            @PathVariable("bookId") Integer bookId,
            Model model) {
        model.addAttribute(bookRepository.findById(bookId));
        return "book";
    }

}