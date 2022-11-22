package org.trishinfotech.flyweight.withFlyweight;

import org.trishinfotech.flyweight.PizzaName;
import org.trishinfotech.flyweight.PizzaAdding;

public class Order {

	protected Pizza pizza;

	public Order(Pizza pizza) {
		super();
		this.pizza = pizza;
	}

	public static Order of(PizzaName pizzaName, PizzaAdding pizzaAdding, int tableNumber) {
		Pizza pizza = PizzaFactory.makePizza(pizzaName, pizzaAdding);
		System.out.printf("Serving to table '%d'.\n", tableNumber);
		System.out.println("------------------------------------------------------");
		return new Order(pizza);
	}

	public Pizza getPizza() {
		return pizza;
	}

}