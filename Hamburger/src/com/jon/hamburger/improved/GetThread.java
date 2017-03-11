package com.jon.hamburger.improved;

public class GetThread implements Runnable {

	private Hamburger hamburger;
	/**
	 * 为了让同步锁使用同一个对象锁，这里通过构造方法进行传递
	 * @param hamburger
	 */
	public GetThread(Hamburger hamburger){
		this.hamburger = hamburger;
	}
	@Override
	public void run() {
		while(true){			
			this.hamburger.GetData();		
		}		
		
	}

}
