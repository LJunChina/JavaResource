package com.jon.hamburger.improved;
/**
 * 所有属性变成私有，提供GET,SET同步方法来设置，获取数据
 * @author Jon_China
 *
 */
public class Hamburger {
	private String name;//汉堡名称
	private double price;//汉堡价格
	private boolean flag;//汉堡是否有数据的标志，默认为false，表示没有数据
	
	public synchronized void SetData(String name,double price){
		if(this.flag){
			try {
				this.wait();
			} catch (InterruptedException e) {			
				e.printStackTrace();
			}
		}
		this.name = name;
		this.price = price;
		this.flag = true;
		this.notify();
	}
	public synchronized void GetData(){
		if(!this.flag){
			try {
				this.wait();
			} catch (InterruptedException e) {			
				e.printStackTrace();
			}
		}
		System.out.println(this.name + "-----" + this.price);
		this.flag = false;
		this.notify();
	}
	
}
