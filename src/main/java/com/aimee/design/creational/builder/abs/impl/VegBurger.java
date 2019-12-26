package com.aimee.design.creational.builder.abs.impl;

import com.aimee.design.creational.builder.abs.Burger;

public class VegBurger extends Burger {

	@Override
	public float price() {
		return 25.0f;
	}

	@Override
	public String name() {
		return "Veg Burger";
	}
}