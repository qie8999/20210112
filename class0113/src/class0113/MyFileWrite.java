package class0113;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

class MyFileWrite {

	public static void main(String[] args) {
		System.out.println("main 시작");
		makeFile();
		readFile();
	}
	
	public static void makeFile() {
		NamedataMain2 na = new NamedataMain2();
		String fullname[] = na.makeRandom();
		String str = "/";
		System.out.println("fullname[0]: " + fullname[0]);
		FileOutputStream out;
		try {
			String filename="d:/data/name.txt";
			out = new FileOutputStream(filename);
			for (int i=0; i<fullname.length; i++) {
				out.write(fullname[i].getBytes());
			out.write("/".getBytes());
			
			}
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}
//		StringTokenizer txt = new StringTokenizer()
		System.out.println("---파일이 생성되었습니다----");
		
	}

	public static void readFile() {
		BufferedReader br = null;
		try {
			String filename;
			br = new BufferedReader
					(new FileReader(new File("d:/data/name.txt")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			String str = br.readLine();
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("--파일을 읽었습니다--");
	}
	public static void token () {
		StringTokenizer st = new StringTokenizer("홍길동/김길동","/");
		while(st.hasMoreTokens()) {
			String temp =st.nextToken();
			System.out.println(temp);
		}
		System.out.println("---/ 제거했습니다---");
	}

}
