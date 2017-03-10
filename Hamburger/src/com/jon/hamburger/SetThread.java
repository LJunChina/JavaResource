package com.jon.hamburger;

public class SetThread implements Runnable {
	private Hamburger hamburger;
	private int i;

	public SetThread(Hamburger hamburger) {
		this.hamburger = hamburger;
	}
	@Override
	public void run() {
		while (true) {//Ϊ������Ч����һЩ��¥���������ж�
			synchronized (hamburger) {
				if(this.hamburger.isFlag()){//����д��
					try {
						hamburger.wait();//�̵߳ȴ�
					} catch (InterruptedException e) {						
						e.printStackTrace();
					}
				}
				//���û�д������ģ������
				if (i % 2 == 0) {
					this.hamburger.setPrice(25.0);
					this.hamburger.setName("�����ĺ���");
				} else {
					this.hamburger.setPrice(26.0);
					this.hamburger.setName("�󿡹��ĺ���");
				}
				this.hamburger.setFlag(true);//������ɺ���ı�־
				hamburger.notify();//���ѵ�ǰ�ȴ����߳�
				i++;//ֻΪ����Ч����һЩ����ʵ������
			}

		}

	}

}
