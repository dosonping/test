package com.dosonping.excel;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

public class SheetTemp {
	
	protected SheetTemp() {
		super();
	}
	private String name;
	private String targetObject="";
	private String dateFormat="YMD";
	private String dateDelimiter="/";
	private String timeDelimiter=":";
	private boolean fourDigitYears=true;
	private String decimalSymbol=".";
	private String thousandSeparator=",";
	private String model;
	private boolean putInStorage;
	
	private int fieldNameRow;
	
	private List<DataRow> dataRows;
	private List<FieldMapping> fieldMappings;
	public DataRow createDataRow(){
		DataRow dr = new DataRow();
		return dr;
	}
	public void addDataRow(DataRow dataRow){
		if(null == dataRows){
			dataRows = new ArrayList<DataRow>();
		}
		if(null != dataRow){
			dataRows.add(dataRow);
		}
	}
	public FieldMapping createFieldMapping(){
		FieldMapping fm = new FieldMapping();
		return fm;
	}
	public void addFieldMapping(FieldMapping fieldMapping){
		if(null == fieldMappings){
			fieldMappings = new ArrayList<FieldMapping>();
		}
		if(null != fieldMapping){
			fieldMappings.add(fieldMapping);
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getTargetObject() {
		return targetObject;
	}
	public void setTargetObject(String targetObject) {
		this.targetObject = targetObject;
	}
	public String getDateFormat() {
		return dateFormat;
	}
	public void setDateFormat(String dateFormat) {
		this.dateFormat = dateFormat;
	}
	public String getDateDelimiter() {
		return dateDelimiter;
	}
	public void setDateDelimiter(String dateDelimiter) {
		this.dateDelimiter = dateDelimiter;
	}
	public String getTimeDelimiter() {
		return timeDelimiter;
	}
	public void setTimeDelimiter(String timeDelimiter) {
		this.timeDelimiter = timeDelimiter;
	}
	public boolean isFourDigitYears() {
		return fourDigitYears;
	}
	public void setFourDigitYears(boolean fourDigitYears) {
		this.fourDigitYears = fourDigitYears;
	}
	public String getDecimalSymbol() {
		return decimalSymbol;
	}
	public void setDecimalSymbol(String decimalSymbol) {
		this.decimalSymbol = decimalSymbol;
	}
	public String getThousandSeparator() {
		return thousandSeparator;
	}
	public void setThousandSeparator(String thousandSeparator) {
		this.thousandSeparator = thousandSeparator;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getFieldNameRow() {
		return fieldNameRow;
	}
	public void setFieldNameRow(int fieldNameRow) {
		this.fieldNameRow = fieldNameRow;
	}
	@XmlElementWrapper(name="dataRows")
	@XmlElement(name="dataRow")
	public List<DataRow> getDataRows() {
		return dataRows;
	}
	public void setDataRows(List<DataRow> dataRows) {
		this.dataRows = dataRows;
	}
	@XmlElementWrapper(name="fieldMappings")
	@XmlElement(name="fieldMapping")
	public List<FieldMapping> getFieldMappings() {
		return fieldMappings;
	}
	public void setFieldMappings(List<FieldMapping> fieldMappings) {
		this.fieldMappings = fieldMappings;
	}
	public boolean isPutInStorage() {
		return putInStorage;
	}
	public void setPutInStorage(boolean putInStorage) {
		this.putInStorage = putInStorage;
	}
	
}	
