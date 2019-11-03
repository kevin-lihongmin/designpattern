package com.kevin.designpattern;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.event.SimpleApplicationEventMulticaster;

import java.util.concurrent.*;


/**
 *	设计模式
 *
 * @author lihongmin
 * @date 2019/11/3 17:48
 */
@ComponentScan(basePackages = "com.kevin.designpattern.headfirst.observer.spring")
@SpringBootApplication
public class DesignpatternApplication implements BeanFactoryAware {

	private BeanFactory beanFactory;

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
	}

	@Bean
	public SimpleApplicationEventMulticaster init() {
		ThreadPoolExecutor MulticasterExecutor = new ThreadPoolExecutor(5, 5, 60, TimeUnit.SECONDS,
				new LinkedBlockingDeque<>(), Executors.defaultThreadFactory(), new ThreadPoolExecutor.DiscardPolicy());
		SimpleApplicationEventMulticaster multicaster = new SimpleApplicationEventMulticaster();
		multicaster.setTaskExecutor(MulticasterExecutor);
		multicaster.setBeanFactory(beanFactory);
		return multicaster;
	}

	public static void main(String[] args) {
		SpringApplication.run(DesignpatternApplication.class, args);
	}

}
