package class0113;

public class Car {
	public static final String JIJUM ="동대구 영업소";
	//클래스 메소드(독자적으로 동작)
	//상수 클래스 변수는 대문자
	//한개만 생성됨
	private String model;
	private String company;
	private String color;
	private String price;
	public Car() {//source/construction using field 들어가서 미체크
		//객체지향 상속의 동작 /생성자는 void가 없다
		//인스턴스 변수
		model ="K7";
		company ="기아";
		color ="블랙";
		price="사천만원";
		//객체에는 생성자가 있어야 되고 
		//이것은 기본생성자
		//다른 내용이 들어오지 않으면 기본
	}
	
	//오버로딩 /중복정의
	public Car(String model, String company, String color, String price) {
		super();//source/construction using field 들어가서 체크
		this.model = model;
		this.company = company;
		this.color = color;
		this.price = price;
	}
	public void showCarInfo() { //인스턴스 메소드
		//클래스 안으로 들어갈 수 없다
		System.out.println("영업소: " +Car.JIJUM );
		System.out.println("제조사: "+ company);
		System.out.println("모델: "+ model);		
		System.out.println("가격: "+ price);
		System.out.println("색상: "+ color);
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	
	

}
