package class0106_2;

public class Car {
	private String name;
	private String used;
	private String cop;
	private String color;
	private String yeonbi;
	private String safety;
	private String price;
	static String daelijeom= "서울 광화문점";

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
		System.out.println("차종 : " + name);
		System.out.println("연식 : " + used);
		System.out.println("제조회사 : " + cop);
		System.out.println("색상 : " + color);
		System.out.println("연비 : " + yeonbi);
		System.out.println("사고유무 : " + safety);
		System.out.println("가격 : " + price);
		System.out.println("대리점명 : "+Car.daelijeom);
	}

	public static void main(String[] args) {
		Car s = new Car();
		s.setName("아우디 A8 6.0~12 실린더");
		s.setUsed("2010년");
		s.setCop("Audi Korea");
		s.setColor("gray");
		s.setYeonbi("6.9km/L");
		s.setPrice("140,000,000");
		
		
		
		s.setSafety("없음");
		
		s.showCarInfo();
		System.out.println("=======================");
		Car s2 = new Car();
		s2.setName("벤츠 S 500 L");
		s2.setUsed("2011년");
		s2.setCop("Mercedes-Benz");
		s2.setColor("black");
		s2.setYeonbi("6.9km/L");
		s2.setSafety("없음");
		s2.setPrice("133,000,000");
		
		s2.showCarInfo();
		
		System.out.println("=======================");
		Car s3 = new Car();
		s3.setName("롤스로이스 드롭헤드 구페");
		s3.setUsed("2015년");
		s3.setCop("Rolls-Royce Motor Cars");
		s3.setColor("blue");
		s3.setYeonbi("6.4km/L");
		s3.setSafety("한번(범퍼 교체)");
		s3.setPrice("110,000,000");
		
		s3.showCarInfo();
		
		System.out.println("=======================");
		Car s4 = new Car();
		s4.setName("현대 에쿠스 JS380");
		s4.setUsed("2011년");
		s4.setCop("hyundai");
		s4.setColor("white");
		s4.setYeonbi("7.9km/L");
		s4.setSafety("한번(일부침수)");
		s4.setPrice("54,000,000");
		
		s4.showCarInfo();
		
		System.out.println("=======================");
		Car s5 = new Car();
		s5.setName("미니 쿠퍼 S");
		s5.setUsed("2012년");
		s5.setCop("MINI korea");
		s5.setColor("red");
		s5.setYeonbi("12.1km/L");
		s5.setSafety("없음");
		s5.setPrice("33,000,000");
		
		s5.showCarInfo();
		
		System.out.println("=======================");
		Car s6 = new Car();
		s6.setName("포르셰 911 타르가 4");
		s6.setUsed("2013년");
		s6.setCop("포르쉐코리아 - Porsche AG");
		s6.setColor("yellow");
		s6.setYeonbi("7.9km/L");
		s6.setSafety("없음");
		s6.setPrice("65,000,000");
		
		s6.showCarInfo();
				
		System.out.println("=======================");
		Car s7 = new Car();
		s7.setName("르노삼성 QM6");
		s7.setUsed("2018년");
		s7.setCop("르노삼성자동차");
		s7.setColor("gray");
		s7.setYeonbi("8.9km/L");
		s7.setSafety("없음");
		s7.setPrice("48,000,000");
		
		s7.showCarInfo();
		
		
	}

	private static void daelijeom() {
		// TODO Auto-generated method stub
		
	}
}
