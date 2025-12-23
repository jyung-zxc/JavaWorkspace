package Com.kh.practice.chpe02.loop;

import java.util.Scanner;

public class LoopPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			if(num < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				continue;
				}else {
				for(int i=1;i<=num;i++) {
					System.out.print(i+" ");
				}
			}System.out.println();
			return;
			
		}
	}

	public void practice2() {
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			if(num < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				continue;
				}else {
				for(int i=num;i>=1;i--) {
					System.out.print(i+" ");
				}
			}System.out.println();
			return;
			
		}
	}

	public void practice3() {
		System.out.print("정수를 입력해주세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		for(int i=1;i<=num;i++) {
			sum+=i;
		}
		System.out.println(" = "+sum);
	}

	public void practice4() {

		/*
		 * }else if(num2>num1){
				for(int i=num2;i>=num1;i--) {
					System.out.print(i+" ");
				}
			}else if(num1>num2){
				for(int i=num1;i>=num2;i--) {
					System.out.print(i+" ");
				}
		 */
		while(true) {
		System.out.print("첫번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자 : ");
		int num2 = sc.nextInt();
			if(num1 < 1 || num2<1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				continue;
				}else if(num2>num1){
				for(int i=num1;i<=num2;i++) {
					System.out.print(i+" ");
				}
			}else {
				for(int i=num2;i<=num1;i++) {
					System.out.print(i+" ");
				}
			}System.out.println();
			return;
			
		}
	}

	public void practice5() {
		while(true) {
			System.out.print("숫자를 입력해주세요 : ");
			int num = sc.nextInt();
			if(num<2||num>9) {
				
				System.out.println("2이상 9이하의 숫자만 입력해주세요.");
				continue;
			}else {
				for(int i=num;i<=9;i++) {
					System.out.println("===="+i+"단 ====");
					for(int j=1;j<=9;j++) {
						System.out.println(i+" x "+j+" = " +(i*j));
					}
				}
			}return;
		}
	}


	public void practice6() {
		System.out.print("시작 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("공차 : ");
		int num2 = sc.nextInt();
		
		System.out.print(num1);
		
		if(num2>0) {
			for(int i = 1;i<=9;i++) {
				System.out.print(" "+ (num1+=num2));
			}
			}else {
			for(int i = 1;i<=9;i++) {
			System.out.print(" "+ (num1+=num2));
		}
				
		}
	}

	public void practice7() {
		while(true) {
			System.out.print("연산자(+, -, *, /, %) : ");
			String opr = sc.next();
			
			if(opr.equals("exit")){
				System.out.println("프로그램을 종료합니다");
				return;
			}
			
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			
			int result = 0;
			
			if (!(num1 < 0 && num2 < 0)) {
				switch (opr) {
				case "+":
					result = num1 +  num2;
					break;
				case "-":
					result = num1 -  num2;
					break;
				case "*":
					result = num1 * num2;
					break;
				case "/":
					if(num2 == 0) {
						System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
						break;
					}else {
						result = num1 /  num2;
						break;
					}
				case "%":
					if(num2 == 0) {
						System.out.println("0으로 나머지를 구할 수 없습니다. 다시 입력해주세요.");
						break;
					}else {
						result = num1 % num2;
						break;
					}
				default:
					System.out.println("없는 연산자입니다. 다시 입력해주세요.");			
					continue;
				} //스위치				
			}// if
			if(!(num2==0)) {
				System.out.println(num1 + " " + opr + " " + num2 + " " + "=" + " " + result);
			}
		} //while
	}//pratice
	
	public void practice8() {
		System.out.print("정수 : ");
		int num = sc.nextInt();
		for(int i=1;i<=num;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice9() {
		System.out.print("정수 : ");
		int num = sc.nextInt();
		for(int i=num;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice10() {
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num<2) {
			System.out.println("잘못 입력하였습니다.");
			return;
		}
		
		if(num==2) {
			System.out.println("소수입니다.");
			return;
		}
		
		for(int i=2;i<num;i++) {
			if(num % i == 0) {
				System.out.println("소수가 아닙니다.");
				return;
			}

		}
		System.out.println("소수입니다.");
		return;
	}	

	public void practice11() {
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		int num2 = 0;
		
		if(num<2) {
			System.out.println("잘못 입력하였습니다.");
			return;
		}
		for(int i=2;i<num;i++) {
			if(!(num % i == 0)) {
				System.out.println(i);
				num2++;
			}
		}
		System.out.println(2 + "부터 " + num +"까지 소수의 개수는" + num2 +"개입니다.");
		return;
	}
	
	public void practice12() {
			System.out.print("자연수 하나를 입력하세요 : ");
			int num = sc.nextInt();
			
			int count = 0;
			if(num<1) {
				System.out.println("잘못 입력했습니다.");
			} else {	
			for(int i=1;i<=num;i++) {
				if(i % 2 == 0 || i % 3 == 0) {
					System.out.print(i + " ");	
				}
				if(i % 2 == 0 && i % 3 == 0) {
					count++;	
				}
			}System.out.println("\ncount : " + count);
		}
	}
}//looppratice
