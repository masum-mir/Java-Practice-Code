package com.abstraction;

abstract class AbstractProduct {
	private final String name;
	private final int price;
	private final int discount;

	public AbstractProduct(String name, int price, int discount) {
		this.name = name;
		this.price = price;
		this.discount = discount;
	}

	public abstract int calculatePrice();

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getDiscount() {
		return discount;
	}

}

class DigitalProduct extends AbstractProduct {
	private static final String JAVA_25 = "JAVA25";
	private static final String JAVA_2NDED = "JAVA2NDED";

	private String coupon;

	public DigitalProduct(String name, int price, int discount, String coupon) {
		super(name, price, discount);
		this.coupon = coupon;
	}

	@Override
	public int calculatePrice() {

		int couponDiscount = switch (coupon != null ? coupon : " ") {
		case JAVA_25 -> 3;
		case JAVA_2NDED -> 5;
		default -> 0;
		};

		int totalDiscount = getDiscount() + couponDiscount;
		double price = getPrice() * ((100 - totalDiscount) / 100.0);

		return (int) price;

	}
}

class NonDigitalProduct extends AbstractProduct {
	public static final int SHIPPING_RATE = 5;
	public static final double DIMENSION_CHARGE = 1.5;

	private final int weight;
	private final Dimension dimension;
	
	
	

}

public class Demo {
	public static  void main(String[] arhs) {
		
	}
}
