package com.kh.practice.lambda;

public class LamdaPractice1 {
	public static void main(String[] args) {
		String[] arr= {"java","lambda","hi","functional","wow"};
		printStrings(arr, (str) -> str.length() <= 3); // 길이가 3 이하인 문자열
		printStrings(arr, (str) -> str.contains("a")); // a가 포함된 문자열
		printStrings(arr, (str) -> str.startsWith("w")); // w로 시작하는 문자열
		printStrings(arr, (str) -> str.length() % 2 == 0 && str.contains("a")); // 문자열 길이가 짝수이면서 a가 포함된 문자열
	}
	
	public static void printStrings(String[]arr, StringChecker checker) {
		for(String str : arr) {
			if(checker.check(str)) {
				System.out.println(str);
			}
		}
	}
	
	@FunctionalInterface
	interface StringChecker{
		boolean check(String str);
	}
}
