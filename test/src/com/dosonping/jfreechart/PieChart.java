package com.dosonping.jfreechart;

import java.io.File;
import java.io.IOException;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class PieChart {
	public static void main(String[] args) {
		PieChart c = new PieChart();
		c.genJpegChart();
	}
	public void genJpegChart(){
		DefaultPieDataset dataSet = new DefaultPieDataset();
		dataSet.setValue("Iphone 5s", new Double(20));
		dataSet.setValue("SamSung Grand", new Double(20));
		dataSet.setValue("MotoG", new Double(40));
		dataSet.setValue("Nokia Lumia", new Double(10));
		
		JFreeChart createPieChart = ChartFactory.createPieChart("Mobile Sales", dataSet, true, true, false);
		
		int width = 640;
		int height = 480;
		File file = new File("/Users/dosonping/Pictures/cccc.jpeg");
		try {
			ChartUtilities.saveChartAsJPEG(file, createPieChart, width, height);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
