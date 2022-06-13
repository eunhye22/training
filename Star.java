package thisjava;

public class Star {
	public static void main(String[] args) {
		//1. 맨 위의 별 하나 찍기
//		for(int j=0; j<4; j++) {
//			System.out.print(" ");
//		}//for문 -> 공백 출력
//		
//		for(int j=0; j<1; j++) {
//			System.out.print("*");
//		}//for문 -> 별 출력
//		System.out.print("\n");
		
		//2. 중첩for문을 이용해 별피라미드 찍기
		for(int i=0; i<5; i++) {
			for(int j=0; j<4-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<(2*i)+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}//outer-for
	}//main
	
	
}//end class
