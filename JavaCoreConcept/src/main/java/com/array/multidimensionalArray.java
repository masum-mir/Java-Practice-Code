package com.array;

public class multidimensionalArray {
	
	public static void main(String ...st ) {
		
		int [][]arr = {{20,30,40},{1,2,3}};
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr.length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
		
		
		// jagged array ..!
		System.out.println("______________________");
		int arr2[][] = new int[4][];
		arr2[0]=new int[2];
		arr2[1] = new int[4];
		arr2[2] = new int[3];
		arr2[3] = new int[5];
		
		int count=0;
		
		for(int i =0 ;i<arr2.length;i++) {
			for(int j=0; j<arr2[i].length; j++) {
				arr2[i][j]=count++;
			}
		}
		
		for(int i=0;i<arr2.length;i++) {
			for(int j=0; j<arr2[i].length;j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println(arr.getClass().getName());
		
		
		//cloning
		
		int[] arr3 = {10,20,30};
		
		for(int i: arr3) {
			System.out.print(i + " ");
		}
		System.out.println("\n+++++++++++++++++++++");
		int []arr4 = arr3.clone();
		
		for(int i:arr4) {
			System.out.print(i + " ");
		}
		
		System.out.println("Two are same : " +(arr3==arr4));
		
	}

}
