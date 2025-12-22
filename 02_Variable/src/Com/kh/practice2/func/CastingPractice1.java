package Com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double kor = sc.nextDouble();
	
		System.out.print("영어 : ");
		double eng = sc.nextDouble();
		
		System.out.print("수학 : ");
		double mat = sc.nextDouble();
		
		int total = (int)(kor + eng + mat);
		int avg = total /3;
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		
	}
}
