package com.baijie.test;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void test(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("springmvc-config.xml");
        System.out.println(applicationContext);
        ComboPooledDataSource dataSource = (ComboPooledDataSource) applicationContext.getBean("dataSource");
        System.out.println(dataSource);
        System.out.println(applicationContext.getBean("jdbcTemplate"));
    }
}
