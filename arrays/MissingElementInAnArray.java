package week1.day2.classroom.arrays;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		int length1 = arr.length,j=0;
		
		Arrays.sort(arr);
		Arrays.toString(arr);
		
		for (int i =0;i<=length1-1;i++)
		{
			
			j = i+1;
			if (arr[i] != j)
			{
				break;
				
			}
			
		
			
		}
		System.out.println(j);
	}

}
