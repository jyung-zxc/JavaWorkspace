package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.*;

public class LibraryMenu {
	private LibraryController lc = new LibraryController();
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("성별 : ");
		char gender = sc.next().toUpperCase().charAt(0);
		
		Member mem = new Member (name,age,gender);
		lc.insertMember(mem);
		
		while(true) {
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 마이페이지\n" 
			+"2. 도서 전체 조회\n"
			+"3. 도서 검색\n"
			+"4. 도서 대여하기\n"
			+"9. 프로그램 종료하기");
			System.out.print("메뉴 번호: ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				lc.myinfo();
				System.out.println(mem);
				break;
			case 2:
				selectAll();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				rentBook();
				break;
			case 9:
				return;
			}
		}
	}
	
	public void selectAll() {
		lc.selectAll();
	}
	
	public void searchBook() {
		
	}
	
	public void rentBook() {
		
	}
}
