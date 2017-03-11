package com.jon.hamburger.improved;

public class SetThread implements Runnable {
	private Hamburger hamburger;
	private int i;

	public SetThread(Hamburger hamburger) {
		this.hamburger = hamburger;
	}

	@Override
	public void run() {
		while (true) {// 为了数据效果好一些，楼主加入了判断
			// 如果没有存货，这模拟生产
			if (i % 2 == 0) {
				this.hamburger.SetData("俊锅的汉堡", 25.5);
			} else {
				this.hamburger.SetData("大俊锅的汉堡", 26.5);
			}
			i++;// 只为数据效果好一些，无实际意义
		}

	}

}
