package gerilewy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "gerilewy")
public class AppConfig {


	@Bean
	Parrot parrot() {
		Parrot p = new Parrot();
		p.setName("Кеша");
		return p;
	}

	@Bean
	Person person(Parrot parrot) {
		Person p = new Person();
		p.setPersonName("Гаджи");
		p.setParrot(parrot);
		return p;
	}

}
