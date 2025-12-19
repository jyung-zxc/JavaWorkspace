package Com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("±¹¾î : ");
		double kor = sc.nextDouble();
	
		System.out.print("¿µ¾î : ");
		double eng = sc.nextDouble();
		
		System.out.print("¼öÇÐ : ");
		double mat = sc.nextDouble();
		
		int total = (int)(kor + eng + mat);
		int avg = total /3;
		
		System.out.println("ÃÑÁ¡ : " + total);
		System.out.println("Æò±Õ : " + avg);
		
	}
}
