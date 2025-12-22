package Com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.print("인원 수 : ");
		int person = sc.nextInt();
		
		System.out.print("사탕 갯수 : ");
		int candy = sc.nextInt();
		
		System.out.println("1인당 사탕 갯수 : " + (candy / person));
		System.out.println("남은 사탕 갯수 : " + (candy % person));
	}
	
	public void practice2() {
		System.out.print("이름 : ");
		String name = sc.next();		
		System.out.print("학년(숫자만) : ");
		int hak = sc.nextInt();
		System.out.print("반(숫자만) : ");
		int ban = sc.nextInt();
		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();
		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0);
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double grade = sc.nextDouble();
		
		String gen = (gender == 'M' || gender == 'm') ? "남학생" : "여학생";
		
		
		System.out.println(hak + "학년 " + ban + "반 " + num + "번 " + name + " " + 
				gen   + "의 성적은 " + grade + "입니다.");
		
	}
	
	public void practice3() {
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		String result = age <=13 ? "어린이" : 
					   		(age >19 ? "성인" : "청소년"); 
		System.out.println(result);
	}
	
	public void practice4() {
		System.out.print("국어 : ");
		double kor = sc.nextDouble();
	
		System.out.print("영어 : ");
		double eng = sc.nextDouble();
		
		System.out.print("수학 : ");
		double mat = sc.nextDouble();
		
		int total = (int)(kor + eng + mat);
		double avg = total /3;
		
		String result = (kor >= 40) && (mat >= 40) && (eng >= 40) && avg >= 60 ? "합격 ": "불합격"; 
		
		System.out.println("합계 : " + total);
		System.out.println("평균 : " + avg);
		System.out.println(result);
		
		
		
	}

	public void practice5() {
		System.out.print("주민번호를 입력하세요(-포함 14자리) : ");
		String num = sc.next();
		
		String num3 = (num.charAt(7) == '1' || num.charAt(7) == '2' || num.charAt(7) == '3' || num.charAt(7) == '4')
				?((num.charAt(7) == '1' || num.charAt(7) == '3') ? "남자" : "여자") : "잘못된 입력";
		System.out.println(num3);
	}
	
	public void practice6() {
		System.out.print("정수1를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2를 입력하세요 : ");
		int num2 = sc.nextInt();
		System.out.print("숫자를 입력하세요 : ");
		int num3 = sc.nextInt();
		
		boolean result = (num1 < num2 && (num3 <= num1 || num3 > num2)) ? true : false ;
		System.out.println(result);
		
	}

	public void practice7() {
		System.out.print("숫자를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.print("숫자를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		System.out.print("숫자를 입력하세요 : ");
		int num3 = sc.nextInt();
		
		boolean result = (num1 == num2 && num2 == num3 && num3 == num1) ? true : false;
		System.out.println(result);
	}
	
	public void practice8() {
		System.out.print("A사원의 연봉을 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("B사원의 연봉을 입력하세요 : ");
		int num2 = sc.nextInt();
		System.out.print("C사원의 연봉을 입력하세요 : ");
		int num3 = sc.nextInt();
		
		double numA = (num1 * 0.4) + num1;
		double numB = (num2 * 0) + num2;
		double numC = (num3 * 0.15) + num3;
		
		String resultA = numA >= 3000 ? "3000 이상" : "3000 미만";
		String resultB = numB >= 3000 ? "3000 이상" : "3000 미만";
		String resultC = numC >= 3000 ? "3000 이상" : "3000 미만";
		
		System.out.println("\nA사원의 연봉 / 연봉+@ : " + num1 + "/" + numA); 
		System.out.println(resultA);
		System.out.println("B사원의 연봉 / 연봉+@ : " + num2 + "/" + numB); 
		System.out.println(resultB);
		System.out.println("C사원의 연봉 / 연봉+@ : " + num3 + "/" + numC); 
		System.out.println(resultC);
	}
}


