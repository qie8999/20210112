package class0113;

import java.util.Random;

public class StudentMain {

	public static void main(String[] args) {
		// �����԰� Ǭ 04�� �ش�
//		���1.������ ���ο� �޼ҵ尡 ������/public StudentScore()/
//		StudentScore sc = new StudentScore();
//		sc.makeRandom();
//		sc.getHakjum();
//		sc.showHakjum();
//		���2. ������ ���ο� �޼ҵ尡 ��� ����/
		// �ٷ� ������ ������ ��
//		for (int i = 0; i < 5; i++) {
//			new StudentScore();
//		}
//		���3 ������ ���ο� �޼ҵ� 2���� ����
		//public StudentScore()
		//makeRandom();
		//getHakjum();
		StudentScore sc[] = new StudentScore[5];
		//ArrayList��뵵 ����
		for (int i = 0; i < sc.length; i++) {
			sc[i]= new StudentScore(); //<-��ŷ �ʿ�
//			sc[i].showHakjum();
		}
	}

}

class StudentScore{//public�� �ݵ�� ������
	//�Ѹ� ���� ��������
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
		System.out.println("���� : " +kor);
		System.out.println("���� : " +eng);
		System.out.println("���� : " +math);
		System.out.println("���� : " +hap);
		System.out.println("��� : " +avg);
		System.out.println("���� : " +hakjum);
		System.out.println("-------------------");
	}
}
