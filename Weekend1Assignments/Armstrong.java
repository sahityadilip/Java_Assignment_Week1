package Weekend1Assignments;

public class Armstrong {
	
	public void ArmstrongOrNot()
	{
		
		int num = 153,result = 0,numcheck =num,mod = 1;
		
		while(num>0)
		{	
			mod = num%10;
			result = result + ((mod)*(mod)*(mod));
			System.out.println(result);
			num = num /10;
		}
		
		if (result == numcheck)
		{
			System.out.println("It is an Armstrong Number");
			
		}
		else
		{
			
			System.out.println("It is not an Armstrong Number");
			
		}
		
	}
	
	

	public static void main(String[] args) {
		
Armstrong A = new Armstrong();
A.ArmstrongOrNot();
	}

}
