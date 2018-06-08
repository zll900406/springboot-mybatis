package com.zll.springbootmybatisdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RequestMapping(value = "/")
@MapperScan("com.zll.mapper")
@ComponentScan("com.zll")
public class SpringbootMybatisDemoApplication {
    @RequestMapping(value = "hello")
    public String helloZll(){
        return "hello";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisDemoApplication.class, args);
    }
}
