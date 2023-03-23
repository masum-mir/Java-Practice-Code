package com.abstraction;

interface Payment{
	double getAmount();
}

class PaymentEngine {
	
	public void accept(Payment payment) {
		System.out.println("Accepting payment:: "+ payment.getAmount());
	}
	
}

class BikashPayment implements Payment {
	
	private final double amount;
	
	public BikashPayment(double amount) {
		this.amount = amount;
	}

	@Override
	public double getAmount() {
		System.out.println("Taking bikash payment");
		return amount;
	}
	
}

class CashPayment implements Payment {
	private final double amount;
	
	public CashPayment(double amount) {
		this.amount = amount;
	}
	
	@Override
	public double getAmount() {
		System.out.println("Taking cash payment");
		return amount;
	}
	
}
public class PaymentEngineDemi {

	public static void main(String[] args) {
		PaymentEngine paymentEngine = new PaymentEngine();
		
		BikashPayment bikashPayment = new BikashPayment(100);
		paymentEngine.accept(bikashPayment);
		
		CashPayment cashPayment = new CashPayment(150);
		paymentEngine.accept(cashPayment);
		
	}
	
}
