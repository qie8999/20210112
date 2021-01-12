package testArray.array;

public class Testarray { //3¹ø
	private static int sum;
	private static int avg;

	public Testarray() {
		sum =0;
		avg =0;

	}
	public Testarray(int sum, int avg) {
		this.sum = sum;
		this.avg = avg;
	}
	
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getAvg() {
		return avg;
	}
	public void setAvg(int avg) {
		this.avg = avg;
	}
	
	public void showTestarray() {
		System.out.println("ÇÕ°è : " +sum);
		System.out.println("Æò±Õ : " +avg);
	}
	
	

}
