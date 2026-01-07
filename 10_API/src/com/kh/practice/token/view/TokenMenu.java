package com.kh.practice.token.view;

import java.util.Scanner;

import com.kh.practice.token.controller.TokenController;

public class TokenMenu {
	private Scanner sc = new Scanner(System.in);
	private TokenController tc = new TokenController();

	public void mainMenu() {
		while (true) {
			System.out.println("1. 지정 문자열\n" + "2. 입력 문자열\n" + "3. 프로그램 끝내기\n");
			System.out.print("메뉴 번호 : ");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				tokenMenu();
				break;
			case 2:
				inputMenu();
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
		}
	}

	public void tokenMenu() {
		String str = "J a v a P r o g r a m ";
		System.out.println("토큰 처리 전 글자 : " + str);
		System.out.println("토큰 처리 전 개수 : " + str.length());
		
		str = tc.afterToken(str);
		
		System.out.println("토큰 처리 후 글자 : " + str);
		System.out.println("토큰 처리 후 개수 : " + str.length());
		System.out.println("모든 문자열 대문자로 변환 : " + str.toUpperCase());
	}

	public void inputMenu() {
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.next();
		
		str = tc.firstCap(str);
		System.out.println(str);
		
		System.out.print("찾을 문자를 하나 입력하세요 : ");
		char ch = sc.next().charAt(0);
		
		System.out.println(ch + " 문자가 들어간 개수 : " + tc.findChar(str, ch));
		
		
//			// tc에 firstCap()로 입력 받은 문자열을 넘기고 반환 값 출력
//			찾을 문자를 하나 입력하세요 :
//			// tc에 findChar()로 위에 입력 받은 문자열과 방금 받은 문자를 인자로 넘겨
//			// 반환 값 출력
//			}
	}

}
