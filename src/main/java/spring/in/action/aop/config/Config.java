package spring.in.action.aop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import spring.in.action.aop.aspect.Audience;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages= {"spring.in.action.aop"})
public class Config {
	
	@Bean
	public Audience audience() {
	return new Audience();
	}
}
