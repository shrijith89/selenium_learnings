package com.demo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AddDate {
	
	/**
	 * 
	 * @param dateToAdd
	 * @return date added to currentDate
	 */
	public String handleNextDate(int dateToAdd) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		c.add(Calendar.DATE, dateToAdd);
		return sdf.format(c.getTime());
	}
}
