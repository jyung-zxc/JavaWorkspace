package com.kh.practice.leap.controller;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class LeapController {
	
	public boolean isLeapYear(int year) {
		boolean result = false;
		
		if(year%4 == 0&& (year%100 != 0 || year%400 == 0)) {
			result = true;
		}
		
		return result;
	}
	
	public long leapDate(Calendar c) {
		Calendar date = new GregorianCalendar(1, 1, 1);
		Calendar now = Calendar.getInstance();
		
		int result = 0;
		int num1 = date.get(Calendar.YEAR);
		int num2 = now.get(Calendar.YEAR);
		
		while(num1++ != num2) {
			if(num1%4 == 0 && (num1%100 !=0 || num1%400 ==0)) {
				result += 366;
			}else {
				result += 365;
			}
		}
		
		return result;
	}
}
