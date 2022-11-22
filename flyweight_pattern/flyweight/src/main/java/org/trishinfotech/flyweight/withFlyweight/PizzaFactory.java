package org.trishinfotech.flyweight.withFlyweight;

import java.util.WeakHashMap;

import org.trishinfotech.flyweight.PizzaName;
import org.trishinfotech.flyweight.PizzaAdding;

public class PizzaFactory {

	protected static WeakHashMap<PizzaName, Pizza> pizzaList = new WeakHashMap<PizzaName, Pizza>();
	
	public static Pizza makePizza(PizzaName pizzaName, PizzaAdding pizzaAdding) {
		Pizza pizza = pizzaList.get(pizzaName);
		if (pizza == null) {
			pizza = new Pizza(pizzaName);
			pizzaList.put(pizzaName, pizza);
		}
		System.out.printf("Making '%s' with Pizza Adding '%s'.\n", pizza.getAddingName(),
				pizza.applyPizzaAdding(pizzaAdding));
		return pizza;
	}

	public static int getNumberOfPizza() {
		return pizzaList.size();
	}
	
}
