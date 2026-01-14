package com.kh.chap01_thread.run;

public class example {
	/* 	
	[실습문제]
	알파벳 A~Z 까지 출력하는 스레드 생성
	알파벳 a~z 까지 출력하는 스레드 생성
	각 스레드 생성후 main스레드에서 실행.
	출력예시 :
	[대문자쓰레드 시작]
	[소문자쓰레드 시작]
	[대문자쓰레드 : A]
	[대문자쓰레드 : B]
	[소문자쓰레드 : a]
	[대문자쓰레드 : C]
	[소문자쓰레드 : b]
	....
	[소문자쓰레드 : z]
	[대문자쓰레드 : Z]
	[대문자쓰레드 종료]
	[소문자쓰레드 종료]
*/
	public static void main(String[] args) {
		Thread UpperAlpTh = new Thread(() -> {
			System.out.println("[대문자 스레드 시작]");
//			for(int i = 'A'; i <= 'Z'; i++) {
//				System.out.println("[대문자스레드:"+(char)i+"]");
//			}
			for(int i = 0; i<26;i++) {
				System.out.println("[대문자스레드:"+(char)(i+65)+"]");
			}
			System.out.println("[대문자 스레드 종료]");
		});
		
		UpperAlpTh.start();
		
		Thread LowerAlpTh = new Thread(() -> {
			System.out.println("[소문자스레드 시작]");
			for(int i = 0; i<26;i++) {
				System.out.println("[소문자스레드:"+(char)(i+97)+"]");
			}
			System.out.println("[소문자스레드 종료]");
		});
		
		LowerAlpTh.start();
	}
}
