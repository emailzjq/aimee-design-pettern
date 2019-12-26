package com.aimee.design.creational.builder.abs;

import com.aimee.design.creational.builder.intf.Item;
import com.aimee.design.creational.builder.intf.Packing;
import com.aimee.design.creational.builder.intf.impl.Bottle;

public abstract class ColdDrink implements Item {
 
    @Override
    public Packing packing() {
       return new Bottle();
    }
 
    @Override
    public abstract float price();
}