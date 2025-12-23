package Com.kh.chap02.loop;

public class B_While {
	/*
	 * while문
	 * [표현법]
	 * 
	 * [초기식] //필수아님
	 * while(조건식){
	 * //반복적으로 수행할코드
	 * [증감식] //필수아님
	 * }
	 */
	
	public void method1() {
		int i = 0;
		while(i<5) {//조건식
			System.out.println("안녕");
			i++;
		}
		System.out.println(i);
	}
	
	public void method2() {
		//while 문으로 5회 반복하여 아래 코드 출력
		// 1 2 3 4 5
		int i = 1;
		while(i<=5) {
			System.out.print(i+" ");
			i++;
		}
	}
	
	public void method3() {
		// 1부터 랜덤값(1~10)까지의 총 합계를 while문으로 작성
		//출력예시: 1부터 xxx까지으 ㅣ합계는xxx입니다.
		int i = 1;
		int ran =(int)((Math.random() * 10 + 1));
		int sum = 0;
		while(i <= ran) {
			sum+=i++;		
		}
		System.out.println("1부터"+ran+"까지의 합계는"+ sum );
	}

	/*
	 * do~while
	 * [표현법]
	 * do{
	 *  //반복 실행할 코드(단,  최초1회는 반드시 수행)
	 * } while(조건식);
	 * - do~while문은 조건검사 없이 최초 1회는 무조건 실행된다.
	 * 
	 */
	
	public void method4() {
		do {
			System.out.println("안녕");
		}while(false);
	}
	
	public void method5() {
		//do~while문을 활용 하여
		//1 2 3 4 5 출력
		int i = 1;
		do {
			System.out.print(i+" ");
			i++;
		}while(i<=5);
		
	}
	
	
}
