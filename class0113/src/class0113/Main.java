package class0113;

public class Main {

	public static void main(String[] args) {
		// �����԰� Ǫ�� 01�� �ش�
		Car car = new Car();//��ü����
		System.out.println("---------------------");
//		out�� ����ƽ.println�� �޼ҵ�
		System.out.println(Car.JIJUM);//�빮��
		System.out.println("---------------------");
		car.showCarInfo();
		
		Car car2 = new Car("�׷���","����","���","3õ����");
		//�Ű����� �ִ� ������ /��ü����
		//���� �ʱ�ȭ
		car2.showCarInfo();		
		
		//�ѹ��ۿ� ����� �� ����    
		new Car().showCarInfo();

	}

}
