package org.trishinfotech.flyweight.withFlyweight;

import java.util.ArrayList;

import org.trishinfotech.flyweight.PizzaName;
import org.trishinfotech.flyweight.PizzaAdding;

public class PizzaPlace {
	
	private static final ArrayList<Order> orders = new ArrayList<>();

	public void takeOrder(PizzaName pizzaName, PizzaAdding pizzaAdding, int tableNumber) {
		orders.add(Order.of(pizzaName, pizzaAdding, tableNumber));
	}

	public static int getNumberOfOrders() {
		return orders.size();
	}

}