package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App
{
    public static void main( String[] args )
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("com/config.xml");
        JdbcTemplate bean = context.getBean("jdbcTemplate", JdbcTemplate.class);

        System.out.println(context);

        System.out.println( "Hello World!" );
    }
}
