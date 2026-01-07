package com.kh.practice.leap.view;

import java.util.Calendar;

import com.kh.practice.leap.controller.LeapController;

public class LeapView {
	LeapController lc = new LeapController();
	
	public LeapView() {
		Calendar year = Calendar.getInstance();
		boolean result = lc.isLeapYear(year.get(Calendar.YEAR));
		
		String year1 = "";
		
		if(result == true) {
			year1 = "윤년";
		}else {
			year1 = "평년";
		}
			
		System.out.println(year.get(Calendar.YEAR)+"년은 "+year1+"입니다.");
		System.out.println("총 날짜 수 : " + lc.leapDate(year));
	}
}
