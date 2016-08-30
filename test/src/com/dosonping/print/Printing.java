package com.dosonping.print;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.ServiceUI;
import javax.print.SimpleDoc;
import javax.print.attribute.DocAttributeSet;
import javax.print.attribute.HashDocAttributeSet;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;

public class Printing {
	public static void main(String[] args) throws FileNotFoundException, PrintException, InterruptedException {
		String filename = "/Users/dosonping/Documents/pdf/test1.pdf";
        //PrintRequestAttributeSet实例。
        //这用来弹出显示的对话框，并在对话框消失之前返回用户所作的任何更改。
        PrintRequestAttributeSet pras = new HashPrintRequestAttributeSet();
        DocFlavor flavor = DocFlavor.INPUT_STREAM.POSTSCRIPT;
        PrintService printService[] = PrintServiceLookup.lookupPrintServices(flavor, pras);//用户可选用的PrintService实例数组。
        PrintService defaultService = PrintServiceLookup.lookupDefaultPrintService(); //默认的PrintService
        /*为用户提供一个选择 PrintService（打印机）的对话框。
            gc - 用于选择屏幕。null 意味着主屏幕或默认屏幕。
            x - 对话框在屏幕坐标中的位置，包括边框
            y - 对话框在屏幕坐标中的位置，包括边框
            services - 可浏览的服务，必须不为 null。
            defaultService - 要显示的初始 PrintService。
            flavor - 要打印的 flavor，或者为 null。
            attributes - 输入时为应用程序最初提供的首选项。这不能为 null，但可以为空。输出时为反映用户所作的更改的属性。
        */ 
        PrintService service = ServiceUI.printDialog(null, 200, 200,printService, defaultService, flavor, pras);
        if (service != null) {
            DocPrintJob job = service.createPrintJob();  //创建打印任务
            FileInputStream fis = new FileInputStream(filename);
            DocAttributeSet das = new HashDocAttributeSet();
            /*
             * 定义要打印的文档,SimpleDoc(,,)里有三个参数:
             * 　　   ·Object 代表要打印的内容
　　           *      ·DocFlavor的一个实例描述数据类型
　　           *      ·可选的DocAttributeSet 包含打印时的属性
             */
            Doc doc = new SimpleDoc(fis, flavor, das);
            /*   启动打印 job.print( , )
             * doc - 要打印的文档。如果必须是一个 flavor，则此 PrintJob 必须支持它。
             *  attributes - 应用到此 PrintJob 的作业属性。如果此参数为 null，则使用默认属性。 
             * */
            job.print(doc, pras);
            Thread.sleep(10000);
        }
        System.exit(0);
	}
}
