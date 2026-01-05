package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();

	public MemberMenu() {

	}

	public void mainMenu() {
		while (true) {
			int memberNum = mc.existMemberNum();
			System.out.println("최대 등록 가능한 회원 수는" + 10 + "명 입니다.");
			System.out.println("현재 등록된 회원 수는" + mc.existMemberNum() + "명 입니다.");

			if (memberNum != MemberController.SIZE) {
				System.out.println("1. 새 회원 등록");

			} else {
				System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
			}
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("5. 모두 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				if (memberNum != MemberController.SIZE) {
					insertMember();
					break;
				} else {
					System.out.println("잘못 입력했습니다.");
				}
			case 2:
				searchMember();
				break;
			case 3:
				updateMember();
				break;
			case 4:
				deleteMember();
				break;
			case 5:
				printAll();
				return;
			case 9:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
				return;
			}
		}
	}

	public void insertMember() {
		// 회원 등록에 필요한 아이디, 이름, 비밀번호, 이메일, 성별, 나이를
		// 사용자에게 직접 입력
		System.out.print("아이디 : ");
		String id = sc.next();

		boolean isDup = mc.checkId(id);
		if (isDup) { // 중복인 경우
			System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			insertMember();
			return;
		}

		System.out.print("이름 : ");
		String name = sc.next();

		System.out.print("비밀번호 : ");
		String password = sc.next();

		System.out.print("이메일 : ");
		String email = sc.next();

		char gender = '\u0000';
		while (true) {
			System.out.print("성별 : ");
			gender = sc.next().toUpperCase().charAt(0);

			if (gender == 'M' || gender == 'F') {
				break;
			}
			System.out.println("성별을 다시 입력하세요.");
		}
		System.out.print("나이 : ");
		int age = sc.nextInt();

		mc.insertMember(id, name, password, email, gender, age);

	}

	public void searchMember() {

		System.out.println("1. 아이디로 검색하기");
		System.out.println("2. 이름으로 검색하기");
		System.out.println("3. 이메일로 검색하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int menu = sc.nextInt();

		switch (menu) {
		case 1:
			searchId();
			break;
		case 2:
			searchName();
			break;
		case 3:
			searchEmail();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다.");
			return;
		default:
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
	}

	public void searchId() {
		System.out.print("검색할 아이디 : ");
		String searchId = sc.next();

		String result = mc.searchId(searchId);

		if (result != null) {
			System.out.println("찾으신 회원 조회 결과입니다.");
			System.out.println(result);
		} else {
			System.out.println("검색 결과가 없습니다.");
		}
	}

	public void searchName() {
		System.out.print("검색할 이름 : ");
		String searchName = sc.next();

		Member[] result = mc.searchName(searchName);

		if (result != null) {
			System.out.println("찾으신 회원 조회 결과입니다.");
			for (Member m : result) {
				System.out.println(m.inform());
			}
		} else {
			System.out.println("검색 결과가 없습니다.");
		}
	}

	public void searchEmail() {
		System.out.print("검색할 이메일 : ");
		String searchEmail = sc.next();

		Member[] result = mc.searchEmail(searchEmail);

		if (result != null) {
			System.out.println("찾으신 회원 조회 결과입니다.");
			for (Member m : result) {
				System.out.println(m.inform());
			}
		} else {
			System.out.println("검색 결과가 없습니다.");
		}
	}

	public void updateMember() {
		System.out.println("1. 비밀번호 수정하기");
		System.out.println("2. 이름 수정하기");
		System.out.println("3. 이메일 수정하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int menu = sc.nextInt();

		switch (menu) {
		case 1:
			updatePassword();
			break;
		case 2:
			updateName();
			break;
		case 3:
			updateEmail();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다.");
			return;
		default:
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
	}

	public void updatePassword() {
		System.out.print("수정할 회원 id : ");
		String id = sc.next();

		System.out.print("수정할 회원 pwd : ");
		String password = sc.next();

		boolean result = mc.updatePassword(id, password);
		if (result) {
			System.out.println("비밀번호 변경 성공");
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
	}

	public void updateName() {

	}

	public void updateEmail() {

	}

	public void deleteMember() {
		System.out.println("1. 특정 회원 삭제하기");
		System.out.println("2 모든 회원 삭제하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int menu = sc.nextInt();

		switch (menu) {
		case 1:
			deleteOne();
			break;
		case 2:
			deleteAll();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다.");
			return;
		default:
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
	}

	public void deleteOne() {
		System.out.print("삭제할 회원 id : ");
		String id = sc.next();

		System.out.print("정말 삭제하시겠습니까(y/n) : ");
		char ch = sc.next().toUpperCase().charAt(0);

		if (ch != 'Y') {
			System.out.println("메인으로 돌아갑니다.");
			return;
		}

		boolean result = mc.delete(id);
		if (result) {
			System.out.println("성공적으로 삭제하였습니다.");
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
	}

	public void deleteAll() {
		System.out.print("정말 삭제하시겠습니까(y/n) : ");
		char ch = sc.next().toUpperCase().charAt(0);

		if (ch != 'Y') {
			System.out.println("메인으로 돌아갑니다.");
			return;
		}

		mc.delete();
		System.out.println("성공적으로 삭제하였습니다.");
	}

	public void printAll() {
		Member[] m = mc.printAll();
		int memberNum = mc.existMemberNum();
		if(memberNum == 0) {
			System.out.println("저장된 회원이 없습니다.");
			return;
		}
		
		for(Member mem : m) {
			if(mem != null) {
				System.out.println(mem.inform());
			}
		}
		
	}
}
