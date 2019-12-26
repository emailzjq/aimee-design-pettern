package com.aimee.design.creational.builder.intf.impl;

import com.aimee.design.creational.builder.intf.Packing;

public class Bottle implements Packing {

	@Override
	public String pack() {
		return "Bottle";
	}
}