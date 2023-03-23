package com.abstraction;

import java.util.ArrayList;

class Client {
	private final String name;
	private final int hoursWorked;
	
	public Client(String name, int hoursWorked) {
		this.name = name;
		this.hoursWorked = hoursWorked;
	}
	
	public String getName() {
		return name;
	}
	
	public int getHoursWorked() {
		return hoursWorked;
	}
	
}

abstract class PayCalculator {
	
	public abstract double getPay(Client client);
	
//	private static final double HOURLY_RATE = 70;
//	
//	private static final double FIXED_PAY = 550;
//	
////	public double getpay(Client client) {
////		return client.getHoursWorked() * HOURLY_RATE;
////	}
//	
//	public double getPay(Client client, String method) {
//		return switch(method) {
//		case "HOURLY" -> (client.getHoursWorked() * HOURLY_RATE); 
//		case "FIEXD" -> FIXED_PAY; 
//		default -> throw new IllegalArgumentException("Unknown method: " + method);
//		};
//	}
	
	
}

class HourlyPayCalculator extends PayCalculator {
	
	private  final double hourlyRate;
	
	public HourlyPayCalculator(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	@Override
	public double getPay(Client client) {
		
		return hourlyRate * client.getHoursWorked();
	}
	
}

class FixedPayCalculator extends PayCalculator {
	private final double fixedPay;
	
	public FixedPayCalculator(double fixedPay) {
		this.fixedPay = fixedPay;
	}
	
	@Override
	public double getPay(Client client) {
		return fixedPay;
	}
	
}

class HrManager {
	private final ArrayList<Client> clients = new ArrayList<>();
	private PayCalculator payCalculator;
	
	public HrManager(PayCalculator payCalculator) {
		this.payCalculator = payCalculator;
	}
	
	
	public void addClient(Client client) {
		clients.add(client);
	}
	
	public double getTotalPay() {
		double total = 0.0;
		
		for(Client client: clients) {
			total += payCalculator.getPay(client);
		}
		return total;
		
	}
	
}

public class CalculateClientSalary {

	public static void main(String[] ars) {
		
//		PayCalculator calculator = new HourlyPayCalculator(75);
		
		PayCalculator c = new FixedPayCalculator(50);
		
//		HrManager hrManager = new HrManager(calculator);
		HrManager hrManager2 = new HrManager(c);
		
		Client client1 = new Client("Masum", 550);
		hrManager2.addClient(client1);
		
		Client client2 = new Client("Buri", 550);
		hrManager2.addClient(client2);
		
//		double hourlyTotalPay = hrManager.getTotalPay();
//		System.out.println("Hourly total pay :: " + hourlyTotalPay);
		
		double fixedPay =   hrManager2.getTotalPay();
		
		System.out.println("Fixed pay :: " + fixedPay);
		
		
//		double getTotalFixedPay = hrManager.getTotalPay("FIXED");
//		System.out.println("Get Total Fixed Pay :: "+getTotalFixedPay);
//		
//		double hourlyTotalPay = hrManager.getTotalPay("HOURLY");
//		System.out.println("Hourly Total Pay :: "+hourlyTotalPay);
		
		
	}
	
}
