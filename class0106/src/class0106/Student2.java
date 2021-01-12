package class0106;

//클래스 밖에 선언해야함(비어있는 객체 생성)
//주소록 클래스 정의
public class Student2 {
	static String category="통합응용SW과정";
	//인스턴스 변수
	//public 외부 클래스에서 접근 가능
	//private 무조건 외부 클래스에서 접근불가
	private String name;
	private String tel;
	private String email;
	//필요한 내용만 뽑아내는것 "추상화 한다"
	//클래스를 사용하려면 객체 생성 (위)
	//Student s =new Student();
	
	//인스턴스 메소드
	//setter
	public void setName(String name) {
		this.name =name;
		//this는 생성된 객체의 위치정보
	}
	//getter
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}