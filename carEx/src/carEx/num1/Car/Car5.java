package carEx.num1.Car;

public class Car5 {

			public static final String jijim = "동대구영업소";
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
				System.out.println("제조사 : " +cop );
				System.out.println("색상 : " +color);
				System.out.println("이름 : " +model);
				System.out.println("가격 : " +price);
				System.out.println("대리점명 : " +jijim);
				System.out.println("---------------------");
			}

		}

