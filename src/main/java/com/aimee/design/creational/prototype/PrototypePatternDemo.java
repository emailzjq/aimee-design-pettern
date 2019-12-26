package com.aimee.design.creational.prototype;

public class PrototypePatternDemo {
	public static void main(String[] args) {
		ShapeCache.loadCache();

		Shape clonedShape = (Shape) ShapeCache.getShape("1");
		System.out.println("Shape : " + clonedShape.getType());

		Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
		System.out.println("Shape : " + clonedShape2.getType());

		Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
		System.out.println("Shape : " + clonedShape3.getType());
		
		ShapeCache.loadCache();

		Shape clonedShape20 = (Shape) ShapeCache.getShape("1");
		System.out.println("Shape : " + clonedShape20.getType());

		Shape clonedShape21 = (Shape) ShapeCache.getShape("2");
		System.out.println("Shape : " + clonedShape21.getType());

		Shape clonedShape22 = (Shape) ShapeCache.getShape("3");
		System.out.println("Shape : " + clonedShape22.getType());
	}
}