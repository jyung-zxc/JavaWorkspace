package Com.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPracice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		int [] arr = new int[10];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		for(int i = arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+ " ");
		}
	}
	
	public void practice2() {
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		int [] arr = new int[num];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+ " ");
		}
	}
	
	public void practice3() {
		int [] arr = new int[10];
		
		//int rand = (int) (Math.random()*10)+1;
		
		for(int i = 0; i<arr.length; i++) {
			int rand = (int) (Math.random()*10+1);
			arr[i] = rand;
			System.out.print(arr[i]+ " ");
		}
	}
	
	public void practice4() {
		String str = "월화수목금토일";
		char[] arr = str.toCharArray();
		
		System.out.print("0~6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		if(num>=0 && num<=6) {
			System.out.println(arr[num]+"요일");
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}
	
	public void practice5() {
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int [] arr = new int[num];
		int sum = 0;
		
		for(int i=0;i<num;i++) {
			System.out.print("배열 "+i+"번째 인덱스에 넣을 값 : ");
			int num1 = sc.nextInt();
			arr[i] = num1; 
		}
		for(int i=0;i<num;i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		System.out.println();
		System.out.println("총 합 : "+sum);
		//System.out.println(Arrays.toString(arr));
	}
	
	public void practice6() {//
		System.out.print("문자열 : ");
		String str = sc.next();
		
		char[] arr = str.toCharArray();
		int count = 0;
		
		System.out.print("문자열에 있는 문자 : ");
		
		//전체문자 반복
		for(int i=0;i<arr.length;i++) {
				//현재 위체에서 앞쪽의 단어들 중 현재 단어와 일치하는 값이 있는지 확인;
			boolean isDup = false;
			
				for(int j=0;j<i;j++) {
					if(arr[i] == arr[j]) {
						isDup = true;
						break;
					}
					
				}
				if(!isDup){
					if(count>0) {
						System.out.print(", ");
					}
						System.out.print(arr[i]);
						count ++;
				}
		}
		System.out.println();
		System.out.print("문자 개수 : " + count);
	}
	
	public void practice7() {
		System.out.print("문자열 : ");
		String str = sc.next();
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		char [] arr = str.toCharArray();
		
		int count = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==ch) {
			count++;
			}
		}
		System.out.print(str+"에 "+ch+"가 존재하는 위치(인덱스) : " );
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==ch) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println(ch + " 개수 : " + count);
	}
	
	public void practice8() {
		System.out.print("주민등록번호(-포함) : ");
		String str = sc.next();
		char [] arr = str.toCharArray();
		
		char [] copy = str.toCharArray();
		
		for(int j =8; j< copy.length; j++) {
			copy[j] = '*';
		}
		//System.out.println(Arrays.toString(copy));
		System.out.println(copy);
	}
	
	public void practice9() {
		int [] arr = new int[10];
		
		//int rand = (int) (Math.random()*10)+1;
		
		for(int i = 0; i<arr.length; i++) {
			int rand = (int) (Math.random()*10+1);
			arr[i] = rand;
			System.out.print(arr[i]+ " ");
		}
		int max = arr[0];
		int min = arr[0];
		
		for(int i=1;i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println();
		System.out.println("최댓값 : " + max );
		System.out.println("최소값 : " + min);
	}
	
	public void practice10() {//
		int [] arr = new int[10];
		
		for(int i = 0; i<arr.length; i++) {
			boolean isDup = false;
			int rand = (int) (Math.random()*10+1);
			arr[i] = rand;
			
			for(int j = 0;j<i;j++) {
				if(arr[i] == arr[j]) {
					isDup = true;
					break;
				}
			}
			if(!isDup){
			System.out.print(arr[i]+ " ");
			}
		}
	}

	public void practice11() {//
		int num;
		while(true) {
			System.out.print("정수 : ");
			num = sc.nextInt();
		
			if(num%2==1&&num>=3) {
			break;
			}else {
				System.out.println("다시 입력하세요.");
			}
		}
			int [] arr = new int[num];
			int value =1;
			int mid = num/2;
			for(int i=0;i<num;i++) {
				arr[i] = value;
				if(i < mid) {
					value++;
				}else {
					value--;;
				}
			}
			for (int i = 0; i < arr.length; i++) {
				if(i>0) {
					System.out.print(", ");
				}
	            System.out.print(arr[i]);
	        }
			//System.out.println(Arrays.toString(arr));
			return;
	}
	
	public void practice12() {//
		System.out.print("배열의 크기를 입력하세요 : ");
		int num = sc.nextInt();
		
		String [] arr = new String[num];
		for(int i=0;i<num;i++) {
			System.out.print(i+1+"번째 문자열 : ");
			String str = sc.next();
			arr[i] = str;
			while(true) {
				System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
				char ans = sc.next().charAt(0);
				
				if(ans == 'y' || ans == 'Y') {
				System.out.print("더 입력하고 싶은 개수 : ");
				int num2 = sc.nextInt();
				
				String [] arr2 = new String[arr.length + num2];
				
				System.arraycopy(arr, 0, arr2, 0, arr.length);
				
				
				
				}else if(ans =='n'||ans=='N'){
					break;
					
				}System.out.println(Arrays.toString(arr));
			}
		}
	}
}















