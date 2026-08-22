package part6_AOP.task1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import part6_AOP.task1.aspects.LoggingAspect;

@Configuration
@ComponentScan(basePackages = "part6_AOP.task1.services")
// Включили Аспекты
@EnableAspectJAutoProxy
public class AppConfig {
	// Добавили Аспект
	@Bean
	public LoggingAspect aspect() {
		return new LoggingAspect();

	}
}
