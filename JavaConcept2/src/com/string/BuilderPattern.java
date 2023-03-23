package com.string;

import java.util.ArrayList;
import java.util.List;

// Create an interface Item representing food item and packing.
interface Item{
	public  String name();
	public Packing packing();
	public float price();
}

interface Packing {
	public String pack();
}

// Create concrete classes implementing the Packing interface.
class Wrapper implements Packing {

	@Override
	public String pack() {
		return "wrapper";
	}
	
}

class Bottle implements Packing {

	@Override
	public String pack() {
		return "bottle";
	}
	
}

// Create abstract classes implementing the item interface providing default functionalities.

abstract class Burger implements Item {
	
	public Packing packing() {
		return new Wrapper();
	}
	
	public abstract float price();
}

abstract class ColdDrink implements Item {
	public Packing packing() {
		return new Bottle();
	}
	
	public abstract float price();
}

//Create concrete classes extending Burger and ColdDrink classes
class VegBurger extends Burger {

	@Override
	public String name() {
		return "Veg Burger";
	}

	@Override
	public float price() {
		return 50.5f;
	}
	
}

class ChickenBuger extends Burger {
	@Override 
	public String name() {
		return "Chicken Buger";
	}
	
	@Override 
	public float price() {
		return 49.33f;
	}
}

class Cock extends ColdDrink {
	@Override 
	public String name() {
		return "cock";
	}
	
	@Override 
	public float price() {
		return 25f;
	}
}

class Pepsi extends ColdDrink {
	@Override
	public String name() {
		return "Pepsi";
	}
	
	@Override 
	public float price() {
		return 30.5f;
	}
}

// Create a Meal class having Item objects defined above.
class Meal {
	private List<Item> items = new ArrayList<>();
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public float getCost() {
		float cost = 0.0f;
		for(Item item: items) {
			cost += item.price();
		}
		return cost;
	}
	

	public void showItems() {
		for(Item item : items) {
			System.out.print("Item : "+item.name() + " ");
			System.out.print(", Packing : "+item.packing().pack() + " ");
			System.out.print(", Price : "+item.price() + " ");
		}
	}
}

// Create a MealBuilder class, the actual builder class responsible to create Meal objects.
class MealBuilder {
	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Cock());
		return meal;
	}
	
	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBuger());
		meal.addItem(new Pepsi());
		return meal;
	}
}

// BuiderPatternDemo uses MealBuider to demonstrate builder pattern.

public class BuilderPattern {
//	DocumentBuilder
//	StringBuilder

	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();
		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("VEG MEAL ::: ");
		vegMeal.showItems();
		System.out.println("Total Cost :: "+vegMeal.getCost());
		
		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("\n\nNon-Veg Meal ::: ");
		nonVegMeal.showItems();
		System.out.println("Total Cost :: "+nonVegMeal.getCost());

	}
	
}
