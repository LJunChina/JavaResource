package print2flash;

import java.io.IOException;

import com.jacob.activeX.*;
import com.jacob.com.*;

public class Test {

	public static void main(String[] args) throws IOException {
		try {
			ComThread.InitSTA();//com组件管理，用来初始化com线程，释放线程
			ActiveXComponent p2f = new ActiveXComponent("Print2Flash4.Server");//创建print2flash的一个应用，调用print2flash服务
			//设置属性值，可根据自己需求修改
			ActiveXComponent defProfile = new ActiveXComponent(p2f.getProperty("DefaultProfile").toDispatch());
			defProfile.setProperty("InterfaceOptions", P2FConst.INTLOGO | P2FConst.INTZOOMSLIDER | P2FConst.INTPREVPAGE
					| P2FConst.INTGOTOPAGE | P2FConst.INTNEXTPAGE);
			defProfile.setProperty("ProtectionOptions", P2FConst.PROTDISPRINT | P2FConst.PROTENAPI);
			defProfile.setProperty("DocumentType", P2FConst.FLASH | P2FConst.HTML5);
			p2f.invoke("ConvertFile", "E:/print2flashTest/test.docx");//方法调用
			System.out.println("转换成功！");
		} catch (Exception e) {
			System.out.println("转换异常: " + e.toString());
		} finally {
			ComThread.Release();
		}
	}
}
