package com.csy;

public class Student {
	private String name;
	private int age;
	private char gender;
	private String adress;
	
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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public Student(String name, int age, char gender, String adress) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.adress = adress;
	}
	
	private void readMain() {
		Main main = new Main();
		System.out.println(main);
	}
	
	public void showStudentInfo() {
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
		System.out.println("���� : "+gender);
		System.out.println("�ּ� : "+adress);
		
	}
	
}
