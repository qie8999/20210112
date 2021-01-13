package class0113;

import java.util.Random;

public class StudentMain {

	public static void main(String[] args) {
		// 선생님과 푼 04번 해답
//		방법1.생성자 내부에 메소드가 없을때/public StudentScore()/
//		StudentScore sc = new StudentScore();
//		sc.makeRandom();
//		sc.getHakjum();
//		sc.showHakjum();
//		방법2. 생성자 내부에 메소드가 모두 존재/
		// 바로 루프만 돌려도 됨
//		for (int i = 0; i < 5; i++) {
//			new StudentScore();
//		}
//		방법3 생성자 내부에 메소드 2개만 존재
		//public StudentScore()
		//makeRandom();
		//getHakjum();
		StudentScore sc[] = new StudentScore[5];
		//ArrayList사용도 가능
		for (int i = 0; i < sc.length; i++) {
			sc[i]= new StudentScore(); //<-마킹 필요
//			sc[i].showHakjum();
		}
	}

}

class StudentScore{//public은 반드시 떼야함
	//한명에 대한 점수정보
	private int kor;
	private int eng;
	private int math;
	private int hap;
	private int avg;
	private char hakjum;
	
	
	
	public StudentScore() {
		makeRandom();
		getHakjum();
		showHakjum();
	}
	public void makeRandom() {
		Random r = new Random();
		kor=r.nextInt(101);
		eng=r.nextInt(101);
		math=r.nextInt(101);
		hap = kor + eng + math;
		avg = hap/3;
		
//		getHakjum();
//		showHakjum();
	
	}
	public char getHakjum() {
		if(avg <=100 && avg >=90) {
			hakjum = 'A';			
		}else if(avg <=89 && avg >=80) {
			hakjum = 'B';			
		}else if(avg <=79 && avg >=70) {
			hakjum = 'C';			
		}else if(avg <=69 && avg >=60) {
			hakjum = 'D';			
		}else {
			hakjum = 'F';
		}
		return hakjum;
	}
	public void showHakjum() {
		System.out.println("국어 : " +kor);
		System.out.println("영어 : " +eng);
		System.out.println("수학 : " +math);
		System.out.println("총점 : " +hap);
		System.out.println("평균 : " +avg);
		System.out.println("학점 : " +hakjum);
		System.out.println("-------------------");
	}
}
