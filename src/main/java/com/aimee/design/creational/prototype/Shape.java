package com.aimee.design.creational.prototype;

/**
 * clone默认是浅克隆  如果需要深克隆需要自己把引用的都重新clone下
 * @author ZhangJiaqi
 *
 */
public abstract class Shape implements Cloneable {

	private String id;
	protected String type;

	public abstract void draw();

	public String getType() {
		return type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
}