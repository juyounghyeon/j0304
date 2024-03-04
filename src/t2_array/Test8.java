package t2_array;

// 2차원배열
public class Test8 {
	public static void main(String[] args) {
		int[][] atom = new int[3][4]; //2차원 앞은 행, 뒤는 열 int 초기값 0
		
		atom[0][1] = 10;  //0번 인덱스행의 1열
		atom[1][2] = 20;  //1번 인덱스행의 2열
		atom[2][0] = 30;  //2번 인덱스행의 0열
		
		for(int i=0; i<3; i++) {    //행의 횟수
			for(int j=0; j<4; j++) {
				System.out.print(atom[i][j] + " / ");
			}
			System.out.println();
		}
	}
}
