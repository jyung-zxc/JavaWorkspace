package Com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");

		System.out.print("메뉴 번호를 입력하세요 : ");
		int menu = sc.nextInt();

		if (menu == 1) {
			System.out.println("입력 메뉴입니다.");
		} else if (menu == 2) {
			System.out.println("수정 메뉴입니다.");
		} else if (menu == 3) {
			System.out.println("조회 메뉴입니다.");
		} else if (menu == 4) {
			System.out.println("삭제 메뉴입니다.");
		} else if (menu == 7) {
			System.out.println("종료 메뉴입니다.");
			System.out.println("프로그램이 종료됩니다.");
			return;
		} else {
			System.out.println("잘못된 입력입니다.");
		// return; = 메서드 내 어디서든 사용가능 , 현재 위치에서 메서드를 "종료"시키는 키워드 
		} // break;
	}

	public void practice2() {
		System.out.print("정수를 입력해주세요 : ");
		int num = sc.nextInt();

		if (num > 0 && num % 2 == 0) {
			System.out.println("짝수다");
		} else if (num > 0 && num % 2 != 0) {
			System.out.println("홀수다");
		} else {
			System.out.println("양수만 입력해주세요.");
		}
		/*if(num>0) {
			if(num % 2 == 0) {
				System.out.println("짝수다");
			}else {
				System.out.println("홀수다");
			}
		}else {
			System.out.println("양수만 입력해주세요.");
		}*/
	}

	public void practice3() {
		System.out.print("국어점수를 입력해주세요. :");
		int kor = sc.nextInt();
		System.out.print("영어점수를 입력해주세요. :");
		int eng = sc.nextInt();
		System.out.print("수학점수를 입력해주세요. :");
		int mat = sc.nextInt();

		int total = kor + eng + mat;
		double avg = total / 3;

		if (kor >= 40 && eng >= 40 && mat >= 40 && avg >= 60) {
			System.out.println("국어 : " + kor );
			System.out.println("영어 : " + eng);
			System.out.println("수학 : " + mat);
			System.out.println("합계 : " + total);
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
	}

	public void practice4() {
		System.out.print("1~12 사이의 정수 입력 : ");
		int num = sc.nextInt();

		String season = "";

		switch (num) {
		case 1, 2, 12:
			season = "겨울입니다.";
			break;
		case 3, 4, 5:
			season = "봄입니다.";
			break;
		case 6, 7, 8:
			season = "여름입니다.";
			break;
		case 9, 10 , 11:
			season = "가을입니다.";
			break;
		default:
			season = "잘못 입력된 달입니다.";
			return;
		}
		System.out.println(num + "월은 " + season);
	}

	public void practice5() {
		String rid = "wowo"; 
		String rpw = "wo1234";

		System.out.print("아이디를 입력해주세요 : ");
		String id = sc.next();
		System.out.print("패스워드를 입력해주세요 : ");
		String pw = sc.next();

		if (id.equals(rid) && pw.equals(rpw)) {
			System.out.println("로그인 성공");
			return;
		} else if (id.equals(rid)) {
			System.out.println("비밀번호가 틀렸습니다.");
			return;
		} else {
			System.out.println("아이디가 틀렸습니다.");
			return;
		}
	}

	public void practice6() {
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String member = sc.next();

		switch (member) {
		case "관리자":
			System.out.println("회원관리, 게시글 관리 ");
			//break;
		case "회원":
			System.out.println("게시글 작성, 댓글 작성");
			//break;
		case "비회원":
			System.out.println("게시글 조회");
			//break;

		}
	}

	public void practice7() {
		System.out.print("키(m)를 입력해주세요 : ");
		double hei = sc.nextDouble();

		System.out.print("몸무게(kg)를 입력해주세요 : ");
		double wei = sc.nextDouble();

		double bmi = (wei / (hei * hei));
		System.out.println("BMI 지수 : " + bmi);
		if (bmi < 18.5) {		
			System.out.println("저체중");
		} else if (bmi >= 18.5 && bmi < 23) {
			System.out.println("정상체중");
		} else if (bmi >= 23 && bmi < 25) {
			System.out.println("과체중");
		} else if (bmi >= 25 && bmi < 30) {
			System.out.println("비만");
		} else {
			System.out.println("고도비만");
		}
	}

	public void practice8() {
		System.out.print("피연산자1 입력 :");
		double num1 = sc.nextDouble();
		System.out.print("피연산자2 입력 :");
		double num2 = sc.nextDouble();

		System.out.print("연산자(+,-,*,/,%)를 입력 :");
		String opr = sc.next();

		double result = 0;

		if (num1 > 0 && num2 > 0) {
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
				result = num1 /  num2;
				break;
			case "%":
				result = num1 % num2;
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");			
				return;
			} 	
		} else {
			System.out.println("오류");
			return;
		}
		System.out.println(num1 + " " + opr + " " + num2 + " " + "=" + " " + result);
	}

	public void practice9() {
		System.out.print("중간 고사 점수 :");
		int midtest = sc.nextInt();
		System.out.print("기말 고사 점수 :");
		int finaltest = sc.nextInt();
		System.out.print("과제 점수 :");
		int report = sc.nextInt();
		System.out.print("출석 회수 :");
		double day = sc.nextDouble();

		double mid1 = midtest * 0.2;
		double fin1 = finaltest * 0.3;
		double rp1 = report * 0.3;

		double total = mid1 + fin1 + rp1 + day;

		System.out.println("============ 결과 ============");
		if (total >= 70 && day > 14) {
			System.out.println("중간 고사 점수(20) : " + mid1);
			System.out.println("기말 고사 점수(30) : " + fin1);
			System.out.println("과제 점수	  (30) : " + rp1);
			System.out.println("출석 점수    (20) : " + day);
			System.out.println("총점 : " + total);
			System.out.println("Pass");
		} else if (day <= 14) {
			System.out.println("Fail [출석 회수 부족 (" + (int)day + "/20)]");
		} else {
			System.out.println("총점 : " + total);
			System.out.println("Fail");
		}
	}

	public void practice10() {
		
		
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");
		System.out.print("선택 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			practice1();
			break;
		case 2:
			practice2();
			break;
		case 3:
			practice3();
			break;
		case 4:
			practice4();
			break;
		case 5:
			practice5();
			break;
		case 6:
			practice6();
			break;
		case 7:
			practice7();
			break;
		case 8:
			practice8();
			break;
		case 9:
			practice9();
			break;
			default:
				System.out.println("잘못 입력하셨습니다");
				return;
		}
		
	}
	
	public void practice11() {
		System.out.print("비밀번호 입력(1000~9999) : ");
		int pw = sc.nextInt();

		 /*
		  String pwd =sc.next();
		  char pwd1 = pwd.charAt(0);
		  char pwd2 = pwd.charAt(1);
		  char pwd3 = pwd.charAt(2);
		  char pwd4 = pwd.charAt(3);
		 */		
		if(pw >= 1000 && pw <= 9999) {	
			int pw1 = pw / 1000;
			int pw2 = (pw/100) % 10;
			int pw3 = (pw/10) % 10;
			int pw4 = pw % 10;
			if(pw1 == pw2 || pw1 == pw3 || pw1 == pw4 ||
			   pw2 == pw3 || pw2 == pw4 || pw3 == pw4) {
				System.out.println("실패(중복 값 있음)");
				return;
			}else {
				System.out.println("성공");
				return;
			}	
		}else {
			System.out.println("자리수 안맞음");
			return;
		}
	}
}
