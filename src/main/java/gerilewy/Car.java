package gerilewy;

import org.springframework.stereotype.Component;

@Component
public class Car {
	public String brand = "Car";

	public Car() {
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
