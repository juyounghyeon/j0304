package t1_memory;

import java.util.Scanner;

public class Test1_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//int ans = 0; // 1:계속, 0:그만
		int cnt = 0;
		String ans = "N"; //참조타입 ,String이기때문에 큰 따옴표
		
		while(true) {
			cnt++;
			System.out.println(cnt);
			System.out.print("작업을 계속 할까요?(Y:계속, N:그만)");
			ans = sc.next(); // line: 여러개 
			if(ans == "N") break; // 빠져나가지 못함...
		}
		System.out.println("작업끝...");
		
		sc.close();
	}
}
