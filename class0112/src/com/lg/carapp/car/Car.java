package com.lg.carapp.car;

public class Car {
	private String model;
	private int year;
	private String money;
	
	public Car() {
		model = "K7";
		year = 2020;
		money = "4õ����";
		System.out.println("�⺻ ������ ����!");
		showCarInfo();		
	}
     //	- ���� �ʾƵ� �ڵ� ����
     //	Ŭ���� ���� �ʱ�ȭ
	
//	public Car(String model, int year, String money) {
//		super(); //�Ű� ������ 3���̰� �� Ÿ���� �ٸ�
//		this.model = model;
//		this.year = year;
//		this.money = money;
//	} //�����ε� (�ߺ� ����)
	//1. �Ű� ���� ���� �޶�� ��
	//2. �Ű� ���� Ÿ���� �޾ƾ� ��
	//���߿� �ϳ� �����ؾ� ��
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	
	public void showCarInfo(){
		System.out.println("��:  " +model);
		System.out.println("����:  " +year);
		System.out.println("����:  " +money);
		System.out.println("----------------");
	}
	//�ν��Ͻ� �޼ҵ�
}
