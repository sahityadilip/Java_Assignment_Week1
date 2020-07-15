package Weekend1Assignments;

import week1.day2.PrimeOrNot;

public class Prime {
	public void PrimeOrNot()
	{
		int i,num = 14,flag = 0;
		for (i = 1;i <=num;i++)
		{
			if (num%i==0)
			{
				
				flag = flag + 1;
			}
			
		}
		
		if (flag == 2)
		System.out.println("Prime");
		
		else
			System.out.println("Not a Prime");
	}
	
	
	public static void main(String[] args) {
		Prime P = new Prime();
		P.PrimeOrNot();

	}

}
