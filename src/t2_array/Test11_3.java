package t2_array;

// 2차원배열(불규칙 값 저장)
/*	행의 크기 = 배열의 길이(배열명.length)
 *  열의 크기 = 행의 갯수(행이름.length)
 		100  90  80  50
 		80   50  
 		90   10  20  90
 		100  10  20  
 */
public class Test11_3 {
	public static void main(String[] args) {
		int[][] atom = 
			{
					{100,90,80,50},
					{80,50},
					{90,10,20,90},
					{100,10,20}
				}; //2차원 받는 법 ->보기 편하게 바꾸기
		
	
		
		
		//배열에 저장된 형태 그대로 출력하기
		for(int i=0; i<atom.length; i++) {    //행의 횟수
			for(int j=0; j<atom[i].length; j++) { //열의 크기
				System.out.print(atom[i][j] + " \t ");
			}
			System.out.println();
		}
	}
}
