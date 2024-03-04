package t2_array;

//향상된 for문(객체 안의 내용을 반복처리할 수 있다.)
public class Test3 {
	public static void main(String[] args) {
		int[] su = {100, 80, 50, 30, 70, 60}; //배열의 길이만큼 돌려주세요.
		
		System.out.println("일반적인 for문 출력");
		for(int i=0; i<su.length; i++) {    //length 배열의 길이만큼 돌려주세요.
			System.out.print(su[i] + " ");
		}
		System.out.println();
		
		//향상된 for문 : for(변수타입 배열안의 값을담을 변수 : 객체명(또는 배열명))
		System.out.println("향상된 for문 출력");
		for(int s : su) { 
			System.out.print(s + " / "); //순차적으로 값을 출력, 몇 번지인지 알수 없음
		}
		System.out.println();
		
		System.out.println("향상된 for문 출력(번지와 함께 출력하고자 한다.)");
		int sel =0;
		for(int s : su) { 
			System.out.println(sel + " : " + s);
			sel++;
		}	
		System.out.println();
	}
}	
