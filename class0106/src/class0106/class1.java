package class0106;

public class class1 {

	public static void main(String[] args) {
		Student2 s =new Student2();
		//�������� �����տ� �°��� Ÿ��. 
		//student�� Ÿ������ ����
		
		s.setName("ȫ�浿");
		s.setEmail("hong@naver.com");
		s.setTel("010-1234-5678");
		s.setName("��浿");
		
		System.out.println("�̸� : " + s.getName());
		System.out.println("�̸��� : " + s.getEmail());
		System.out.println("��ȭ : " + s.getTel());
				
		Student2 ss = new Student2();//s�� �ٸ�
		ss.setName("�ֱ浿");
		ss.setEmail("choi@naver.com");
		ss.setTel("010-1233-3323");
		System.out.println("�̸� : " + ss.getName());
		System.out.println("�̸��� : " + ss.getEmail());
		System.out.println("��ȭ : " + ss.getTel());
		System.out.println("����: " + Student.category);
		
		new Student2().setName("�̱浿");
		System.out.println(new Student2().getName());
		//���� �ٽ� ���� ����� ����(�͸�ü)
		
	}

}
/*
//Ŭ���� �ۿ� �����ؾ���(����ִ� ��ü ����)
//�ּҷ� Ŭ���� ����
class Student2 {
	static String category="��������SW����";
	//�ν��Ͻ� ����
	//public �ܺ� Ŭ�������� ���� ����
	//private ������ �ܺ� Ŭ�������� ���ٺҰ�
	private String name;
	private String tel;
	private String email;
	//�ʿ��� ���븸 �̾Ƴ��°� "�߻�ȭ �Ѵ�"
	//Ŭ������ ����Ϸ��� ��ü ���� (��)
	//Student s =new Student();
	
	//�ν��Ͻ� �޼ҵ�
	//setter
	public void setName(String name) {
		this.name =name;
		//this�� ������ ��ü�� ��ġ����
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