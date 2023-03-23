package com.abstraction;

import java.util.ArrayList;

abstract class Animal {
	private final int legs;
	private String name;

	public abstract String getDiets();
	
	public Animal(int legs, String name) {
		this.legs = legs;
		this.name = name;
	}

	@Override
	public String toString() {
		return name + " has " + legs + " legs ";
	}

}

class Lion extends Animal {
	public Lion() {
		super(4, "Lion");
	}
	
	@Override
	public String getDiets() {
		return "Chicken";
	}
}

class Tiger extends Animal {
	public Tiger() {
		super(4, "Tiger");
	}

	@Override
	public String getDiets() {
	
		return "Deer";
	}
	
	
	
}

class Snack extends Animal {
	public Snack() {
		super(0, "Snack");
	}

	@Override
	public String getDiets() {
		// TODO Auto-generated method stub
		return "Egg";
	}
}

class Deer extends Animal {
	public Deer() {
		super(4, "Deer");
	}
	
	public String getDiets() {
		return "Grass";
	}
}

class Zoo {
	private ArrayList<Animal> animals;
//	private Animals[] animals;
	
	public Zoo(ArrayList<Animal> animals) {
		this.animals = animals;
	}
	
//	public Zoo(Animal[] animals) {
//		this.animals = animals;
//	}
	
	public void printInfo() {
		for(Animal animal: animals) {
			System.out.println(animal.toString());
			System.out.println("Diet :: "+animal.getDiets());
//			if(animal instanceof Deer) {
//				Deer deer = (Deer) animal;
//				System.out.println("Diet: " + deer.getDiets());
//			}
		}
	}
	
	
	
}

public class ZooDemo {

	public static void main(String[] args) {
//		Animal[] animals = new Animal[3];
		
		ArrayList<Animal> list = new ArrayList<>();
		
		list.add(new Tiger());
		list.add(new Lion());
		list.add(new Snack());
		list.add(new Deer());
		
//		animals[0] = new Lion();
//		animals[1] = new Tiger();
//		animals[2] = new Snack();
		
		Zoo zoo = new Zoo(list);
		
		zoo.printInfo();
	}
	
}
