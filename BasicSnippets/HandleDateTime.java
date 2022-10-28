package com.sample;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HandleDateTime {
	public static void main(String[] args) {
		
		/**
		 * Handle date and time using the method 
		 * dd - currentDate, hh - Hour (12 hours format), mm - Minutes aa - clock format (AM/PM)
		 */
		DateFormat dateFormat = new SimpleDateFormat("dd:hh:mm:aa");
		Date date = new Date();
		String dateTime = dateFormat.format(date);
	}
}
