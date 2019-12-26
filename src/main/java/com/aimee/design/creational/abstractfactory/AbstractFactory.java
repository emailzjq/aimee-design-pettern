package com.aimee.design.creational.abstractfactory;

import com.aimee.design.creational.factory.Shape;

public abstract class AbstractFactory {
	public abstract Color getColor(String color);

	public abstract Shape getShape(String shape);
}