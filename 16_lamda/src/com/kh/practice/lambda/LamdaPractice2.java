package com.kh.practice.lambda;

import java.util.Scanner;

public class LamdaPractice2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자1 : ");
		int n1 = sc.nextInt();
		System.out.print("숫자2 : ");
		int n2 = sc.nextInt();
		
		Calculator<Integer> adder = (v1 , v2) -> v1 * v2;
		System.out.println(adder.operate(n1, n2));
		Calculator<Integer> findMax = (v1, v2) -> (v1 > v2) ? v1 : v2;	
		System.out.println(findMax.operate(n1, n2));
		Calculator<String> combiner = (s1,s2) -> s1 +"-"+ s2;
		System.out.println(combiner.operate("hello", "world"));
	}
	
	@FunctionalInterface
	interface Calculator<V>{
		V operate(V v1, V v2);
		
	}
}
