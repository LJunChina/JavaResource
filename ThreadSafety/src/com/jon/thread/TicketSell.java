package com.jon.thread;

public class TicketSell implements Runnable {
	private int tickets = 50;
	private Object obj = new Object();
	@Override
	public void run() {
		while(true){
			synchronized (obj) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {				
					e.printStackTrace();
				}
				if(tickets>0){				
					System.out.println(Thread.currentThread().getName() + "正在售第" + (tickets--) + "张车票");
				}
			}			
		}
	}

}
