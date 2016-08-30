package com.dosonping.excel;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
//@XmlAccessorType(XmlAccessType.NONE)
public class ExcelTemps {
	public static final String DEFAULT_EXCEL_PROFILE_PATH="src/excelProfileGet.xml";
	private List<ExcelTemp> excelTemps;
	
	//@XmlElementWrapper(name="excelTemps")
	@XmlElement(name="excelTemp")
	public List<ExcelTemp> getExcelTemps() {
		return excelTemps;
	}
	
	public void setExcelTemps(List<ExcelTemp> excelTemps) {
		this.excelTemps = excelTemps;
	}
	public void addExcelTemp(ExcelTemp excelTemp){
		if(null == excelTemps){
			excelTemps = new ArrayList<ExcelTemp>();
		}
		if(null != excelTemp){
			excelTemps.add(excelTemp);
		}
	}
	public void updateExcelTemp(ExcelTemp excelTemp){
		if(null == excelTemps){
			excelTemps = new ArrayList<ExcelTemp>();
		}
		if(null != excelTemp && 0 < excelTemps.size()){
			for(int i=0; i< excelTemps.size();i++){
				ExcelTemp localExcelTemp = excelTemps.get(i);
				String id = localExcelTemp.getId();
				if(excelTemp.getId().equals(id)){
					excelTemps.remove(i);
					excelTemps.add(i, excelTemp);
					break;
				}
			}
			
		}
	}
	public void deleteExcelTemp(String id){
		if(null == excelTemps){
			excelTemps = new ArrayList<ExcelTemp>();
		}
		if(null != id && 0<excelTemps.size()){
			for(int i=0; i< excelTemps.size();i++){
				ExcelTemp localExcelTemp = excelTemps.get(i);
				String localId = localExcelTemp.getId();
				if(id.equals(localId)){
					excelTemps.remove(i);
					break;
				}
			}
		}
	}
	public ExcelTemp findExcelTempById(String id){
		if(null == excelTemps){
			excelTemps = new ArrayList<ExcelTemp>();
		}
		if(null != id && 0<excelTemps.size()){
			for(int i=0; i< excelTemps.size();i++){
				
				ExcelTemp localExcelTemp = excelTemps.get(i);
				String localId = localExcelTemp.getId();
				if(id.equals(localId)){
					return localExcelTemp;
				}
			}
		}
		return null;
	}
	public ExcelTemp findExcelTempByName(String name){
		if(null == excelTemps){
			excelTemps = new ArrayList<ExcelTemp>();
		}
		if(null != name && 0<excelTemps.size()){
			for(int i=0; i< excelTemps.size();i++){
				ExcelTemp localExcelTemp = excelTemps.get(i);
				String localName = localExcelTemp.getName();
				if(localName.equals(name)){
					return localExcelTemp;
				}
			}
		}
		return null;
	}
}
