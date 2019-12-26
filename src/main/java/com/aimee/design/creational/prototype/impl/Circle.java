package com.aimee.design.creational.prototype.impl;

import com.aimee.design.creational.prototype.Shape;

public class Circle extends Shape {
	 
	   public Circle(){
	     type = "Circle";
	   }
	 
	   @Override
	   public void draw() {
	      System.out.println("Inside Circle::draw() method.");
	   }
	}