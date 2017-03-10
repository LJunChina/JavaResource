package com.jon.hamburger;

public class Hamburger {
	private String name;//汉堡名称
	private double price;//汉堡价格
	private boolean flag;//汉堡是否有数据的标志，默认为false，表示没有数据
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
}
