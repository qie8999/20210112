package class0106;

public class class2 {

	public static void main(String[] args) {
		Student s =new Student();
		//�������� �����տ� �°��� Ÿ��. 
		//student�� Ÿ������ ����
		s.name="ȫ�浿";
		s.email="hong@naver.com";
		s.tel="010-1234-5678";
		s.name="��浿";
		
		System.out.println("�̸� : " + s.name);
		System.out.println("�̸��� : " + s.email);
		System.out.println("��ȭ : " + s.tel);
				
		Student ss = new Student();//s�� �ٸ�
		ss.name="�ֱ浿";
		ss.email="choi@naver.com";
		ss.tel="010-1233-3323";
		System.out.println("�̸� : " + ss.name);
		System.out.println("�̸��� : " + ss.email);
		System.out.println("��ȭ : " + ss.tel);
		System.out.println("����: " + Student.category);
	}

}
/*
//Ŭ���� �ۿ� �����ؾ���(����ִ� ��ü ����)
//�ּҷ� Ŭ���� ����
class Student {
	static String category="��������SW����";
	//�ν��Ͻ� ����
	String name;
	String tel;
	String email;
	//�ʿ��� ���븸 �̾Ƴ��°� "�߻�ȭ �Ѵ�"
	//Ŭ������ ����Ϸ��� ��ü ���� (��)
	//Student s =new Student();
}
*/