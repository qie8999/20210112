package class0113;

public class Car {
	public static final String JIJUM ="���뱸 ������";
	//Ŭ���� �޼ҵ�(���������� ����)
	//��� Ŭ���� ������ �빮��
	//�Ѱ��� ������
	private String model;
	private String company;
	private String color;
	private String price;
	public Car() {//source/construction using field ���� ��üũ
		//��ü���� ����� ���� /�����ڴ� void�� ����
		//�ν��Ͻ� ����
		model ="K7";
		company ="���";
		color ="��";
		price="��õ����";
		//��ü���� �����ڰ� �־�� �ǰ� 
		//�̰��� �⺻������
		//�ٸ� ������ ������ ������ �⺻
	}
	
	//�����ε� /�ߺ�����
	public Car(String model, String company, String color, String price) {
		super();//source/construction using field ���� üũ
		this.model = model;
		this.company = company;
		this.color = color;
		this.price = price;
	}
	public void showCarInfo() { //�ν��Ͻ� �޼ҵ�
		//Ŭ���� ������ �� �� ����
		System.out.println("������: " +Car.JIJUM );
		System.out.println("������: "+ company);
		System.out.println("��: "+ model);		
		System.out.println("����: "+ price);
		System.out.println("����: "+ color);
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	
	

}
