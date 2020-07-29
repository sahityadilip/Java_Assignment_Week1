package week3.classroom2;

import java.util.ArrayList;
import java.util.List;

public class Assignment3 {
	
	/*
	 * Pseudo code 
	 
	 * a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";		
	 * b) Initialize an integer variable as count	  
	 * c) Split the String into array and iterate over it 
	 * d) Initialize another loop to check whether the word is there in the array
	 * e) if it is available then increase and count by 1. 
	 * f) if the count > 1 then replace the word as "" 
	 
	 * g)Displaying the String without duplicate words	
	 * h) print the each word
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		
		String text = "We learn java basics as part of java sessions in java week1";	
		
		String[] splitStrings = text.split(" ");
		int size = splitStrings.length;
		for(int i = 0;i<=size-2;i++)
		{
			System.out.println(splitStrings[i]);
			for(int j =i+1;j<=size-1;j++)
			{
				System.out.println(splitStrings[j]);
				
				if(splitStrings[i].equals(splitStrings[j]))
				{
					System.out.println(splitStrings[i]+ "------------" + splitStrings[j]  );
					splitStrings[j] = "";
					
				}
			}
			
		}
		
		System.out.println(splitStrings.length);
		int length1 = splitStrings.length;
		
		for(int k = 0;k<length1;k++)
		{
			
			
			System.out.println(splitStrings[k]);
		}
		
		
			
			
		}
		
		
		
		

	}

