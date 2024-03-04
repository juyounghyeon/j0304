package t3_exam;

import java.util.Scanner;

/* 최대/최소값 구하기(2자리 이하의 정수가 입력됩니다.) -입력받은 데이터를 모두 출력하시오.
 * 단, 모든 숫자를 다 입력받은 후에 최대값과 최소값을 구하시오. -> 일괄처리(배치 프로세싱)
int max,min; //초기값, to read방식
*/
public class Test1_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max = -99, min = 99, su, cnt=0; //초기값입력
		int[] arr = new int[200]; //배열의 단점: 사용하지 않는 것도 선언을 함
		
		while(true) {
			System.out.print("점수를 입력하세요? (종료:999) ");
			su = sc.nextInt(); //수를 입력받습니다.
			if(su == 999) break; //탈출구
			
			arr[cnt] = su;
			cnt++; //cnt주소 1씩 증가
		}
		
		for(int i=0; i<cnt; i++) {
			if(arr[i] > max) max = arr[i];
			if(arr[i] < min) min = arr[i];
		}
		
		// 입력받은 수를 차례대로 출력하시오
		for(int i=0; i<cnt; i++) {
			System.out.print(arr[i] + " / ");
		}
		System.out.println();
		System.out.println("최대값 : " + max + " , 최소값 : " + min);
		
		sc.close();
	}
}
