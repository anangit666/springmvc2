package com.baijie.service;

import com.baijie.dao.BookDao;
import com.baijie.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookDao dao;

    public void saveBook(Book book){
        dao.saveBook(book);
    }

    public void deleteBook(Integer id){
        dao.deleteBookById(id);
    }

    public void updateBook(Book book){
        dao.updateBook(book);
    }

    public Book queryBook(Integer id){
        return dao.queryBookById(id);
    }

    public List<Book> queryListBook(){
        return dao.queryList();
    }

}
