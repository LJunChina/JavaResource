package com.jon.hamburger.improved;

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
			this.hamburger.GetData();		
		}		
		
	}

}
