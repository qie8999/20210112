package com.lg.carapp.car;

public class Car {
	private String model;
	private int year;
	private String money;
	
	public Car() {
		model = "K7";
		year = 2020;
		money = "4천만원";
		System.out.println("기본 생성자 생성!");
		showCarInfo();		
	}
     //	- 쓰지 않아도 자동 생성
     //	클래스 정보 초기화
	
//	public Car(String model, int year, String money) {
//		super(); //매개 변수가 3개이고 다 타입이 다름
//		this.model = model;
//		this.year = year;
//		this.money = money;
//	} //오버로딩 (중복 정의)
	//1. 매개 변수 개수 달라야 됨
	//2. 매개 변수 타입이 달아야 됨
	//둘중에 하나 만족해야 함
	
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
		System.out.println("모델:  " +model);
		System.out.println("연식:  " +year);
		System.out.println("가격:  " +money);
		System.out.println("----------------");
	}
	//인스턴스 메소드
}
