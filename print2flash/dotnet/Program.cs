using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;

namespace Test
{
    class Program
    {
        static void Main(string[] args)
        {
			string fs_filename = System.AppDomain.CurrentDomain.BaseDirectory()+"/print2flashTest/test.docx";
			string fs_convertedfilename = System.AppDomain.CurrentDomain.BaseDirectory()+"/print2flashTest/swf/test.swf";
            Print2Flash4.Server2 p2fServer = new Print2Flash4.Server2();//创建print2flash对象
			//设置参数值，可以参考官网SDK文档          
            p2fServer.ConvertFile(fs_filename, fs_convertedfilename, null, null, null);
        }
    }
}
