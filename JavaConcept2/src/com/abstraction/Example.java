package com.abstraction;

import java.util.ArrayList;
import java.util.List;

interface Packing {
	public String pack();
	public int price();
}

abstract class CD implements Packing {
	public abstract String pack();
}

abstract class Company extends CD {
	public abstract int price();
}

class Sony extends Company {

	@Override
	public int price() {
		return 1023;
	}

	@Override
	public String pack() {
		return "Sony CD";
	}
	
}

class Samsung extends Company {
	
	@Override 
	public int price() {
		return 10202;
	}
	
	@Override 
	public String pack() {
		return "Samsung CD";
	}
	
}

class CDType {
	
	List<Packing> lists = new ArrayList<>();
	
	public void addItems(Packing packs) {
		lists.add(packs);
	}
	
	public void getCost() {
		for(Packing pack: lists) {
			pack.price();
		}
	}
	
	public void showItems() {
		for(Packing pack: lists) {
			System.out.println("Pack:: "+pack.pack());
			System.out.println("Price:: "+pack.price());
		}
	}
	
}

class CDBuilder {
	public CDType buildSony() {
		
		CDType c = new CDType();
			c.addItems(new Sony());
		return c;
	}
}


public class Example {
	
	public static void main(String[] args) {
		CDBuilder cdb = new CDBuilder();
		
		CDType c1 = cdb.buildSony();
		c1.showItems();
	}

}
