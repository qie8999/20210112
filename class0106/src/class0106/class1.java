package class0106;

public class class1 {

	public static void main(String[] args) {
		Student2 s =new Student2();
		//예전에는 변수앞에 온것이 타입. 
		//student도 타입으로 간주
		
		s.setName("홍길동");
		s.setEmail("hong@naver.com");
		s.setTel("010-1234-5678");
		s.setName("김길동");
		
		System.out.println("이름 : " + s.getName());
		System.out.println("이메일 : " + s.getEmail());
		System.out.println("전화 : " + s.getTel());
				
		Student2 ss = new Student2();//s와 다름
		ss.setName("최길동");
		ss.setEmail("choi@naver.com");
		ss.setTel("010-1233-3323");
		System.out.println("이름 : " + ss.getName());
		System.out.println("이메일 : " + ss.getEmail());
		System.out.println("전화 : " + ss.getTel());
		System.out.println("과정: " + Student.category);
		
		new Student2().setName("이길동");
		System.out.println(new Student2().getName());
		//쓰고 다시 접근 방법이 없음(익명객체)
		
	}

}
/*
//클래스 밖에 선언해야함(비어있는 객체 생성)
//주소록 클래스 정의
class Student2 {
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
*/