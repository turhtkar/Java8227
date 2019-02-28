package BankE;

public class Person {

	private String name;
	private int age;
	private String ID;
	private int PhoneNumber;

	public Person(String name, int age, String iD, int phoneNumber) {
		super();
		this.name = name;
		this.age = age;
		this.ID = iD;
		PhoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getID() {
		return ID;
	}

	public int getPhoneNumber() {
		return PhoneNumber;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", ID=" + ID + ", PhoneNumber=" + PhoneNumber + "]";
	}
}
