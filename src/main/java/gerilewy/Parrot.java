package gerilewy;

public class Parrot {

	public static int countParrots;
	private String name;

	public Parrot() {
		countParrots++;

	}

	public Parrot(String name) {
		countParrots++;
		this.name = name;

	}

	public String getName() {

		return name;
	}
	
	public void setName(String parrotName) {
		this.name = parrotName;
	}

	@Override
	public String toString() {
		return "Parrot{" +
				"name='" + name + '\'' + countParrots +
				'}';
	}

//	public void setName(String name) {
//		this.name = name;
//	}

}
