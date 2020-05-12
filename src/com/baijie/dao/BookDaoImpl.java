package com.baijie.dao;

import com.baijie.entity.Book;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository("bookDao")
public class BookDaoImpl implements BookDao {
    @Resource(name = "jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    @Override
    public int saveBook(Book book) {
        String sql = "insert into t_book(id , name , author , price , sales , stock) values(book_id.nextval , ? , ? ,?, ? , ?)";
        return this.jdbcTemplate.update(sql,
                new Object[]{
                        book.getName(),
                        book.getAuthor(),
                        book.getPrice(),
                        book.getSales(),
                        book.getStock()
                });
    }

    @Override
    public int deleteBookById(Integer id) {
        String sql = "delete from t_book where id = ?";
        return this.jdbcTemplate.update(sql,new Object[]{
                id
        });
    }

    @Override
    public int updateBook(Book book) {
        String sql = "update t_book set name=?,author=?,price=?,sales=?,stock=? where id=?";
        return this.jdbcTemplate.update(sql,new Object[]{
                book.getName(),
                book.getAuthor(),
                book.getPrice(),
                book.getSales(),
                book.getStock(),
                book.getId()
        });
    }

    @Override
    public Book queryBookById(Integer id) {
        String sql = "select id,name,author,price,sales,stock from t_book where id=?";
        Book book = (Book)this.jdbcTemplate.query(sql,new BeanPropertyRowMapper<Book>(Book.class),id);
        return book;
    }

    @Override
    public List<Book> queryList() {
        String sql = "select id,name,author,price,sales,stock from t_book where id=?";
        return this.jdbcTemplate.query(sql,new BeanPropertyRowMapper<Book>(Book.class));
    }
}
