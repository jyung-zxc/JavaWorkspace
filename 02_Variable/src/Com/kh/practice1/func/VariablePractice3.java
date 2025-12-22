package Com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double num1 = sc.nextDouble();
		
		System.out.print("세로 : ");
		double num2 = sc.nextDouble();
		
		double area = num1 * num2;
		double peri = (num1 + num2) * 2;
		
		System.out.println("면적 : " + area);
		System.out.println("둘레 : " + peri);
		System.out.println("둘레 : " + (num1 + num2) * 2);
	}
}
