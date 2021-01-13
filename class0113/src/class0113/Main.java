package class0113;

public class Main {

	public static void main(String[] args) {
		// 선생님과 푸는 01번 해답
		Car car = new Car();//객체생성
		System.out.println("---------------------");
//		out은 스테틱.println은 메소드
		System.out.println(Car.JIJUM);//대문자
		System.out.println("---------------------");
		car.showCarInfo();
		
		Car car2 = new Car("그랜저","현대","흰색","3천만원");
		//매개변수 있는 생성자 /객체생성
		//정보 초기화
		car2.showCarInfo();		
		
		//한번밖에 사용할 수 없음    
		new Car().showCarInfo();

	}

}
