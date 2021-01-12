package class0106_2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.setName("홍길동");
		s.setTel("010-1234-5678");
		s.setEmail("hong@naver.com");
		//캡슐화에 의거한 객채지향 방식
		s.showStudentInfo();
		
		Student s2 = new Student();
		s.setName("최길동");
		s.setTel("010-1234-1111");
		s.setEmail("choi@naver.com");
		//캡슐화에 의거한 객채지향 방식
		s.showStudentInfo();


	}

}
