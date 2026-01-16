package com.kh.practice.generics.view;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.kh.practice.generics.controller.FarmController;
import com.kh.practice.generics.model.vo.Farm;
import com.kh.practice.generics.model.vo.Fruit;
import com.kh.practice.generics.model.vo.Nut;
import com.kh.practice.generics.model.vo.Vegetable;

public class FarmMenu {
	Scanner sc = new Scanner(System.in);
	FarmController fc = new FarmController();

	public void mainMenu() {
		while (true) {
			System.out.println("========== KH 마트 ==========\r\n" + "******* 메인 메뉴 *******\r\n" + "1. 직원메뉴\r\n"
					+ "2. 손님 메뉴\r\n" + "9. 종료\r\n");
			System.out.print("메뉴 번호 선택 : ");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				adminMenu();
				break;
			case 2:
				customerMenu();
				break;
			case 9:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			}

		}
	}

	public void adminMenu() {
		while (true) {
			System.out.println("******* 직원 메뉴 *******\r\n" + "1. 새 농산물 추가\r\n" + "2. 종류 삭제\r\n" + "3. 수량 수정\r\n"
					+ "4. 농산물 목록\r\n" + "9. 메인으로 돌아가기\r\n");

			System.out.print("메뉴 번호 선택 : ");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				addNewKind();
				break;
			case 2:
				removeKind();
				break;
			case 3:
				changeAmount();
				break;
			case 4:
				printFarm();
				break;
			case 9:
				mainMenu();
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			}

		}
	}

	public void customerMenu() {
		while (true) {
			System.out.println("현재 KH마트 농산물 수량");
			printFarm();
			System.out.println("******* 고객 메뉴 *******\r\n" + "1. 농산물 사기\r\n" + "2. 농산물 빼기\r\n" + "3. 구입한 농산물 보기\r\n"
					+ "9. 메인으로 돌아가기\r\n");

			System.out.print("메뉴 번호 선택 : ");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				buyFarm();
				break;
			case 2:
				removeFarm();
				break;
			case 3:
				printBuyFarm();
				break;
			case 9:
				mainMenu();
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			}
		}

	}

	public void addNewKind() {
		while (true) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("추가할 종류 번호 : ");
			int menu = sc.nextInt();

			if(!(menu>=1 && menu <=3)) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
			
			System.out.print("이름 : ");
			String name = sc.next();
			
			System.out.print("수량 : ");
			int amount = sc.nextInt();
			
			
			Farm f = new Farm();
			
			if(menu == 1) {
				f = new Fruit("과일", name);
			}else if(menu == 2) {
				f = new Vegetable("채소", name);
			}else {
				f = new Nut("견과", name);
			}
			
			boolean result = fc.addNewKind(f, amount);
			
			if(result) {
				System.out.println("새 농산물이 추가되었습니다.");
				return;
			}else {
				System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.");
				continue;
			}
			
//			switch (menu) {
//			case 1:
//				String kind1 = "과일";
//
//				System.out.print("이름 : ");
//				String Fruit = sc.next();
//
//				System.out.print("수량 : ");
//				int num1 = sc.nextInt();
//
//				Fruit f = new Fruit(kind1, Fruit);
//
//				boolean result1 = fc.addNewKind(f, num1);
//
//				if (result1) {
//					System.out.println("새 농산물이 추가되었습니다.");
//					break;
//				} else {
//					System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.");
//				}
//
//			case 2:
//				String kind2 = "채소";
//
//				System.out.print("이름 : ");
//				String Vegetable = sc.next();
//
//				System.out.print("수량 : ");
//				int num2 = sc.nextInt();
//
//				Vegetable v = new Vegetable(kind2, Vegetable);
//
//				boolean result2 = fc.addNewKind(v, num2);
//
//				if (result2) {
//					System.out.println("새 농산물이 추가되었습니다.");
//					break;
//				} else {
//					System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.");
//				}
//				break;
//			case 3:
//				String kind3 = "견과";
//
//				System.out.print("이름 : ");
//				String Nut = sc.next();
//
//				System.out.print("수량 : ");
//				int num3 = sc.nextInt();
//
//				Nut n = new Nut(kind3, Nut);
//				
//				boolean result3 = fc.addNewKind(n, num3);
//
//				if (result3) {
//					System.out.println("새 농산물이 추가되었습니다.");
//					break;
//				} else {
//					System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.");
//				}
//				break;
//			default:
//				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
//			}
		}
//		출력되며 다시 번호를 받고, 선택한 종류에 따라 생성되는 객체가 다름.
//		객체 안에 종류와 이름을 저장. 데이터를 저장한 객체와 수량을 fc(FarmController)의
//		addNewKind()로 넘기고 전달 받은 반환 값이 true면 “”,
//		false면 “” 출력
	}

	public void removeKind() {
		
		while (true) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("삭제할 종류 번호 : ");
			int menu = sc.nextInt();
			
			if (!(menu >= 1 && menu <= 3)) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}

			System.out.print("이름 : ");
			String name = sc.next();

			System.out.print("수량 : ");
			int amount = sc.nextInt();


			Farm f = new Farm();

			if (menu == 1) {
				f = new Fruit("과일", name);
			} else if (menu == 2) {
				f = new Vegetable("채소", name);
			} else {
				f = new Nut("견과", name);
			}

			boolean result = fc.removeKind(f);

			if (result) {
				System.out.println("농산물 삭제에 성공하였습니다.");
				return;
			} else {
				System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.");
				continue;
			}
		}
			
			
