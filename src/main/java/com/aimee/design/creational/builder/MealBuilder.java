package com.aimee.design.creational.builder;

import com.aimee.design.creational.builder.abs.impl.ChickenBurger;
import com.aimee.design.creational.builder.abs.impl.Coke;
import com.aimee.design.creational.builder.abs.impl.Pepsi;
import com.aimee.design.creational.builder.abs.impl.VegBurger;

public class MealBuilder {

	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}

	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}