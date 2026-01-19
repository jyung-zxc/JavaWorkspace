package com.kh.practice.lambda;

import com.kh.practice.lambda.LamdaPractice3.MyFunction;

public class LamdaPractice4 {
	public static void main(String[] args) {
		MyFunction2<String, Integer> printer = (str,num) -> {
			if(num >= 90) {
				System.out.println(str+"님의 점수는 A학점("+num+")입니다.");
			}else if(num >= 80) {
				System.out.println(str+"님의 점수는 B학점("+num+")입니다.");
			}else if(num >= 70) {
				System.out.println(str+"님의 점수는 C학점("+num+")입니다.");
			}else if(num >= 60) {
				System.out.println(str+"님의 점수는 D학점("+num+")입니다.");
			}
			
		};
	}
//		MyFunction2<String, Integer> printer = (name,num) -> {
//			char grade = 'F';
//			if(num >= 90) {
//				grade = 'A';
//			}else if(num >= 80) {
//				grade = 'B';
//			}else if(num >= 70) {
//				grade = 'C';
//			}else if(num >= 60) {
//				grade = 'D';
//			}
//			System.out.printf("%s님의 점수는 %s학점(%d)입니다.\n"name,grade,num);
//		};
//		printer.accpet("홍길동",95);
//		printer.accpet("이순신",88);
//	}
	
	@FunctionalInterface
	interface MyFunction2<K, A>{
		void accpet(K k, A a);
	}
}
