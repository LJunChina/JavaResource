package com.jon.thread;

public class TicketSellTest {
	public static void main(String[] args) {
		TicketSell ts = new TicketSell();
		Thread td1 = new Thread(ts, "��Ʊ����1");//�����߳������������ĸ���Ʊ����
		Thread td2 = new Thread(ts, "��Ʊ����2");
		Thread td3 = new Thread(ts, "��Ʊ����3");
		td1.start();
		td2.start();
		td3.start();
	}
}
