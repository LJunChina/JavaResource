package com.jon.hamburger.improved;



public class HamburgerTest {


	public static void main(String[] args) {
		Hamburger hamburger = new Hamburger();
		
		SetThread st = new SetThread(hamburger);//ͨ�����췽�����빲����Դ����hamburger
		GetThread gt = new GetThread(hamburger);
		
		Thread td1 = new Thread(st);
		Thread td2 = new Thread(gt);
		
		td1.start();
		td2.start();

	}

}
