package com.dosonping.xml;

import java.io.File;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Result;

import com.dosonping.excel.DataRow;
import com.dosonping.excel.ExcelTemp;
import com.dosonping.excel.ExcelTemps;
import com.dosonping.excel.FieldMapping;
import com.dosonping.excel.SheetTemp;
import com.dosonping.excel.dao.ExcelDao;
import com.dosonping.util.XmlUtil;

public class XStreamDemo {
	public static void main(String[] args) {
		XStreamDemo.testBean2Xml();
//		XStreamDemo.testXml2Bean();
//		XStreamDemo.testAdd();
//		XStreamDemo.testUpdate();
//		XStreamDemo.testDelete();
//		XStreamDemo.testFind();
		
	}
	public static ExcelTemps getExcelTemps(){
		ExcelTemps excelTemps = new ExcelTemps();
		for(int i = 0; i < 2; i++){
			ExcelTemp excelTemp = new ExcelTemp();
			excelTemp.setId("id123");
			excelTemp.setName("第一个ExcelTemp");
			SheetTemp sheetTemp = excelTemp.createSheet();
			sheetTemp.setName("第一个sheetTemp");
			sheetTemp.setTargetObject(Dom4jDemo.class.getName());
			sheetTemp.setFieldNameRow(0);
			DataRow dataRow = sheetTemp.createDataRow();
			dataRow.setStartRow(1);
			dataRow.setEndRow(3);
			DataRow dataRow2 = sheetTemp.createDataRow();
			dataRow2.setStartRow(6);
//			dataRow2.setEndRow(9);
			sheetTemp.addDataRow(dataRow);
			sheetTemp.addDataRow(dataRow2);
			FieldMapping fieldMapping = sheetTemp.createFieldMapping();
			fieldMapping.setSourceField("用户名");
			fieldMapping.setTargetField("userName");
			FieldMapping fieldMapping2 = sheetTemp.createFieldMapping();
			fieldMapping2.setSourceField("密码");
			fieldMapping2.setTargetField("password");
			sheetTemp.addFieldMapping(fieldMapping);
			sheetTemp.addFieldMapping(fieldMapping2);
			sheetTemp.setPutInStorage(false);
//			sheetTemp.setTargetTable("pm_user");
			//SheetTemp st3 = new SheetTemp();
			excelTemp.addSheet(sheetTemp);
			excelTemps.addExcelTemp(excelTemp);
		}
		
		
		return excelTemps;
	}
	public static void testBean2Xml(){
		System.out.println("将Java对象转换为xml！\n"); 
		ExcelTemps excelTemps = getExcelTemps();
//			JAXBContext jaxbContext = JAXBContext.newInstance(ExcelTemps.class);
//			Marshaller marshaller = jaxbContext.createMarshaller();
//			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE); 
////			Result output = null;
			File output = new File("src/excelProfileGet.xml");
			
//			marshaller.marshal(excelTemps, output);
			XmlUtil xmlUtil = new XmlUtil(ExcelTemps.class);
			xmlUtil.toXml(excelTemps, output, "utf-8");
			
			
		

	}
	public static void testFind(){
		ExcelDao excelDao = new ExcelDao();
		String id="id124";
		ExcelTemp excelTemp = excelDao.findExcelTempById(id);
		System.out.println("excelTempName::"+excelTemp.getName());
		for (SheetTemp sheetTemp : excelTemp.getSheets()) {
			System.out.println("sheetTempName:"+sheetTemp.getName());
			System.out.println("dateDelimiter:"+sheetTemp.getDateDelimiter());
			System.out.println("dateFormat:"+sheetTemp.getDateFormat());
			System.out.println("fieldNameRow:"+sheetTemp.getFieldNameRow());
			System.out.println("targetObject:"+sheetTemp.getTargetObject());
			System.out.println("ThousandSeparator:"+sheetTemp.getThousandSeparator());
			System.out.println("timeDelimiter:"+sheetTemp.getTimeDelimiter());
			System.out.println("model:"+sheetTemp.getModel());
			for (DataRow dataRow : sheetTemp.getDataRows()) {
				System.out.println("startRow:"+dataRow.getStartRow());
				System.out.println("endRow:"+dataRow.getEndRow());
			}
			for(FieldMapping fieldMapping : sheetTemp.getFieldMappings()){
				System.out.println("targetField:"+fieldMapping.getTargetField());
				System.out.println("sourceField:"+fieldMapping.getSourceField());
			}
		}
	}
	public static void testDelete(){
		ExcelDao excelDao = new ExcelDao();
		String id = "id123";
		excelDao.delete(id);
	}
	public static void testUpdate(){
		ExcelDao excelDao = new ExcelDao();
		ExcelTemp excelTemp = new ExcelTemp();
		excelTemp.setId("id123");
		excelTemp.setName("第二个ExcelTemp");
		SheetTemp sheetTemp = excelTemp.createSheet();
		sheetTemp.setName("第二一个sheetTemp");
		sheetTemp.setTargetObject(Dom4jDemo.class.getName());
		sheetTemp.setFieldNameRow(0);
		DataRow dataRow = sheetTemp.createDataRow();
		dataRow.setStartRow(10);
		dataRow.setEndRow(34);
		DataRow dataRow2 = sheetTemp.createDataRow();
		dataRow2.setStartRow(6);
		dataRow2.setEndRow(9);
		sheetTemp.addDataRow(dataRow);
		sheetTemp.addDataRow(dataRow2);
		FieldMapping fieldMapping = sheetTemp.createFieldMapping();
		fieldMapping.setSourceField("用户名11");
		fieldMapping.setTargetField("userName");
		FieldMapping fieldMapping2 = sheetTemp.createFieldMapping();
		fieldMapping2.setSourceField("密码");
		fieldMapping2.setTargetField("password22");
		sheetTemp.addFieldMapping(fieldMapping);
		sheetTemp.addFieldMapping(fieldMapping2);
		//SheetTemp st3 = new SheetTemp();
		excelTemp.addSheet(sheetTemp);
		excelDao.update(excelTemp);
	}
	public static void testAdd(){
		ExcelDao excelDao = new ExcelDao();
		ExcelTemp excelTemp = new ExcelTemp();
		excelTemp.setId("id124");
		excelTemp.setName("第一个ExcelTemp");
		SheetTemp sheetTemp = excelTemp.createSheet();
		sheetTemp.setName("第一个sheetTemp");
		sheetTemp.setTargetObject(Dom4jDemo.class.getName());
		sheetTemp.setFieldNameRow(0);
		DataRow dataRow = sheetTemp.createDataRow();
		dataRow.setStartRow(1);
		dataRow.setEndRow(3);
		DataRow dataRow2 = sheetTemp.createDataRow();
		dataRow2.setStartRow(6);
		dataRow2.setEndRow(9);
		sheetTemp.addDataRow(dataRow);
		sheetTemp.addDataRow(dataRow2);
		FieldMapping fieldMapping = sheetTemp.createFieldMapping();
		fieldMapping.setSourceField("用户名");
		fieldMapping.setTargetField("userName");
		FieldMapping fieldMapping2 = sheetTemp.createFieldMapping();
		fieldMapping2.setSourceField("密码");
		fieldMapping2.setTargetField("password");
		sheetTemp.addFieldMapping(fieldMapping);
		sheetTemp.addFieldMapping(fieldMapping2);
		//SheetTemp st3 = new SheetTemp();
		excelTemp.addSheet(sheetTemp);
		excelDao.add(excelTemp);
	}
	public static void testXml2Bean(){
		System.out.println("将xml对象转换为Java！\n"); 
//		try {
//			JAXBContext jaxbContext = JAXBContext.newInstance(ExcelTemps.class);
//			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			File in = new File("src/excelProfileGet.xml");
			XmlUtil xmlUtil2 = new XmlUtil(ExcelTemps.class);
			if(!in.exists()){
				try {
					in.createNewFile();
					xmlUtil2.toXml(new ExcelTemps(), in, "utf-8");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
//			ExcelTemps ets = (ExcelTemps) unmarshaller.unmarshal(in);
			
			ExcelTemps ets = xmlUtil2.fromXml(in);
			for (ExcelTemp excelTemp : ets.getExcelTemps()) {
				System.out.println("excelTempName::"+excelTemp.getName());
				for (SheetTemp sheetTemp : excelTemp.getSheets()) {
					System.out.println("sheetTempName:"+sheetTemp.getName());
					System.out.println("dateDelimiter:"+sheetTemp.getDateDelimiter());
					System.out.println("dateFormat:"+sheetTemp.getDateFormat());
					System.out.println("fieldNameRow:"+sheetTemp.getFieldNameRow());
					System.out.println("targetObject:"+sheetTemp.getTargetObject());
					System.out.println("ThousandSeparator:"+sheetTemp.getThousandSeparator());
					System.out.println("timeDelimiter:"+sheetTemp.getTimeDelimiter());
					System.out.println("model:"+sheetTemp.getModel());
					for (DataRow dataRow : sheetTemp.getDataRows()) {
						System.out.println("startRow:"+dataRow.getStartRow());
						System.out.println("endRow:"+dataRow.getEndRow());
					}
					for(FieldMapping fieldMapping : sheetTemp.getFieldMappings()){
						System.out.println("targetField:"+fieldMapping.getTargetField());
						System.out.println("sourceField:"+fieldMapping.getSourceField());
					}
				}
				
			}
			
//		} catch (JAXBException e) {
//			e.printStackTrace();
//		}
	}
}
