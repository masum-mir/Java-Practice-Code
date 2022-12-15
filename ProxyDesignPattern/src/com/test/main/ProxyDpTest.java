package com.test.main;

import com.test.component.DarazService;
import com.test.component.DarazServiceImpl;
import com.test.factory.EcommerceFactory;
import com.test.proxy.DarazServiceProxy;

public class ProxyDpTest {
	
	public static void main(String[] args) {
		
		DarazService service = null;
		
		String couponCode = "code10";
		
		service = EcommerceFactory.getData(couponCode);
		
		System.out.println(service);
		
		System.out.println("Real or proxy class =" + service.getClass());
		
		float bill = service.buyNow(new String[] {"Laptop","Mobile"}, new float[] {50.0f,50.0f});
		System.out.println(bill);
		
	}

}
