package com.company.bbkb.demo;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: yangyl
 * @Date: 2020-05-05 20:11
 * @Description:
 */
public class HelloServiceImpl implements IHelloService {
	@Autowired
	private DemoProperties demoProperties;

	@Override
	public void sayHello() {
		String name = demoProperties.getName();
		name = name + ", welcome to spring boot world";
		System.out.println(name);
	}
}
