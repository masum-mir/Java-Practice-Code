package com.program.javatpoint;

public class FrequencyEachElementArray {
	public static void main(String[] args) {
		
		int arr1[] = new int[] {1,2,3,4,5,6,23,454,2,3,4,1,1,1,1};
		int arr2[] = new int[arr1.length];
		
		
		int visited = -1;
		
		for(int i=0; i<arr1.length; i++) {
			int count = 1;
			for(int j=0; j<arr1.length; j++) {
				if(arr1[i] == arr1[j]) {
					count ++;
					
					arr2[j] = visited;
				}
			}
			if(arr2[i] != visited) {
				arr2[i] = count;
			}
		}
		
		for(int i=0; i<arr2.length;i++) {
			if(arr2[i] != visited) {
				System.out.print(arr1[i] + " || " + arr2[i]);
			}
		}
		
	}

}
