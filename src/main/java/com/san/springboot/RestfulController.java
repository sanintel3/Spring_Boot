package com.san.springboot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.SQLException;


@RestController
public class RestfulController {

    @Value("${name}")
    private String name;

    @Autowired
    private DataSource dataSource;

    @RequestMapping("/hello")
    public String hello() throws SQLException {
        return "hello " + name + " "
                + dataSource.getConnection().getMetaData().getDatabaseProductName();
    }
}
