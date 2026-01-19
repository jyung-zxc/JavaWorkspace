package com.kh.practice.lambda;

import java.util.Scanner;

public class LamdaPractice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String s = sc.next();

		MyFunction<String, String> first = str -> str.toUpperCase();
		System.out.println(first.apply(s));

		MyFunction<String, Boolean> second = str -> str.length() >= 5;
		System.out.println(second.apply(s));

		MyFunction<String, String> third = str -> str;
		for (int i = 0; i < s.length(); i++) {
			System.out.print(third.apply(s).charAt(i));
			if (i < s.length() - 1) {
				System.out.print("-");
			}
		}

	}
//		MyFunction <String, String> third = str -> str{
//			String[] arr = str.split("");
//			StringBuilder sb = new StringBuilder();
//			for(String s : arr) {
//				sb.append(s).append("-");
//			}
//			sb.deleteCharAt(sb.length()-1);
//			
//			return sb.toString();
//		};
//		System.out.println("lambda");
//	}

	@FunctionalInterface
	interface MyFunction<V, B> {
		B apply(V v);
	}
}
