package t1_memory;

public class Test3 {
	public static void main(String[] args) {
		String name1 = "홍길동";
		String name2 = "홍길동";
		
		if(name1 == name2) System.out.println("name1과 name2는 같습니다.");  //주소가 다르니까 다르다고 떠야하는데..
		else System.out.println("name1과 name2는 다릅니다.");
		System.out.println();

		if(name1.equals("홍길동")) System.out.println("name1은 '홍길동' 입니다.");  //비교연산자 equals 사용
		else System.out.println("name1은 '홍길동'이 아닙니다.");
		System.out.println();

		if(name1.equals(name2)) System.out.println("name1과 name2는 같습니다.");  //비교연산자 equals 사용
		else System.out.println("name1과 name2는 다릅니다.");
		
	}
}
