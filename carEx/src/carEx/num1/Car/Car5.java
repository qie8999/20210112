package carEx.num1.Car;

public class Car5 {

			public static final String jijim = "���뱸������";
			private String cop;
			private String color;
			private String price;
			private String model;
			
			public Car5() {
				
			}
			public Car5(String cop, String color, 
					String price, String model) {
				super();
				this.model=model;
				this.cop=cop;
				this.color=color;
				this.price=color;
			}
			
			
			
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
			public void showCarInfo5() {
				System.out.println("������ : " +cop );
				System.out.println("���� : " +color);
				System.out.println("�̸� : " +model);
				System.out.println("���� : " +price);
				System.out.println("�븮���� : " +jijim);
				System.out.println("---------------------");
			}

		}

