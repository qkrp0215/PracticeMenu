package ClothingSalesProject.dto;

public class Person {
	private String name;
	private String id;
	private String phoneNumber;
	private int age;
	
	
	
	public Person() {
		super();
	}


	public Person(String name, String id, String phoneNumber, int age) {
		super();
		this.name = name;
		this.id = id;
		this.phoneNumber = phoneNumber;
		this.age = age;
	}
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}




	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", phoneNumber=" + phoneNumber + ", age=" + age + "]";
	}
	
	
}
