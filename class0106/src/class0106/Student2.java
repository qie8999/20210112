package class0106;

//Ŭ���� �ۿ� �����ؾ���(����ִ� ��ü ����)
//�ּҷ� Ŭ���� ����
public class Student2 {
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