package com.aimee.design.creational.prototype.impl;

import com.aimee.design.creational.prototype.Shape;

public class Square extends Shape {
	 
	   public Square(){
	     type = "Square";
	   }
	 
	   @Override
	   public void draw() {
	      System.out.println("Inside Square::draw() method.");
	   }
	}