package com.kh.chap02_lamda.part01_basic;

import com.kh.chap02_lamda.model.functional.LambdaTest1;

public class LambdaRun {
/*
 * 함수형 프로그래밍(FP)
 * 	- 함수를 기반으로 코드를 작성하고, 함수를 호출하려 동작하는 프로그래밍을 만드는 방식
 *   즉, 클래스 없이 함수만 작성하여 동작하는 프로그래밍
 *  -객체지향프로그래밍에 비해 작성해야하는 코드의 수가 줄어든다
 *   
 * 객체지향 프로그래밍(OOP)
 *  - 객체를 기반으로 객체간의 상호작용을 통해 동작하는 프로그램을 만드는 방식
 *  - OOP에서는 만들어야하는 기능이 있는경우, 반드시 클래스를 먼저 만들고,
 *    클래스 내부에 함수(메서드)를 추가해야한다.
 *   
 * 람다식(Lambda expression)
 *  - 자바에서 함수형 프로그래밍을 지원하기 위해 JDK 8버전부터 추가된 기능.
 *  - 함수이지만, 함수 이름이 없는 익명함수처럼 사용한다.
 *  - 함수의 작성방식에서 불필요한 부분을(클래스선언, 상속, 함수명)을 걸러낸 후 간결하게 표현한 표현식
 *  
 *  일반메서드 vs 람다식
 *   1. 일반메서드
 *    int add(int x, int y){
 *       return x + y;
 *    }
 *  
 *   2. 람다식
 *    (x , y) -> x + y;
 *  
 */
	
	public static void main(String[] args) {
		LambdaTest1 lambd1 = new LambdaTest1() {
			//익명내부클래스
			@Override
			public int add(int x, int y) {
				return x+y;
			}
		};
		int result = lambd1.add(1, 9);
		System.out.println(result);

	//		람다식
		/*
		 * LambdaTest1인터페이스에 들어갈 수 있는 객체는 무조건 Lambdatest1인터페이스르 ㄹ상속받아 
		 * 추상메서드를 구현한 클래스여야한다.
		 * 익명 내부 클래스의 문법처럼 이름없는 클래스의 형태로 객체를 생성해ㅑㅇ 하지만
		 * 불필요한 코드를 줄이는 방식으로 간소화 되었다.
		 * 
		 * 함수형 인터페이스는 고정적으로 1개의 추상메서드만 보관하고 있으므로, 구현해야할 향수의 이름, 반환형
		 * 매개변수의 자료형등은 생략이 가능하다.
		 */
		LambdaTest1 lambd2 = (int x,int y) ->{
			return x + y;

		}
		;
		result = lambd2.add(2, 5);
		System.out.println(result);
	}
}