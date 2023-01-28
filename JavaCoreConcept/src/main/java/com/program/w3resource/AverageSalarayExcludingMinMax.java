package com.program.w3resource;

public class AverageSalarayExcludingMinMax {
	
	public static void main(String [] agrs)  {
		int[] arr = {10,203,405,44,50,5,1};
		
		
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		
		int min = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum = sum+arr[i];
		}
		
		System.out.println(sum);
		
		int result = sum - (max+min);
		
		System.out.println(result);
		
		 double average = result / (arr.length - 2);
		
		System.out.println(average);
	
		
		
		
	}

}
