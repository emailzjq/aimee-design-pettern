package com.aimee.design.creational.abstractfactory.impl;

import com.aimee.design.creational.abstractfactory.Color;

public class Blue implements Color {

	@Override
	public void fill() {
		System.out.println("Inside Blue::fill() method.");
	}
}