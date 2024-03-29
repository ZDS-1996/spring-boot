package com.example.demo;

import java.util.Properties;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.github.pagehelper.PageHelper;
@SpringBootApplication
@EnableTransactionManagement
@ComponentScan("com.example.controller")
@MapperScan("com.example.*")
/*
 * @MapperScan("com.example.*")
 * 
 * @ComponentScan("com.example.controller")
 */
public class GraduationProjectApplication {
	//配置mybatis的分页插件pageHelper
    @Bean
    public PageHelper pageHelper(){
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("offsetAsPageNum","true");
        properties.setProperty("rowBoundsWithCount","true");
        properties.setProperty("reasonable","true");
        properties.setProperty("dialect","mysql");    //配置mysql数据库的方言
        pageHelper.setProperties(properties);
        return pageHelper;
    }
	public static void main(String[] args) {
		SpringApplication.run(GraduationProjectApplication.class, args);
		System.out.println("服务启动成功");
	}

}
