package com.lg.carapp;

import java.util.ArrayList;

import com.lg.carapp.car.Car;

public class Main {
	public static void main(String[] args) {
		
/*		//�ڵ����� car�����ڸ� �������
		//���� ���� �⺻ �����ڰ� ������ 
		//�ڹ� �����Ϸ��� �ڵ����� ����
		//���� ���� �⺻ �����ڰ� ������
		//�������� �����.*/
		Car car = new Car();
//		System.out.println(car.getModel());
		car.setModel("�׷���1");
		car.setYear(2020);
		car.setMoney("3õ����");
		//�̹� �ִ� ������ ���
		
		
		new Car(); //���� �Ұ�
		new Car();
		
//		Car car2 = new Car("�׷���",2021,"3õ����");
		//�Ű����� �����ϴ� ������
//		car2.showCarInfo();
		
		
		//��ü ����x -> �迭�� ����o
		Car car3[] = new Car[10];
		
/*		//int num[] = new int [10];
		car3[0] = new Car(); //��ŷ�ϴ� ��ü
		car3[9] = new Car();//��ü�� ó���� ���������� �������
		*/
		
		
//		for(int i=0; i<car3.length; i++) {
//			car3[3] = new Car();
//			
//		}
		
		//�÷��� Ŭ���� (�ڷᱸ��) ArrayList
		ArrayList<Car> arrList = new ArrayList<>();
				
		//ũ�Ⱑ ������ ���� ���� �迭
		//<>�ȿ��� ��� Ÿ���� �� �� �ִ�
//		arrList.add(new Car("�ҳ�Ÿ",2020, "2õ����"));
//		arrList.add(new Car("SM7",2021, "3õ����"));
//		
//		for(int i=0; i<arrList.size(); i++) {
////			Car mycar = arrList.get(i);
////			mycar.showCarInfo();
//			arrList.get(i).showCarInfo();
//			//syso�� ���� ����
		}
	}

//}




