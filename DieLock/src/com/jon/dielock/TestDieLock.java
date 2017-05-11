package com.jon.dielock;

public class TestDieLock {

	public static void main(String[] args) {
		DieLock dl1 = new DieLock(true);
		DieLock dl2 = new DieLock(false);
		//分别启动两个线程
		dl1.start();
		dl2.start();
	}

}
