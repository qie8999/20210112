package class0106_2;

public class Student {
	private String name;
	private String tel;
	private String email;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public void showStudentInfo() {
		System.out.println("�̸�: " + name);
		System.out.println("��ȭ: " + tel);
		System.out.println("�̸���: " + email);
	}

}
