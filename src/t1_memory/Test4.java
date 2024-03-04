package t1_memory;

public class Test4 {
	public static void main(String[] args) {
		String name1 = "홍길동";
		String name2 = new String("홍길동"); // 객체생성 연산자 new사용 번지수가 달라짐
		
		if(name1 == name2) System.out.println("name1과 name2는 같습니다.");  //다르다.
		else System.out.println("name1과 name2는 다릅니다.");
		System.out.println();

		if(name1.equals("홍길동")) System.out.println("name1은 '홍길동' 입니다.");  //같다.
		else System.out.println("name1은 '홍길동'이 아닙니다.");
		System.out.println();

		if(name1.equals(name2)) System.out.println("name1과 name2는 같습니다.");  // 주소는 다르지만 문자열의 값은 같다.
		else System.out.println("name1과 name2는 다릅니다.");
		
	}
}
