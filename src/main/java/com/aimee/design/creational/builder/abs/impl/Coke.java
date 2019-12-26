package com.aimee.design.creational.builder.abs.impl;

import com.aimee.design.creational.builder.abs.ColdDrink;

public class Coke extends ColdDrink {

	@Override
	public float price() {
		return 30.0f;
	}

	@Override
	public String name() {
		return "Coke";
	}
}