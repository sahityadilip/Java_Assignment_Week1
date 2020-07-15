package week1.day2.classroom.arrays;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		System.out.println(data);
		int num ,largest= data[0];
		int length = data.length;
		int[] largearray = new int[length];
		Arrays.sort(data);
		System.out.println(Arrays.toString(data));
		System.out.println(data[data.length-2]);
		

	}

}
