package Weekend1Assignments;

public class FibonacciSeries {
	
	
	public void fibonacci()
	{
		int num1 = 0,num2=1,sum=0,limit=8,count=2;
		
		
		System.out.println(num1);
		System.out.println(num2);
		
		for(count = 3;count<=limit;count++)
		{
			
			sum = num1 + num2;
			System.out.println(sum);
			num1 = num2;
			num2 = sum;
			
			
		}
		
		
		
	}

	public static void main(String[] args) {
		FibonacciSeries F = new FibonacciSeries();
		F.fibonacci();

	}

}
