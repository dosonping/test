package com.dosonping.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 判断当前时间是否在[startTime, endTime]区间，注意时间格式要一致
 * @author 崔富平
 * @datetime 2019年7月2日 下午2:02:57
 */
public class EffectiveDate {
	/**
	 * 判断当前时间是否在[startTime, endTime]区间，注意时间格式要一致
	 * @param nowTime 当前时间
	 * @param startTime 开始时间
	 * @param endTime 结束时间
	 * @return
	 * @datetime 2019年7月2日 下午2:08:38
	 * @author 崔富平
	 */
	public static boolean isEffectiveDate(Date nowTime, Date startTime, Date endTime) {
		if(nowTime.getTime() == startTime.getTime() || nowTime.getTime() == endTime.getTime()) {
			return true;
		}
		Calendar date = Calendar.getInstance();
		date.setTime(nowTime);
		
		Calendar begin = Calendar.getInstance();
		begin.setTime(startTime);
		
		Calendar end = Calendar.getInstance();
		end.setTime(endTime);
		
		if(date.after(begin) && date.before(end)) {
			return true;
		} else {
			return false;
		}

		
	}
	public static void main(String[] args) throws ParseException {
		String format = "yyyy-MM-dd";
		Date nowTime = new SimpleDateFormat(format).parse("2019-06-04");
		Date startTime = new SimpleDateFormat(format).parse("2019-06-01");
		Date endTime = new SimpleDateFormat(format).parse("2019-06-03");
		System.out.println(isEffectiveDate(nowTime, startTime, endTime));
		
	}
}
