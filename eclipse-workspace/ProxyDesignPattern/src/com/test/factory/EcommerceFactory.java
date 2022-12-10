package com.test.factory;

import com.test.component.DarazService;
import com.test.component.DarazServiceImpl;
import com.test.proxy.DarazServiceProxy;

public class EcommerceFactory {
	
	//getInstance method = it will give the either proxy or real object;
	
	public static DarazService getData(String couponCode) {
		if(couponCode.equals("") || couponCode.trim().length()==0) {
			return new DarazServiceImpl();
		} else {
			if(couponCode.equalsIgnoreCase("code20")) {
				return new DarazServiceProxy(20);
			} else if(couponCode.equalsIgnoreCase("code10")){
				return new DarazServiceProxy(10);
			} else {
				return new DarazServiceImpl();
			}
		}
	}

}
