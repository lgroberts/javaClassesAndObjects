package javaClassesAndObjects;

public class Pet {
	
	private String name = "";
	private Integer age = 0;
	private String location = "";
	private String type = "";
	
	public Pet() {
		
	}
	
	public Pet(String name, Integer age, String location, String type) {
		this.name = name;
		this.age = age;
		this.location = location;
		this.type = type;
	}
	
	public String getName() {
		return name;
	}
	public Integer getAge() {
		return age;
	}
	public String getType() {
		return type;
	}
	public void setName(String newName) {
		this.name = newName;
	}
	public void setAge(Integer newAge) {
		this.age = newAge;
	}
	public void setLocation(String newLocation) {
		this.location = newLocation;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
