package class0113;

import java.util.Random;

public class NamedataMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Namedata na = new Namedata();
		na.makeRandom();
	}

}

class Namedata {
	private String first[];
	private String mid[];
	private String last[];
	private String fullname;
	
	

	public Namedata() {
		
	}
	public Namedata(String[] first, String[] mid, String[] last, String fullname) {
		this.first=first;
		this.last=last;
		this.mid=mid;
		this.fullname= fullname;
		
	}

	public void makeRandom() {
		int arr[]=new int[50];
		String first[] = { "김", "박", "이", "최", "장" };
		String mid[] = { "가", "나", "다", "라", "마" };
		String last[] = { "바", "사", "아", "자", "차" };
		for (int i = 0; i < arr.length; i++) {
			String fullname = first[(int) (Math.random() * 5)] + mid[(int) (Math.random() * 5)]
					+ last[(int) (Math.random() * 5)];
			System.out.println(fullname);
		}
		

	}

	public void showNamedata() {
		System.out.println(fullname);
	}

}