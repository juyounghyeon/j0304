package t2_array;

import java.util.Date;
import java.util.Scanner;

public class Test6_3 {
	public static void main(String[] args) {
		Date now = new Date();

		System.out.println("now : " + now); //날짜 기본 형식
		
		Scanner sc= new Scanner(System.in);
		String yn = ""; //null인데 오류 안나게

		System.out.print("계속 할까요?(Yes/No)");
		yn = sc.next();
		System.out.println("입력된 문자 : " + yn);
		
		for(int i=0; i<yn.length(); i++) {
			if(yn.equals("Y")) System.out.println("입력된 문자는 Y입니다."); //문자열 비교 .equals
			else System.out.println("입력된 문자는 Y가 아닙니다."); // 문자 =/= 문자열
		}
		
		sc.close();
		
		
	}
}
