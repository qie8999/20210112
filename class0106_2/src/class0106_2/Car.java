package class0106_2;

public class Car {
	private String name;
	private String used;
	private String cop;
	private String color;
	private String yeonbi;
	private String safety;
	private String price;
	static String daelijeom= "���� ��ȭ����";

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getSafety() {
		return safety;
	}

	public void setSafety(String safety) {
		this.safety = safety;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getYeonbi() {
		return yeonbi;
	}

	public void setYeonbi(String yeonbi) {
		this.yeonbi = yeonbi;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsed() {
		return used;
	}

	public void setUsed(String used) {
		this.used = used;
	}

	public String getCop() {
		return cop;
	}

	public void setCop(String cop) {
		this.cop = cop;
	}

	public void showCarInfo() {
		System.out.println("���� : " + name);
		System.out.println("���� : " + used);
		System.out.println("����ȸ�� : " + cop);
		System.out.println("���� : " + color);
		System.out.println("���� : " + yeonbi);
		System.out.println("������� : " + safety);
		System.out.println("���� : " + price);
		System.out.println("�븮���� : "+Car.daelijeom);
	}

	public static void main(String[] args) {
		Car s = new Car();
		s.setName("�ƿ�� A8 6.0~12 �Ǹ���");
		s.setUsed("2010��");
		s.setCop("Audi Korea");
		s.setColor("gray");
		s.setYeonbi("6.9km/L");
		s.setPrice("140,000,000");
		
		
		
		s.setSafety("����");
		
		s.showCarInfo();
		System.out.println("=======================");
		Car s2 = new Car();
		s2.setName("���� S 500 L");
		s2.setUsed("2011��");
		s2.setCop("Mercedes-Benz");
		s2.setColor("black");
		s2.setYeonbi("6.9km/L");
		s2.setSafety("����");
		s2.setPrice("133,000,000");
		
		s2.showCarInfo();
		
		System.out.println("=======================");
		Car s3 = new Car();
		s3.setName("�ѽ����̽� ������ ����");
		s3.setUsed("2015��");
		s3.setCop("Rolls-Royce Motor Cars");
		s3.setColor("blue");
		s3.setYeonbi("6.4km/L");
		s3.setSafety("�ѹ�(���� ��ü)");
		s3.setPrice("110,000,000");
		
		s3.showCarInfo();
		
		System.out.println("=======================");
		Car s4 = new Car();
		s4.setName("���� ���� JS380");
		s4.setUsed("2011��");
		s4.setCop("hyundai");
		s4.setColor("white");
		s4.setYeonbi("7.9km/L");
		s4.setSafety("�ѹ�(�Ϻ�ħ��)");
		s4.setPrice("54,000,000");
		
		s4.showCarInfo();
		
		System.out.println("=======================");
		Car s5 = new Car();
		s5.setName("�̴� ���� S");
		s5.setUsed("2012��");
		s5.setCop("MINI korea");
		s5.setColor("red");
		s5.setYeonbi("12.1km/L");
		s5.setSafety("����");
		s5.setPrice("33,000,000");
		
		s5.showCarInfo();
		
		System.out.println("=======================");
		Car s6 = new Car();
		s6.setName("������ 911 Ÿ���� 4");
		s6.setUsed("2013��");
		s6.setCop("�������ڸ��� - Porsche AG");
		s6.setColor("yellow");
		s6.setYeonbi("7.9km/L");
		s6.setSafety("����");
		s6.setPrice("65,000,000");
		
		s6.showCarInfo();
				
		System.out.println("=======================");
		Car s7 = new Car();
		s7.setName("����Ｚ QM6");
		s7.setUsed("2018��");
		s7.setCop("����Ｚ�ڵ���");
		s7.setColor("gray");
		s7.setYeonbi("8.9km/L");
		s7.setSafety("����");
		s7.setPrice("48,000,000");
		
		s7.showCarInfo();
		
		
	}

	private static void daelijeom() {
		// TODO Auto-generated method stub
		
	}
}
