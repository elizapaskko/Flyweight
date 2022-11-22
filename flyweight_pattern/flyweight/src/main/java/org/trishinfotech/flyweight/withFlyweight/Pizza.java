package org.trishinfotech.flyweight.withFlyweight;

import org.trishinfotech.flyweight.PizzaName;
import org.trishinfotech.flyweight.PizzaAdding;

public class Pizza {

	protected final PizzaName pizzaName; // intrinsic attribute

	protected Pizza(PizzaName pizzaName) {
		super();
		this.pizzaName = pizzaName;
	}

	public PizzaName getAddingName() {
		return pizzaName;
	}

	protected PizzaAdding applyPizzaAdding(PizzaAdding pizzaAdding) {
		// PizzaAdding pizzaAdding will be act as extrinsic attribute
		// So, that will be required in creating and processing of Pizza object as
		// method parameters and will not be stored as class members.
		return pizzaAdding;
	}

}