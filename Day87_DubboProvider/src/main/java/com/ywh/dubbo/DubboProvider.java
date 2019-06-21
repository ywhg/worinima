package com.ywh.dubbo;

public class DubboProvider implements DubboInterface{

	@Override
	public String sayHello(String name) {
		
		return "hello"+name+",welcome to dubbo";
	}

}
