package com.kevin.designpattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/**
 *	设计模式
 *
 * @author lihongmin
 * @date 2019/11/3 17:48
 */
@ComponentScan(basePackages = "com.kevin.designpattern.headfirst.observer.spring")
@SpringBootApplication
public class DesignpatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignpatternApplication.class, args);
	}

}
