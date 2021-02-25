package ooP_Encaspulation;

public class Employee {
	
	private String name;
	private int age;
	private double salary;
	private char gender;
	private boolean isPermanent;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public boolean isPermanent() {
		return isPermanent;
	}
	public void setPermanent(boolean isPermanent) {
		this.isPermanent = isPermanent;
	}
	
	public static void main(String []args) {
		Employee e1 = new Employee();
		e1.name = "Krishna";
		System.out.println(e1.name);
	}
	
	
	
	

}
