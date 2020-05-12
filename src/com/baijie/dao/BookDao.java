package com.baijie.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.baijie.entity.Book;

@Repository
public interface BookDao {
    //@Autowired
// JbbcTemplate jdbcTemplate	
    public int saveBook(Book book);//  插入一本书
    public int deleteBookById(Integer id);//按照id删除图书
    public int updateBook(Book book);//更新图书信息
    public Book queryBookById(Integer id);//按照id查询Book
    public List<Book> queryList();//返回所有的book的集合
}
