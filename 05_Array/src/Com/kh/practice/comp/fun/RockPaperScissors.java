package Com.kh.practice.comp.fun;

import java.util.Arrays;
import java.util.Scanner;

public class RockPaperScissors {
	Scanner sc = new Scanner(System.in);
	
	public void rps() {
		System.out.print("당신의 이름을 입력해주세요 :");
		String name = sc.next();
		
		int win = 0;
		int lose = 0;
		int draw = 0;
		int total = 0;
		
		while(true) {
			int rand = (int) (Math.random()*3);
			//System.out.println(rand);	
			System.out.print("가위바위보 :");
			String rps = sc.next();
			String [] arr = {"가위","바위","보"};
			
			System.out.println("컴퓨터 :"+(String)(arr[rand]));
			System.out.println(name + " :" + rps);
			
			//System.out.println(Arrays.toString(arr));
			switch(rps) {
			case "가위":
				System.out.println("비겼습니다.");
			}
		}
		
	}
}