//		‘1. 과일 / 2. 채소 / 3. 견과’를 통해 번호로 종류를 받고 삭제할 농산물의 이름도
//		받음. 이때 없는 번호를 선택하면 “잘못 입력하셨습니다. 다시 입력해주세요.”가
//		출력되며 다시 번호를 받고, 선택한 종류에 따라 생성되는 객체가 다름.
//		객체 안에 종류와 이름을 저장. 데이터를 저장한 객체를 fc의 removeKind()로 넘기고
//		전달받은 반환 값이 true면 “농산물 삭제에 성공하였습니다.”,
//		false면 “새 농산물 추가에 실패하였습니다. 다시 입력해주세요.” 출력
	}

	public void changeAmount() {
		while (true) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("수정할 종류 번호 : ");
			int menu = sc.nextInt();
			
			if(!(menu>=1 && menu <=3)) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
			System.out.print("이름 : ");
			String name = sc.next();
			
			System.out.print("수량 : ");
			int amount = sc.nextInt();
			
			
			
			Farm f = new Farm();
			
			if(menu == 1) {
				f = new Fruit("과일", name);
			}else if(menu == 2) {
				f = new Vegetable("채소", name);
			}else {
				f = new Nut("견과", name);
			}
			
			boolean result = fc.changeAmount(f, amount);
			
			if(result) {
				System.out.println("수량이 수정되었습니다.");
				return;
			}else {
				System.out.println("농산물 수량 수정에 실패하였습니다. 다시 입력해주세요.");
				continue;
			}
		}
//		‘1. 과일 / 2. 채소 / 3. 견과’를 통해 번호로 종류를 받고 수정 농산물의 이름,
//		수정할 수량도 받음. 없는 번호 선택 시 “잘못 입력하셨습니다. 다시 입력해주세요.”
//		출력 후 다시 번호를 받고, 선택한 종류에 따라 생성되는 객체가 다름.
//		객체 안에 종류와 이름을 저장. 데이터를 저장한 객체와 수량을 fc의
//		changeAmount()로 넘기고 전달 받은 반환 값이 true면
//		“농산물 수량이 수정되었습니다.”,
//		false면 “농산물 수량 수정에 실패하였습니다. 다시 입력해주세요.” 출력
	}

	public void printFarm() {
		Map<Farm, Integer> map = fc.printFarm();
		Set<Farm> set = map.keySet();
		
		for(Farm f : set) {
			System.out.println(f+"("+map.get(f)+")개");
		}
//		fc의 printFarm()의 반환 값을 이용하여 keySet()을 통해
//		“종류 : 이름(n개)” 형식으로 출력
	}

	private Farm inputFarm() {
		
		Farm f = new Farm();
		
		while(true) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("추가할 종류 번호 : ");
			int menu = sc.nextInt();
			
			if (!(menu >= 1 && menu <= 3)) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}

			System.out.print("이름 : ");
			String name = sc.next();
			
			if (menu == 1) {
				f = new Fruit("과일", name);
			} else if (menu == 2) {
				f = new Vegetable("채소", name);
			} else {
				f = new Nut("견과", name);
			}
			return f;
		}
	}
	public void buyFarm() {
		Farm f = inputFarm();
		
		boolean result = fc.buyFarm(f);
		
		if(result) {
			System.out.println("구매에 성공하였습니다.");
		}else {
			System.out.println("마트에 없는 물건이거나 수량이 없습니다. 다시 입력해주세요.");
			buyFarm();
		}
//		‘1. 과일 / 2. 채소 / 3. 견과’를 통해 번호로 종류를 받고 구매할 농산물의 이름도
//		받음. 이때 없는 번호를 선택하면 “잘못 입력하셨습니다. 다시 입력해주세요.”가
//		출력되며 다시 번호를 받고, 선택한 종류에 따라 생성되는 객체가 다름.
//		객체 안에 종류와 이름을 저장. 데이터를 저장한 객체를 fc의 buyFarm()로 넘기고
//		전달받은 반환 값이 true면 “구매에 성공하였습니다.”,
//		false면 “마트에 없는 물건이거나 수량이 없습니다. 다시 입력해주세요.” 출력
	}

	public void removeFarm() {
		Farm f = inputFarm();
		
		boolean result = fc.removeFarm(f);
		
		if(result) {
			System.out.println("구매 취소에 성공하였습니다.");
		} else {
			System.out.println("구매 목록에 존재하지 않습니다. 다시 입력해주세요.");
			removeFarm();
		}
//		‘1. 과일 / 2. 채소 / 3. 견과’를 통해 번호로 종류를 받고 구매취소할 농산물의 이름도
//		받음. 이때 없는 번호를 선택하면 “잘못 입력하셨습니다. 다시 입력해주세요.”가
//		출력되며 다시 번호를 받고, 선택한 종류에 따라 생성되는 객체가 다름.
//		객체 안에 종류와 이름을 저장. 데이터 저장한 객체를 fc의 removeFarm()로 넘기고
//		전달받은 반환 값이 true면 “구매 취소에 성공하였습니다.”,
//		false면 “구매매 목록에 존재하지 않습니다. 다시 입력해주세요.” 출력

	}

	public void printBuyFarm() {
		List<Farm> list = fc.printBuyFarm();
		Iterator<Farm> iter = list.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
//		fc의 printBuyFarm()의 반환 값을 이용하여 Iterator를 통해 출력
	}
}
