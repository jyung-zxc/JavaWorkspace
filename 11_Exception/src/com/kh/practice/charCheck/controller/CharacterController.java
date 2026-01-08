package com.kh.practice.charCheck.controller;

import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterController {

	public CharacterController() {

	}

	public int countAlpha(String s) throws CharCheckException {
		if(s.contains(" ")) {
			throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");
		}

		char[] str = s.toCharArray();
//		char[] str = s.toUpperCase().toCharArray();
		
		int count = 0;
		
//		A = 65~90 97~122
		for(int i=0;i<str.length;i++) {
			if(((int)str[i]>=65 &&(int)str[i] <= 90) || ((int)str[i]>=97 && (int)str[i] <= 122)) {
				count++;
			}
		}
		
		//강사님 방법
//		for(char ch : str) {
//			//각 문자가 영문자인지 검사.
//			// 'A' , 'Z'
//			if(ch>='A' && ch<= 'Z') {
//				count++;
//			}
//		}
		
		// 매개변수로 들어온 값에 있는 영문자를 세어 반환
		// 문자열에 공백이 있다면 CharCheckException발생, 에러 메시지는 출력 값 참고
		
		return count;
	}
}
