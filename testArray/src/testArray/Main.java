package testArray;

import testArray.array.Testarray;

public class Main {
	//3��
	public static void main(String[] args) {
		Testarray testar = new Testarray();
		int arr[] = {20, 34, 22, 14, 36, 23, 67, 25, 99, 88};
		int sum = 0;
		int avg = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			sum += arr[i];			
			avg = sum/arr.length;
		}
//		System.out.println("�հ�: " + sum);
//		System.out.println("���: " + avg);
				
		testar.setSum(sum);
		testar.setAvg(avg);
		
		testar.showTestarray();
		
		
	}
	
	
}
