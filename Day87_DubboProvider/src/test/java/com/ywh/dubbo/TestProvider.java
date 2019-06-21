package com.ywh.dubbo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProvider {
	
	@Test
	public void testProvider(){
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring-dubbo.xml");
		
		System.out.println("provider is ready");
		
		while(true){}
	}

}
