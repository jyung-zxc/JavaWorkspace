package com.kh.practice.chap02_abstractNInterface.controller;

import com.kh.practice.chap02_abstractNInterface.model.vo.*;

public class PhoneController {
//	GalaxyNote9 gn = new GalaxyNote9();
//	V40 v = new V40();
	
	private String[] result = new String[2];
	
	public String[] method() {
		Phone[] arr = new Phone[2];
		arr[0] = new GalaxyNote9();
		arr[1] = new V40();
		
		for(int i =0; i<arr.length; i++) {
			//1안 downcasting
			result[i] = ((SmartPhone)arr[i]).printinformation();
			
//			//2안 instanceof
//			if(arr[i] instanceof V40) {
//				result[i] = ((V40)arr[i]).printinformation();
//			}else if(arr[i] instanceof GalaxyNote9) {
//				result[i] = ((GalaxyNote9)arr[i]).printinformation();
//			}
		}
		return result;
//		result[0] = gn.printinformation();
//		result[1] = v.printinformation();
		
		
	}
}
