package carEx.num1.Car;

public class Car {
	public String daerijeom;
	private String cop;
	private String color;
	private String price;
	private String model;
	public String getCop() {
		return cop;
	}
	public void setCop(String cop) {
		this.cop = cop;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public Car() {
		cop ="���";
		color = "��";
		model = "K7";
		price = "��õ����";
		daerijeom = "���뱸 ������";
	}
	
	public void showCarInfo() {
		System.out.println("������ : " + cop);
		System.out.println("���� : " + color);
		System.out.println("�� : " + model);
		System.out.println("���� : " + price);
		System.out.println("�븮���� : " + daerijeom);
	}
	

}
