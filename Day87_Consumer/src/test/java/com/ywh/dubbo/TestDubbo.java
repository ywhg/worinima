package com.ywh.dubbo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDubbo {
	
	private DubboInterface inter;
	
	@Test
	public void test(){
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring-dubbo.xml");
		
		inter=(DubboInterface) ac.getBean("myDubbo");
		
		String hello=inter.sayHello("xiaoxi");
		
		System.out.println(hello);
		
		while(true){}
	}

}
