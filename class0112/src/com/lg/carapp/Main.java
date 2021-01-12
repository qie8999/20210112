package com.lg.carapp;

import java.util.ArrayList;

import com.lg.carapp.car.Car;

public class Main {
	public static void main(String[] args) {
		
/*		//자동으로 car생성자를 만들어줌
		//내가 만든 기본 생성자가 없으면 
		//자바 컴파일러가 자동으로 생성
		//내가 만든 기본 생성자가 있으면
		//내것으로 사용함.*/
		Car car = new Car();
//		System.out.println(car.getModel());
		car.setModel("그랜저1");
		car.setYear(2020);
		car.setMoney("3천만원");
		//이미 있는 생성자 사용
		
		
		new Car(); //재사용 불가
		new Car();
		
//		Car car2 = new Car("그랜저",2021,"3천만원");
		//매개변수 존재하는 생성자
//		car2.showCarInfo();
		
		
		//객체 생성x -> 배열만 생성o
		Car car3[] = new Car[10];
		
/*		//int num[] = new int [10];
		car3[0] = new Car(); //마킹하는 객체
		car3[9] = new Car();//객체의 처음과 마지막값이 들어있음
		*/
		
		
//		for(int i=0; i<car3.length; i++) {
//			car3[3] = new Car();
//			
//		}
		
		//컬렉션 클래스 (자료구조) ArrayList
		ArrayList<Car> arrList = new ArrayList<>();
				
		//크기가 정해져 있지 않은 배열
		//<>안에는 모든 타입이 들어갈 수 있다
//		arrList.add(new Car("소나타",2020, "2천만원"));
//		arrList.add(new Car("SM7",2021, "3천만원"));
//		
//		for(int i=0; i<arrList.size(); i++) {
////			Car mycar = arrList.get(i);
////			mycar.showCarInfo();
//			arrList.get(i).showCarInfo();
//			//syso와 같은 역할
		}
	}

//}




