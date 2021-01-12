package class0106;

public class class2 {

	public static void main(String[] args) {
		Student s =new Student();
		//예전에는 변수앞에 온것이 타입. 
		//student도 타입으로 간주
		s.name="홍길동";
		s.email="hong@naver.com";
		s.tel="010-1234-5678";
		s.name="김길동";
		
		System.out.println("이름 : " + s.name);
		System.out.println("이메일 : " + s.email);
		System.out.println("전화 : " + s.tel);
				
		Student ss = new Student();//s와 다름
		ss.name="최길동";
		ss.email="choi@naver.com";
		ss.tel="010-1233-3323";
		System.out.println("이름 : " + ss.name);
		System.out.println("이메일 : " + ss.email);
		System.out.println("전화 : " + ss.tel);
		System.out.println("과정: " + Student.category);
	}

}
/*
//클래스 밖에 선언해야함(비어있는 객체 생성)
//주소록 클래스 정의
class Student {
	static String category="통합응용SW과정";
	//인스턴스 변수
	String name;
	String tel;
	String email;
	//필요한 내용만 뽑아내는것 "추상화 한다"
	//클래스를 사용하려면 객체 생성 (위)
	//Student s =new Student();
}
*/