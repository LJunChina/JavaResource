package com.jon.hamburger;

public class SetThread implements Runnable {
	private Hamburger hamburger;
	private int i;

	public SetThread(Hamburger hamburger) {
		this.hamburger = hamburger;
	}
	@Override
	public void run() {
		while (true) {//为了数据效果好一些，楼主加入了判断
			synchronized (hamburger) {
				if(this.hamburger.isFlag()){//如果有存货
					try {
						hamburger.wait();//线程等待
					} catch (InterruptedException e) {						
						e.printStackTrace();
					}
				}
				//如果没有存货，这模拟生产
				if (i % 2 == 0) {
					this.hamburger.setPrice(25.0);
					this.hamburger.setName("俊锅的汉堡");
				} else {
					this.hamburger.setPrice(26.0);
					this.hamburger.setName("大俊锅的汉堡");
				}
				this.hamburger.setFlag(true);//生产完成后更改标志
				hamburger.notify();//唤醒当前等待的线程
				i++;//只为数据效果好一些，无实际意义
			}

		}

	}

}
