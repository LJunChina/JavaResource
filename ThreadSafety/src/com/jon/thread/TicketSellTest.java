package com.jon.thread;

public class TicketSellTest {
	public static void main(String[] args) {
		TicketSell ts = new TicketSell();
		Thread td1 = new Thread(ts, "售票窗口1");//设置线程名称以区分哪个售票窗口
		Thread td2 = new Thread(ts, "售票窗口2");
		Thread td3 = new Thread(ts, "售票窗口3");
		td1.start();
		td2.start();
		td3.start();
	}
}
