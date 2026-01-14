package com.kh.practice.map.view;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import com.kh.practice.map.controller.MemberController;
import com.kh.practice.map.model.vo.Member;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();

	public void mainMenu() {
		while (true) {
			System.out.println("========== KH 사이트 ==========" + "\n******* 메인 메뉴 *******" + "\n1. 회원가입" + "\n2. 로그인"
					+ "\n3. 같은 이름 회원 찾기" + "\n9. 종료");
			System.out.print("메뉴 번호 선택 :");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				joinMembership();
				break;
			case 2:
				login();
				memberMenu();
				break;
			case 3:
				sameName();
				break;
			case 9:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
	}

	public void memberMenu() {
		while (true) {
			System.out.println("******* 회원 메뉴 *******" + "\n1. 비밀번호 바꾸기" + "\n2. 이름 바꾸기" + "\n3. 로그아웃");

			System.out.print("메뉴 번호 선택 :");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				changePassword();
				break;
			case 2:
				changeName();
				break;
			case 3:
				System.out.println("로그아웃 되었습니다.");
				mainMenu();
				break;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
	}

	public void joinMembership() {
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("비밀번호 : ");
		String password = sc.next();
		System.out.print("이름 : ");
		String name = sc.next();

		Member m = new Member(password, name);
		boolean result = mc.joinMembership(id, m);

		if (result) {
			System.out.println("성공적으로 회원가입 완료하였습니다.");
		} else {
			System.out.println("중복된 아이디입니다. 다시 입력해주세요");
		}
	}

	public void login() {
		while (true) {
			System.out.print("아이디 : ");
			String id = sc.next();
			System.out.print("비밀번호 : ");
			String password = sc.next();

			String result = mc.login(id, password);
			if (result == null) {
				System.out.println(id + "님, 환영합니다!");
				break;
			} else {
				System.out.println("틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요.");
			}
		}
	}

	public void changePassword() {
		while (true) {
			System.out.print("아이디 : ");
			String id = sc.next();
			System.out.print("현재 비밀번호 : ");
			String oldpw = sc.next();
			System.out.print("변경할 비밀번호 : ");
			String newpw = sc.next();

			boolean result = mc.changePassword(id, oldpw, newpw);
			if (result) {
				System.out.println("비밀번호 변경에 성공했습니다.");
				break;
			} else {
				System.out.println("비밀번호 변경에 실패했습니다. 다시 입력해주세요.");
				
			}
		}
	}

	public void changeName() {
		while(true) {
			System.out.print("아이디 : ");
			String name = sc.next();
			System.out.print("비밀번호 : ");
			String password = sc.next();
			
			String n = mc.login(name, password);
			
			if(n == null) {
				System.out.println("이름 변경에 실패했습니다.");
				changeName();
				return;
			}
			System.out.println("현재 설정된 이름 : " +n);
			
			System.out.print("변경할 이름 : ");
			String cname = sc.next();
			
			mc.changeName(name, cname);
			System.out.println("이름 변경에 성공하였습니다.");
		}
	}

	public void sameName() {
		System.out.print("검색할 이름 : ");
		String name = sc.next();
		
		TreeMap<String,String> map = mc.sameName(name);
		Set<Entry<String,String>> entrys = map.entrySet();
		for(Entry<String,String> entry : entrys) {
			System.out.println(entry.getValue()+"-"+entry.getKey());
		}
		
	}

}
