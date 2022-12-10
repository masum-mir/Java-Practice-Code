package com.test.proxy;

import com.test.component.DarazService;
import com.test.component.DarazServiceImpl;

public class DarazServiceProxy implements DarazService{
	
	private DarazService darazService;
	
	float discount = 0;
	
	public DarazServiceProxy(float discount) {
		
		darazService = new DarazServiceImpl();
		
		this.discount = discount;
		
	}
	

	@Override
	public float buyNow(String[] items, float[] prices) {


		float billAmt = 0;
		float finalBillAfterDiscount = 0;
		
		for(float p: prices) {
			billAmt = billAmt + p;
		}
		
		finalBillAfterDiscount = (billAmt - (billAmt*discount/100));
		
		return finalBillAfterDiscount;
		
		
	}

	
	
}
