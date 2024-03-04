package t2_array;

import java.util.Arrays;

public class Test6_2 {
	public static void main(String[] args) {
		char[] strArray = {'K','o','r','e','a'};

		for(int i=0; i<strArray.length; i++) {
			System.out.print(strArray[i]);
		}
		System.out.println();
		
		System.out.println(strArray); 
		System.out.println("====================");
		
		System.out.println("strArray의 길이 : " + strArray.length);
		System.out.println();
		
		System.out.println("strArray을 문자로 변환 : " + Arrays.toString(strArray)); //배열을 처리하는 class의 도움을 받음 Arrays 함수가 각괄호와함께 표시
		System.out.println();
		
		for(int i=0; i<strArray.length; i++) {
			System.out.println("strArray[" +i+ "] = " + strArray[i]);
		}
		System.out.println();
		
		String str = "Korea"; //문자열로 str 배열에 넣었다. 각각띄우고 싶으면 -> 문자열을 문자로 하나씩 쪼개는건 없다.
		//현재 문자열중에서 특정 인덱스에 위치한 문자를 반환? charAt()메소드 사용
		for(int i =0; i<str.length();i++) {     	//괄호가 있고 없고, 문자열의 길이를 구하는 메소드=그래서 괄호가 있다.
			System.out.println("str("+ i +") = " + str.charAt(i));    //배열은 아니지만 이렇게 쓸일이 있을것
		}
	}
}
