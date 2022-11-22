package org.trishinfotech.flyweight;

public enum PizzaName {

	CHEESE("Cheese Pizza"), VEGGIE("Veggie Pizza"), PEPPERONI("Pepperoni Pizza"), MEAT("Meat Pizza"), BBQ("BBQ Pizza");

	private String name;

	PizzaName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
