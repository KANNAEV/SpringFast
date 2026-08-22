package part6_AOP.task2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import part6_AOP.task2.aspects.CommentsAspect;

@Configuration
@ComponentScan(basePackages = "part6_AOP.task2.services")
@EnableAspectJAutoProxy
public class AppConfig {

	@Bean
	CommentsAspect commentsAspect() {
		return new CommentsAspect();
	}


}
