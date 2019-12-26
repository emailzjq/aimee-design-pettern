package com.aimee.design.creational.factory.impl;

import com.aimee.design.creational.factory.Shape;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}
}
