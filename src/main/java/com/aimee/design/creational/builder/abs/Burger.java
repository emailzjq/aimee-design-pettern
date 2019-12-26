package com.aimee.design.creational.builder.abs;

import com.aimee.design.creational.builder.intf.Item;
import com.aimee.design.creational.builder.intf.Packing;
import com.aimee.design.creational.builder.intf.impl.Wrapper;

public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();
}