package com.kh.practice.leap.view;

import java.util.Calendar;

import com.kh.practice.leap.controller.LeapController;

public class LeapView {
	
	public LeapView() {
		LeapController lc = new LeapController();
		
		Calendar year = Calendar.getInstance();
		
		// 내 방법
		boolean result = lc.isLeapYear(year.get(Calendar.YEAR));
		
		String year1 = "";
		
		if(result == true) {
			year1 = "윤년";
		}else {
			year1 = "평년";
		}
			
		System.out.println(year.get(Calendar.YEAR)+"년은 "+year1+"입니다.");
		System.out.println("총 날짜 수 : " + lc.leapDate(year));
		
		// 강사님 방법
		
//		System.out.println(year.get(Calendar.YEAR)+"년은 "+(result ? "윤년":"평년" )+"입니다.");
//		long total = lc.leapDate(year);
//		System.out.println("총 날짜 수 : " + total);
		
	}
}
