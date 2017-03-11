package com.jon.hamburger.improved;
/**
 * �������Ա��˽�У��ṩGET,SETͬ�����������ã���ȡ����
 * @author Jon_China
 *
 */
public class Hamburger {
	private String name;//��������
	private double price;//�����۸�
	private boolean flag;//�����Ƿ������ݵı�־��Ĭ��Ϊfalse����ʾû������
	
	public synchronized void SetData(String name,double price){
		if(this.flag){
			try {
				this.wait();
			} catch (InterruptedException e) {			
				e.printStackTrace();
			}
		}
		this.name = name;
		this.price = price;
		this.flag = true;
		this.notify();
	}
	public synchronized void GetData(){
		if(!this.flag){
			try {
				this.wait();
			} catch (InterruptedException e) {			
				e.printStackTrace();
			}
		}
		System.out.println(this.name + "-----" + this.price);
		this.flag = false;
		this.notify();
	}
	
}
