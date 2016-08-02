package java_20160802;

import java.util.Scanner;

public class Ch4_DoWhile {
	public static void main(String[] args){
		int input = 0;
		int answer = 0;
		
		answer = (int)(Math.random()*100)+1;
		Scanner keyboard = new Scanner(System.in);
		
		do{
			System.out.println("1과 100사이의 정수를 입력하세요");
			String tmp = keyboard.next();
			input = Integer.parseInt(tmp);
			
			if(input > answer){
				System.out.println("더 작은 수 입니다.");
			}else if(input < answer){
				System.out.println("더 큰 수 입니다.");
			}
			
		}while(input!=answer);
		
		System.out.println("정답입니다.");
	}
}
