package com.kh.chap01_innerClass.part02_static;

public class OuterClass2 {
	private String str = "필드";
	private static String staticstr = "정적필드";
	
	/*
	 * 정리 내부 클래스
	 *  - 외부클래스가 로드뇌는 시점에서 정적 내부클래스로도 함께 static영억으로 지정한다.
	 *  - 외부클래스에 종족억이지 않다.
	 *  - 하나의 클래스파일에 다양한 클래스풀 설계할 때, 주로 사용한다(DTO)
	 *  - 외부클래스와 무관하게 다른 클래스에서도 이용할 목적으로 이용한다.
	 */
	
	public static class stationInnerClass{
		private int num = 100;
		private static int num2 = 100;
		
		public void test() {
//			System.out.println(str);
			System.out.println(staticstr);
			System.out.println(num);
			System.out.println(num2);
		}
	}
}
