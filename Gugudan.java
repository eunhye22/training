package trainning;

import java.util.Scanner;

public class Gugudan {
	// 구구단을 출력하는 메소드를 만들고 
	// 사용자의 입력으로 호출해보기
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
	    
	    printGugudan(Integer.valueOf(input));  
		
	}
		
		static void printGugudan(int dan) { //static 메소드
	
		 if(!(2<=dan && dan<=9))
		  return;
		  
		 for(int i=1; i<=9; i++) {
		  System.out.printf("%d*%d = %d%n", dan, i, dan*i);
		  } // return; 생략가능
			
		}
			
	}

