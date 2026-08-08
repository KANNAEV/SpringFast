package gerilewy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "gerilewy")
public class AppConfig {

	@Bean
	@Primary // Бин теперь первичный
	Parrot parrot() {
		var p = new Parrot();
		p.setName("Default");
		return p;
	}

	@Bean(name = "kewa")
	Parrot parrot1() {
		var p = new Parrot();
		p.setName("Кеша");
		return p;
	}

	@Bean(name = "jako")
	Parrot parrot2() {
		var p = new Parrot();
		p.setName("Жако");
		return p;
	}

	@Bean(name = "koko")
	Parrot parrot3() {
		var p = new Parrot();
		p.setName("Коко");
		return p;
	}

	@Bean
	String hello() {
		return "Hello";
	}

	@Bean
	int ten() {
		return 10;
	}

}
