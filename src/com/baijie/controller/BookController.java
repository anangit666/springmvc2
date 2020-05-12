package com.baijie.controller;

import com.baijie.entity.Book;
import com.baijie.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "book")
public class BookController {
    @Autowired
    private BookService service;

    @RequestMapping(value = "/list")
    public ModelAndView list(){
        //获取数据
        List<Book> bookList = service.queryListBook();
        //模型对象
        ModelAndView modelAndView =
                new ModelAndView();
        //向模型添加数据
        modelAndView.addObject("list",bookList);
        //返回视图页面
        modelAndView.setViewName("listbook");
        return modelAndView;
    }

    @RequestMapping(value = "/delete")
    /**依据删除图书*/
    public String deleteBookById(Integer id){
        System.out.println(id);
        service.deleteBook(id);
        return "redirect:/book/list";
    }
}
