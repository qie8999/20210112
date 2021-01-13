package class0113;

public class ArrayMain {

	public static void main(String[] args) {
		// �����԰� Ǫ�� 03�� �ش�
		int arr[]= {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		ArrayHap hap = new ArrayHap(arr);
		new ArrayHap(arr);
		
		System.out.println("�迭�� �� : " + hap.getSum());
		System.out.println("�迭�� ��� : "+ hap.getAvg());
	}

}

class ArrayHap{
	private int sum;
	private int avg;
	
	public ArrayHap(int arr[]) {
		for(int i : arr) {
			sum += i;
		}
		avg = sum / arr.length;
//		System.out.println("�迭�� �� : " +sum);
//		System.out.println("�迭�� ��� : "+avg);
	}
	public int getSum() {
		return sum;
	}
	public int getAvg() {
		return avg;
	}
	
	
}