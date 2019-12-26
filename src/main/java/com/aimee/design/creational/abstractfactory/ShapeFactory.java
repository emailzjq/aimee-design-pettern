package com.aimee.design.creational.abstractfactory;

import com.aimee.design.creational.factory.Shape;
import com.aimee.design.creational.factory.impl.Circle;
import com.aimee.design.creational.factory.impl.Rectangle;
import com.aimee.design.creational.factory.impl.Square;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}

	@Override
	public Color getColor(String color) {
		return null;
	}
}