package com.jon.hamburger;

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
			synchronized (hamburger) {
				if(!this.hamburger.isFlag()){//如果没有存货，线程等待
					try {
						hamburger.wait();
					} catch (InterruptedException e) {						
						e.printStackTrace();
					}
				}
				//如果有数据则进行输出
				System.out.println(this.hamburger.getName()+"-----"+this.hamburger.getPrice());
				this.hamburger.setFlag(false);//更改标志
				hamburger.notify();//唤醒线程
			}	
		}		
		
	}

}
