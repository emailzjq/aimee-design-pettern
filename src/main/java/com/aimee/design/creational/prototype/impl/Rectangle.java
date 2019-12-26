package com.aimee.design.creational.prototype.impl;

import com.aimee.design.creational.prototype.Shape;

public class Rectangle extends Shape {

	public Rectangle() {
		type = "Rectangle";
	}

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
}