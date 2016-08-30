package com.dosonping.excel;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

public class ExcelTemp {
	private String id;
	private String name;
	private List<SheetTemp> sheets;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@XmlElementWrapper(name="sheetTemps")
	@XmlElement(name="sheetTemp")
	public List<SheetTemp> getSheets() {
		return sheets;
	}
	public void setSheets(List<SheetTemp> sheets) {
		this.sheets = sheets;
	}
	public SheetTemp createSheet(){
		SheetTemp st = new SheetTemp();
		return st;
	}
	public void addSheet(SheetTemp sheetTemp){
		if(null == sheets){
			sheets = new ArrayList<SheetTemp>();
		}
		if(null != sheetTemp){
			sheets.add(sheetTemp);
		}
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
