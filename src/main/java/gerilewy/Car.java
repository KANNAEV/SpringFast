package gerilewy;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component

public class Car {
	public String brand = "Car";


	public Car() {
	}

	@PostConstruct
	public void init() {
		this.brand = "Mercedes";
	}


	public Car(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Car{" +
				"brand='" + brand + '\'' +
				'}';
	}

}
