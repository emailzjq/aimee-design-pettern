package com.aimee.design.creational.prototype;

import java.util.Hashtable;

import com.aimee.design.creational.prototype.impl.Circle;
import com.aimee.design.creational.prototype.impl.Rectangle;
import com.aimee.design.creational.prototype.impl.Square;

public class ShapeCache {

	private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

	public static Shape getShape(String shapeId) {
		Shape cachedShape = shapeMap.get(shapeId);
		System.out.println("cache:" +  cachedShape);
		Shape shape = (Shape) cachedShape.clone();
		System.out.println("new" + shape);
		return shape;
	}

	// 对每种形状都运行数据库查询，并创建该形状
	// shapeMap.put(shapeKey, shape);
	// 例如，我们要添加三种形状 
	// 此处应该加载一次就可以了
	public static void loadCache() {
		if (shapeMap.size()>0) {
			return;
		}
		
		Circle circle = new Circle();
		circle.setId("1");
		shapeMap.put(circle.getId(), circle);

		Square square = new Square();
		square.setId("2");
		shapeMap.put(square.getId(), square);

		Rectangle rectangle = new Rectangle();
		rectangle.setId("3");
		shapeMap.put(rectangle.getId(), rectangle);
	}
}