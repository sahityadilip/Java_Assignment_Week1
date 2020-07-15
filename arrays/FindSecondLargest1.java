package week1.day2.classroom.arrays;

public class FindSecondLargest1 {
	
	
	public static void main(String[] args) {
		
			
	
	int[] data1 = {19,1,3,15,0,11,1};
	int length1 = data1.length;
	int num3,num2,num1;
	
	for (int i =0;i<=length1-2;i++)
	{
		
		
		for (int j=i+1;j<=length1-1;j++)
			
		{
			if (data1[i]>data1[j])
			{
				int rev = data1[i];
				data1[i] = data1[j];
				data1[j] = rev;
				
				
				
			}
			
			
			
		}
		
		
		
		
	}
	
	System.out.println(data1[length1-2]);
	
	
	
		
		
	}
	
	

}

