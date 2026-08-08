package gerilewy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {

		var context = new AnnotationConfigApplicationContext(AppConfig.class);

		Person person = context.getBean(Person.class);
		
		System.out.println(person.getPersonName());
		System.out.println(person.getParrot());


	}
}