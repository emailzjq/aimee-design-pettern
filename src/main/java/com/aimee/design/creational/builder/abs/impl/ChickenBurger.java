package com.aimee.design.creational.builder.abs.impl;

import com.aimee.design.creational.builder.abs.Burger;

public class ChickenBurger extends Burger {

	@Override
	public float price() {
		return 50.5f;
	}

	@Override
	public String name() {
		return "Chicken Burger";
	}
}