package class0113;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class NamedataMain2 {
	private String first[];
	private String mid[];
	private String last[];
	private String fullname;

	public NamedataMain2() {
		//makeRandom();
		//showNamedata();
	}

	public NamedataMain2(String[] first, String[] mid, String[] last, String fullname) {
		this.first = first;
		this.last = last;
		this.mid = mid;
		this.fullname = fullname;

	}

	public String[] makeRandom() {
		String arr[] = new String[50];
		String first[] = { "김", "박", "이", "최", "장" };
		String mid[] = { "가", "나", "다", "라", "마" };
		String last[] = { "바", "사", "아", "자", "차" };
		for (int i = 0; i < arr.length; i++) {
			arr[i] = first[(int) (Math.random() * 5)] + mid[(int) (Math.random() * 5)]
					+ last[(int) (Math.random() * 5)];
			//System.out.println("arr[i]: " + arr[i]);

		}
		return arr;

	}

	public void showNamedata() {
		makeRandom();
	}

}
	
	
