package com.kh.hw.member.controller;

import java.util.Arrays;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
	private Member[] m = new Member[SIZE];
	public final static int SIZE = 10;

	public int existMemberNum() {
		int count = 0;
		for (Member mem : m) {
			// 객체가 초기화 된경우
			if (mem != null) {
				count++;
			}
		}
		return count;
	}

	public boolean checkId(String inputId) {
		// 아이디 중복확인 하는 메서드
		boolean isDup = false;
		for (Member mem : m) {
			// 객체배열에 저장된 Member 객체의 id값과 사용자가 입력한 id값을 비교.
			if (mem != null && inputId.equals(mem.getId())) {
				isDup = true;
				break;
			}
		}

		return isDup;
	}

	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		// 전달받은 데이터로 객체 생성.
		Member mem = new Member(id, name, password, email, gender, age);

		// 생성한 객체를 객체배열상 비어있는부분(null값)에 저장
		for (int i = 0; i < m.length; i++) {
			if (m[i] == null) {// 빈공간
				m[i] = mem;
				break;
			}
		}
	}

	public String searchId(String id) {
		// Member 객체 배열에서 id와 일치하는 회원의 정보를 찾은 후, 회원의 정보를 반환.
		for (Member mem : m) {
			if (mem != null && mem.getId().equals(id)) {
				return mem.inform();
			}
		}
		return null;
	}

	public Member[] searchName(String name) {
		Member[] m = new Member[SIZE];

		int index = 0;
		for (Member mem : this.m) {
			if (mem != null && mem.getName().equals(name)) {
				m[index++] = mem;
			}
		}
		// 찾고자 하는 회원이 한명도 없는 경우
		if (index == 0) {
			return null;
		} else {
			Member[] copy = Arrays.copyOf(m, index);
			return copy;
		}
	}

	public Member[] searchEmail(String email) {
		Member[] m = new Member[SIZE];

		int index = 0;
		for (Member mem : this.m) {
			if (mem != null && mem.getEmail().equals(email)) {
				m[index++] = mem;
			}
		}
		// 찾고자 하는 회원이 한명도 없는 경우
		if (index == 0) {
			return null;
		} else {
			Member[] copy = Arrays.copyOf(m, index);
			return copy;
		}
	}

	public Boolean updatePassword(String id, String password) {
		for (int i = 0; i < m.length; i++) {
			Member mem = m[i];
			if (mem != null && mem.getId().equals(id)) {
				mem.setPassword(password);// 비밀번호 변경
				return true;
			}
		}
		return false;
	}

	public Boolean updateName(String id, String name) {
		return false;
	}

	public Boolean updateEmail(String id, String email) {
		return false;
	}

	public Boolean delete(String id) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && m[i].getId().equals(id)) {
				m[i] = null; // 삭제처리
				return true;
			}
		}
		return false;
	}

	public void delete() {
		//전체 회원을 삭제하는 메소드
		m = new Member[SIZE];
	}

	public Member[] printAll() {
		return m;
	}
}
