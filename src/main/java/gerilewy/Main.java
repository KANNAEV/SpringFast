package gerilewy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {

		var context = new AnnotationConfigApplicationContext(AppConfig.class);

		Parrot a = context.getBean("kewa", Parrot.class);
		Parrot b = context.getBean("koko", Parrot.class);
		Parrot c = context.getBean("jako", Parrot.class);
		Parrot d = context.getBean(Parrot.class);

		System.out.println(a.getName());
		System.out.println(b.getName());
		System.out.println(c.getName());
		System.out.println(d.getName());

		System.out.println(context.getBean(String.class));
		System.out.println(context.getBean(int.class));

		var contextCar = new AnnotationConfigApplicationContext("gerilewy");
		Car ferrari = contextCar.getBean(Car.class);
		System.out.println(ferrari.getBrand());


	}
}