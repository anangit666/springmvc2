package com.baijie.controller;

import com.baijie.entity.Book;
import com.baijie.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    private BookService service;

    @RequestMapping(value = "/list")
    public ModelAndView list(){

        List<Book> bookList = service.queryListBook();
        ModelAndView modelAndView =
                new ModelAndView();
        modelAndView.addObject("list",bookList);
        modelAndView.setViewName("listbook");
        return modelAndView;
    }
}
