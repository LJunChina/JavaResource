package print2flash;

import java.io.IOException;

import com.jacob.activeX.*;
import com.jacob.com.*;

public class Test {

	public static void main(String[] args) throws IOException {
		try {
			ComThread.InitSTA();//com�������������ʼ��com�̣߳��ͷ��߳�
			ActiveXComponent p2f = new ActiveXComponent("Print2Flash4.Server");//����print2flash��һ��Ӧ�ã�����print2flash����
			//��������ֵ���ɸ����Լ������޸�
			ActiveXComponent defProfile = new ActiveXComponent(p2f.getProperty("DefaultProfile").toDispatch());
			defProfile.setProperty("InterfaceOptions", P2FConst.INTLOGO | P2FConst.INTZOOMSLIDER | P2FConst.INTPREVPAGE
					| P2FConst.INTGOTOPAGE | P2FConst.INTNEXTPAGE);
			defProfile.setProperty("ProtectionOptions", P2FConst.PROTDISPRINT | P2FConst.PROTENAPI);
			defProfile.setProperty("DocumentType", P2FConst.FLASH | P2FConst.HTML5);
			p2f.invoke("ConvertFile", "E:/print2flashTest/test.docx");//��������
			System.out.println("ת���ɹ���");
		} catch (Exception e) {
			System.out.println("ת���쳣: " + e.toString());
		} finally {
			ComThread.Release();
		}
	}
}
