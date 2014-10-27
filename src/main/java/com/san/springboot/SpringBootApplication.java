package com.san.springboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@EnableAutoConfiguration
//at the moment auto config supports
//embedded server (tomcat/jetty), datasource, JPA, Web template, Reactor,
// production ready NFR using Actuator (beans,dump,health,metrics,trace,shutdown)
@ComponentScan
public class SpringBootApplication {

    public static void main(String[] args){

        SpringApplication.run(SpringBootApplication.class, args);
    }

    //controllers testing
    //http://docs.spring.io/spring-framework/docs/4.0.x/javadoc-api/org/springframework/test/web/servlet/MockMvc.html
}
