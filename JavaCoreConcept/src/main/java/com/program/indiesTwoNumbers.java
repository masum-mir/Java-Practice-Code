package com.program;

public class indiesTwoNumbers {
	
	public static int[] sum(int nums[], int target) {
		
//		for(int dex = 0; dex < nums.length; dex++){
//            int num = target - nums[dex];
//            for(int i = 0; i < nums.length; i++ ){
//                if(num == nums[i] && i != dex){
//                    if(nums[dex] + nums[i] == target){
//                        int[] code = new int[]{dex, i};
//                        System.out.println(code);
//                        return code;
//                    }
//                    
//                }
//            }
//        }
//        return nums;
		
		
		for(int i = 0; i<nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				if(nums[i] + nums[j] == target) {
					int []k = new int[] {i,j};
					return k;
				}
			}
		}
		return nums;
		
	}

	
	public static void main(String[] args) {
		int nums[] = {2,7,11,15};
		int target = 9;
		
		indiesTwoNumbers.sum(nums, target);
//		System.out.println(indiesTwoNumbers.sum);
	}

}
