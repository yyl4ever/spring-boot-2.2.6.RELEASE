package com.company.bbkb.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSpringBootStarterApplication {

	// 如何将引入了这个 starter 的工程启动时将 starter 里面的类装载到 IOC 容器呢？
	// 1. 需要这个 starter 告诉引用者入口类在哪里 DemoAutoConfiguration
	// demo-spring-boot-starter/src/main/resources/META-INF/spring.factories
	public static void main(String[] args) {
		SpringApplication.run(DemoSpringBootStarterApplication.class, args);
	}

}
