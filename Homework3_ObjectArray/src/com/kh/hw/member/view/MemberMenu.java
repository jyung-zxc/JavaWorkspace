package com.kh.hw.member.view;

public class MemberMenu {

	public void mainMenu() {
		최대 등록 가능한 회원 수는 10명입니다.
		현재 등록된 회원 수는 0명입니다.
		// MemberController(mc)클래스 안에 있는 멤버필드를 이용하여
		// 최대 등록 가능한 회원 수가 몇 명인지 출력
		// 또한 현재 등록된 회원 수는 mc에 existMemberNum()의 반환 값으로
		// 몇 명이 등록되어 있는지 출력
		// 현재 등록된 회원 수에 따라 메인 메뉴를 다르게 출력
		// 현재 등록된 회원 수가 10명이 아닐 때
		1. 새 회원 등록 ➔ insertMember()
		2. 회원 검색 ➔ searchMember()
		3. 회원 정보 수정 ➔ updateMemner()
		4. 회원 삭제 ➔ deleteMember()
		5. 모두 출력 ➔ printAll()
		9. 끝내기
		메뉴 번호 :
		// 현재 등록된 회원 수가 10명일 때
		회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.
		2. 회원 검색 ➔ searchMember()
		3. 회원 정보 수정 ➔ updateMemner()
		4. 회원 삭제 ➔ deleteMember()
		5. 모두 출력 ➔ printAll()
		9. 끝내기
		메뉴 번호 :
		// 두 경우 모두 끝내기를 누르면 “프로그램을 종료합니다” 출력 후
		// 프로그램 종료하고 메뉴 번호에 없는 번호를 누를 시
		// “잘못 입력하셨습니다. 다시 입력해주세요.” 출력 후 메뉴 반복
		
	}

}
