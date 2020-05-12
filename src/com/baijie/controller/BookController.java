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

    //去往更新图书的页面
    @RequestMapping(value = "/toUpdateBook")
    public ModelAndView toUpdateBook(Integer id){
        ModelAndView modelAndView =
                new ModelAndView();

        //查找图书
        Book book = service.queryBook(id);

        //向模型添加数据
        modelAndView.addObject("book",book);
        //设置转发视图
        modelAndView.setViewName("updateBook");
        return modelAndView;
    }

    /**
     * 更新图书信息
     * */
    @RequestMapping(value = "/updateBook")
    public String updateBook(Book book){
        System.out.println(book);

        service.updateBook(book);
        //重定向到查询所有图书的页面。
        return "redirect:/book/list";
    }

    /**
     * 去往添加图书的页面*/
    @RequestMapping(value = "/toAddBook")
    public String toAddBook(){
        return "/addBook";
    }

    /**
     * 添加图书请求*/
    @RequestMapping(value = "/addBook")
    public String addBook(Book book){
        System.out.println(book);
        //持久化
        service.saveBook(book);
        //重定向到查询所有书本页面
        return "redirect:/book/list";
    }
}
