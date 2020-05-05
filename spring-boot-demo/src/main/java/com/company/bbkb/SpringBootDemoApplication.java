package com.company.bbkb;

import com.company.bbkb.demo.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// SpringMVC 中的优化点，注解化
// 点进去，这个注解很重要
@SpringBootApplication
public class SpringBootDemoApplication implements CommandLineRunner {

	@Autowired
	private IHelloService helloService;

	public static void main(String[] args) {
		// run 方法做了什么事情？
		// ioc 容器初始化，监听器初始化，计时器
		// 启动tomcat,tomcat.start()
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

	/**
	 * 实现 CommandLineRunner 接口，让启动时处理一些想要的事情
	 * @param args incoming main method arguments
	 * @throws Exception
	 */
	@Override
	public void run(String... args) throws Exception {
		helloService.sayHello();
	}
}
