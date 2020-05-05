package com.company.bbkb.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author: yangyl
 * @Date: 2020-05-05 20:13
 * @Description: 让引入该 starter 的工程可以配置化
 */
@ConfigurationProperties(prefix = "spring.demo")
public class DemoProperties {
	private String name = "someone";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
