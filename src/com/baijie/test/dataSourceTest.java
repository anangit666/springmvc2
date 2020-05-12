package com.baijie.test;

import com.baijie.dao.BookDao;
import com.baijie.entity.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.math.BigDecimal;

@ContextConfiguration(locations = "classpath:springmvc-config.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class dataSourceTest {
    @Autowired
    DataSource dataSource;
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    public void testDataSource(){
        System.out.println(dataSource);
    }

    @Test
    public void testJdbcTemplate(){
        System.out.println(jdbcTemplate);
    }

    @Autowired
    BookDao dao;
    @Test
    public void testSaveBook(){
        int a = dao.saveBook(new Book("test","hja",new BigDecimal(11),44,44));
        System.out.println(a);
    }

    @Test
    public void deleteBook(){
        int a = dao.deleteBookById(1022);
        System.out.println(a);
    }

    @Test
    public void testUpdateBook(){
        System.out.println(dao.updateBook(new Book(1021,"aaaa","hja",new BigDecimal(11),44,44)));
    }

    @Test
    public void testQueryById(){

        System.out.println(dao.queryBookById(1021));
    }

    @Test
    public void testQueryList(){
        System.out.println(dao.queryList());
    }
}
