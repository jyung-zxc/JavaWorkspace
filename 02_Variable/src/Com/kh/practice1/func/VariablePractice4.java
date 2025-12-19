package Com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {
	Scanner sc = new Scanner(System.in);
	
	public void practice4() {
		
		System.out.print("문자열을 입력하세요 : ");
		String text = sc.nextLine();
		
		System.out.println("첫 번째 문자 : " + text.charAt(0));
		System.out.println("두 번째 문자 : " + text.charAt(1));
		System.out.println("세 번째 문자 : " + text.charAt(2));
		
	}
}
