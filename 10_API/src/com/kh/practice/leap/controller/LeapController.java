package com.kh.practice.leap.controller;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class LeapController {
	
	public boolean isLeapYear(int year) {
		
		if(year%4 == 0 && (year%100 != 0 || year%400 == 0)) {
			return true;
			
		}
		
		return false;
	}
	
	public long leapDate(Calendar c) {
		Calendar str = new GregorianCalendar(1, 1, 1);
		Calendar now = Calendar.getInstance();
		
		int result = 0;
		
		int num1 = str.get(Calendar.YEAR);
		int num2 = now.get(Calendar.YEAR);
		
		while(num1++ != num2) {
			if(num1%4 == 0 && (num1%100 !=0 || num1%400 ==0)) {
				result += 366;
			}else {
				result += 365;
			}
		}
		
		//return result;
		
		//강사님 방법
//		Calendar c
		
//		for(int i = 1; i<c.get(Calendar.YEAR);i++) {
//			if(isLeapYear(i)) {
//				result += 366;
//			}else {
//				result +=365;
//			}
//		}
		
		//2026년 1월 1일 ~ 현재까지의 지난 일 수.
		int month = c.get(Calendar.MONTH);
		
		for(int i = 0; i<month; i++) {
			switch(i) {
			case 1,3,5,7,8,10,12:
				result +=31;
				break;
			case 4,6,9,11:
				result +=30;
				break;
			case 2:
				result += isLeapYear(c.get(Calendar.YEAR)) ? 29 : 28;
				break;
			}
			
		}
		int date = c.get(Calendar.DATE);
		result += date;
		
		return result;
	}
}
