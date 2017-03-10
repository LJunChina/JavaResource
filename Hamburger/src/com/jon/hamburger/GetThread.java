package com.jon.hamburger;

public class GetThread implements Runnable {

	private Hamburger hamburger;
	/**
	 * Ϊ����ͬ����ʹ��ͬһ��������������ͨ�����췽�����д���
	 * @param hamburger
	 */
	public GetThread(Hamburger hamburger){
		this.hamburger = hamburger;
	}
	@Override
	public void run() {
		while(true){
			synchronized (hamburger) {
				if(!this.hamburger.isFlag()){//���û�д�����̵߳ȴ�
					try {
						hamburger.wait();
					} catch (InterruptedException e) {						
						e.printStackTrace();
					}
				}
				//�����������������
				System.out.println(this.hamburger.getName()+"-----"+this.hamburger.getPrice());
				this.hamburger.setFlag(false);//���ı�־
				hamburger.notify();//�����߳�
			}	
		}		
		
	}

}
