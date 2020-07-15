package week1.day2.classroom.arrays;

public class PrintDuplicatesInArray {
	
	
	
	
	
	
	public static void main(String[] args)
	{
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int length1 = arr.length;
		int result = 0;
		
		for (int i =0;i<=length1-2;i++)
		{
			
			
			for (int j=i+1;j<=length1-1;j++)
				
			{
				if (arr[i] == arr[j])
					
				{
					
					result= arr[i];
					System.out.println(result);
					
				}
					
					
				}
				
				
				
			}
			  
		
		
		
	}

}
