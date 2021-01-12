package studentEx;

//4번
public class StudentScore {
	private int sum;
	private int avg;
	


	public StudentScore() {
		sum =0;
		avg =0;
	}
	public StudentScore(int sum, int avg) {
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

//	if(avg>=90&&avg<=100)
//
//	{
//		System.out.println("A학점");
//	}else if(avg>=80&&avg<=89)
//	{
//		System.out.println("B학점");
//	}else if(avg>=70&&avg<=79)
//	{
//		System.out.println("C학점");
//	}else if(avg>=60&&avg<=69)
//	{
//		System.out.println("D학점");
//	}else if(avg>=50&&avg<=59)
//	{
//		System.out.println("E학점");
//	}else if(avg>=0&&avg<=49)
//	{
//		System.out.println("F학점");
//	}sum=avg=0;

	public void showStudentScore() {
		System.out.println(sum);
	}
}
