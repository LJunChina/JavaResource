package com.jon.hamburger.improved;

public class SetThread implements Runnable {
	private Hamburger hamburger;
	private int i;

	public SetThread(Hamburger hamburger) {
		this.hamburger = hamburger;
	}

	@Override
	public void run() {
		while (true) {// Ϊ������Ч����һЩ��¥���������ж�
			// ���û�д������ģ������
			if (i % 2 == 0) {
				this.hamburger.SetData("�����ĺ���", 25.5);
			} else {
				this.hamburger.SetData("�󿡹��ĺ���", 26.5);
			}
			i++;// ֻΪ����Ч����һЩ����ʵ������
		}

	}

}
