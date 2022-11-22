package org.trishinfotech.flyweight;

public enum PizzaAdding {

	MUSHROOM("Mushroom"), GARLIC("Garlic"), CAPERS("Capers"), OLIVES("Olives"),
	BACON("Bacon"), ONION("Onion"), PEPPER("Pepper");

	private String name;

	PizzaAdding(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
