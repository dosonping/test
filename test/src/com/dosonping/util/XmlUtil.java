package com.dosonping.util;

import java.io.File;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 * 实现Xml<->Java Object的转换
 * @author dosonping
 *
 */
public class XmlUtil {
	
	private JAXBContext jaxbContext;
	public static final String DEFAULT_ENCODING = "utf-8";
	/**
	 * @param beans 所有需要转换的对象
	 */
	public XmlUtil(Class<?>... beans) {
		try {
			jaxbContext = JAXBContext.newInstance(beans);
		} catch (JAXBException e) {
			throw new RuntimeException(e);
//			e.printStackTrace();
		}
	}
	/**
	 * java Object -> Xml 把java Object 转换成xml字符串
	 * Date 2015年12月2日
	 * Author dosonping
	 * @param object 要转换的对象
	 * @param encoding 
	 * @return xml字符串
	 */
	public String toXml(Object object, String encoding){
		StringWriter writer = new StringWriter();
		try {
			createMarshaller(encoding).marshal(object, writer);
			return writer.toString();
		} catch (JAXBException e) {
//			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	/**
	 * java Object -> Xml  把java Object转换成文件
	 * Date 2015年12月2日
	 * Author dosonping
	 * @param object 要转换的对象
	 * @param outputFile 固化到这个文件 
	 * @param encoding 编码
	 */
	public void toXml(Object object,File outputFile,String encoding){
		try {
			createMarshaller(encoding).marshal(object, outputFile);
		} catch (JAXBException e) {
//			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	/**
	 * xml -> java Object 把xml字符串转换成java Object
	 * Date 2015年12月2日
	 * Author dosonping
	 * @param xml xml字符串
	 * @return
	 */
	public <T> T fromXml(String xml){
		StringReader reader = new StringReader(xml);
		try {
			return (T)createUnmarshaller().unmarshal(reader);
		} catch (JAXBException e) {
			//e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	/**
	 * xml -> java Object 把xml文件转换成java Object
	 * Date 2015年12月2日
	 * Author dosonping
	 * @param xmlFile xml文件
	 * @return
	 */
	public <T> T fromXml(File xmlFile){
		try {
			return (T)createUnmarshaller().unmarshal(xmlFile);
		} catch (JAXBException e) {
//			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	/**
	 * 创建Marshaller
	 * Date 2015年12月2日
	 * Author dosonping
	 * @param encoding
	 * @return
	 */
	protected Marshaller createMarshaller(String encoding){
		try {
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			if(null != encoding && !"".equals(encoding)){
				marshaller.setProperty(Marshaller.JAXB_ENCODING, encoding);
			}
			return marshaller;
		} catch (JAXBException e) {
			throw new RuntimeException(e);
//			e.printStackTrace();
		}
	}
	/**
	 * 创建Unmarshaller
	 * Date 2015年12月2日
	 * Author dosonping
	 * @return
	 */
	protected Unmarshaller createUnmarshaller(){
		try {
			return jaxbContext.createUnmarshaller();
		} catch (JAXBException e) {
			throw new RuntimeException(e);
			//e.printStackTrace();
		}
	}
}
