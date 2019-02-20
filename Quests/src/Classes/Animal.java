package Classes;

public abstract class Animal {

	protected final String name;
	int age;

	public Animal(String name) {
		if (name != getName()) {
			throw new IllegalArgumentException("Invalid value " + name);
		} else

			this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void makeSound() {

	}

}
