package carEx.num1.Car;

public class Car2 {

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
		
		public Car2() {
			cop ="기아";
			color = "블랙";
			model = "K7";
			price = "사천만원";
			daerijeom = "동대구 영업소";
		}
		
		public void showCarInfo2() {
			System.out.println("제조사 : " + cop);
			System.out.println("색상 : " + color);
			System.out.println("모델 : " + model);
			System.out.println("가격 : " + price);
			System.out.println("대리점명 : " + daerijeom);
		}
		

	}
