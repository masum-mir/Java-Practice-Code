package com.test.component;

public class DarazServiceImpl  implements DarazService{

	@Override
	public float buyNow(String[] items, float[] prices) {


		float bill = 0 ;
		
		for(float p:prices) {
			bill = bill + p;
		}
		
		
		return bill;
	}
	
	

}
