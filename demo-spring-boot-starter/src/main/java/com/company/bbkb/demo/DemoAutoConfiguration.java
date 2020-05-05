package com.company.bbkb.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: yangyl
 * @Date: 2020-05-05 20:11
 * @Description: 使用这个 starter，用法类似 RabbitAutoConfiguration：引入 starter -- > 写application.yml
 */
@Configuration
// @ConditionalOnClass + @ConditionalOnMissingBean 指明当内存中不存在 helloService 这个 Bean 时创建这个 Bean
@ConditionalOnClass(IHelloService.class)
// 让配置 DemoProperties 生效
@EnableConfigurationProperties(DemoProperties.class)
public class DemoAutoConfiguration {

	// @Configuration + @Bean
	@Bean
	@ConditionalOnMissingBean
	public IHelloService helloService() {
		return new HelloServiceImpl();
	}
}
