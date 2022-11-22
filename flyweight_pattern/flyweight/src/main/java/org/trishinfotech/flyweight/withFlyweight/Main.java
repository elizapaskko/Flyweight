package org.trishinfotech.flyweight.withFlyweight;

import org.trishinfotech.flyweight.PizzaName;
import org.trishinfotech.flyweight.PizzaAdding;

public class Main {
	public static void main(String[] args) {
		PizzaPlace shop = new PizzaPlace();
		shop.takeOrder(PizzaName.CHEESE, PizzaAdding.OLIVES, 5);
		shop.takeOrder(PizzaName.MEAT, PizzaAdding.CAPERS, 7);
		shop.takeOrder(PizzaName.VEGGIE, PizzaAdding.BACON, 1);
		shop.takeOrder(PizzaName.BBQ, PizzaAdding.MUSHROOM, 3);
		shop.takeOrder(PizzaName.CHEESE, PizzaAdding.PEPPER, 2);
		shop.takeOrder(PizzaName.VEGGIE, PizzaAdding.BACON, 8);
		shop.takeOrder(PizzaName.MEAT, PizzaAdding.OLIVES, 4);
		shop.takeOrder(PizzaName.CHEESE, PizzaAdding.MUSHROOM, 10);
		shop.takeOrder(PizzaName.BBQ, PizzaAdding.GARLIC, 6);
		shop.takeOrder(PizzaName.PEPPERONI, PizzaAdding.MUSHROOM, 9);

		System.out.println("------------------------------------------------------------");
		System.out.println("Number of Order Objects: " + PizzaPlace.getNumberOfOrders());
		System.out.println("Number of Pizza Objects: " + PizzaFactory.getNumberOfPizza());
	}
}