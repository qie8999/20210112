package student;

import java.util.Random;

import studentEx.StudentScore;

public class Main {

	public static void main(String[] args) {
		// 4¹ø
		StudentScore sc = new StudentScore();		
		int avg = 0;
		int sum = 0;
		int arr[][]= func();
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
				sum += arr[i][j];
				sc.setSum(sum);
				
			}
//			System.out.print("ÃÑÁ¡ : "+ sum );
			avg = sum/3;			
			sc.setAvg(avg);
//			System.out.print("Æò±Õ : " +avg+ " ");
			//System.out.println();
			
		}
	}
	
	public static int[][] func() {
		Random rand = new Random();
		int arr[][] = new int [5][3]; 
		
		for(int i =0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				
				arr[i][j]=rand.nextInt(101);
//				System.out.print(arr[i][j]+ "	")
			}
//		System.out.println();
			
		}
		return arr;
		
		
	}
	
}
