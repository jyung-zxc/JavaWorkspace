package Com.kh.practice.comp.fun;

import java.util.Scanner;

public class UpAndDown {
	Scanner sc = new Scanner(System.in);
	public void upDown() {
		int rand = (int) (Math.random()*100+1);
		System.out.println(rand);
		
		for(int i = 1; i<=100;i++) {
			System.out.print("1~100 사이의 임의의 난수를 맞춰보세요 :");
			int num = sc.nextInt();
			
			if(num<=100 && num >0 ) {
				if(rand < num) {
					System.out.println("Down");
				}else if(rand>num) {
					System.out.println("UP");
				}else if(rand == num) {
					System.out.println(i+"회만에 맞추셨습니다.");
					return;
				}
			}else {
				System.out.println("1~100사이의 숫자를 입력해주세요.");
			}
		}
	}
}
