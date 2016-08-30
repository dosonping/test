package com.dosonping.excel.dao;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.dosonping.excel.ExcelTemp;
import com.dosonping.excel.ExcelTemps;
import com.dosonping.util.XmlUtil;

public class ExcelDao {
	public XmlUtil getxmlUtil(Class<?> c){
		
		return new XmlUtil(c);
	}
	public File getFile(String filePath){
		File xmlFile = new File(filePath);
		XmlUtil xmlUtil = getxmlUtil(ExcelTemps.class);
		if(!xmlFile.exists()){
			try {
				xmlFile.createNewFile();
				xmlUtil.toXml(new ExcelTemps(), xmlFile, XmlUtil.DEFAULT_ENCODING);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return xmlFile;
	}
	
	public void add(ExcelTemp excelTemp){
		XmlUtil xmlUtil = getxmlUtil(ExcelTemps.class);
		//File xmlFile = new File("src/excelProfileGet.xml");
		File xmlFile = getFile(ExcelTemps.DEFAULT_EXCEL_PROFILE_PATH);
		ExcelTemps excelTemps = xmlUtil.fromXml(xmlFile);
		excelTemps.addExcelTemp(excelTemp);
		xmlUtil.toXml(excelTemps, xmlFile, XmlUtil.DEFAULT_ENCODING);
	}
	
	public void update(ExcelTemp excelTemp){
		XmlUtil xmlUtil = getxmlUtil(ExcelTemps.class);
		File xmlFile = getFile(ExcelTemps.DEFAULT_EXCEL_PROFILE_PATH);
		ExcelTemps excelTemps = xmlUtil.fromXml(xmlFile);
		excelTemps.updateExcelTemp(excelTemp);
		xmlUtil.toXml(excelTemps, xmlFile, XmlUtil.DEFAULT_ENCODING);
	}
	public void delete(String id){
		XmlUtil xmlUtil = getxmlUtil(ExcelTemps.class);
		File xmlFile = getFile(ExcelTemps.DEFAULT_EXCEL_PROFILE_PATH);
		ExcelTemps excelTemps = xmlUtil.fromXml(xmlFile);
		excelTemps.deleteExcelTemp(id);
		xmlUtil.toXml(excelTemps, xmlFile, XmlUtil.DEFAULT_ENCODING);
	}
	public ExcelTemp findExcelTempById(String id){
		ExcelTemps excelTemps = getExcelTemps();
		ExcelTemp excelTemp = excelTemps.findExcelTempById(id);
		return excelTemp;
	}
	public ExcelTemp findExcelTempByName(String name){
		ExcelTemps excelTemps = getExcelTemps();
		ExcelTemp excelTemp = excelTemps.findExcelTempByName(name);
		return excelTemp;
	}
	public List<ExcelTemp> findExcelTempList(){
		ExcelTemps excelTemps = getExcelTemps();
		return excelTemps.getExcelTemps();
	}
	public ExcelTemps getExcelTemps(){
		XmlUtil xmlUtil = getxmlUtil(ExcelTemps.class);
		File xmlFile = getFile(ExcelTemps.DEFAULT_EXCEL_PROFILE_PATH);
		return xmlUtil.fromXml(xmlFile);
	}
}
