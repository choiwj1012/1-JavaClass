package java_20160801;

import java.util.Scanner;

public class Ch3_if_02 {
	
	public static void main(String[] args){
		
		/* 요구사항
		 * 0 ~ 59 "가", 60 ~ 69 "양", 70 ~ 79 "미", 80 ~ 89 "우", 90 ~ 100 "수" */ 
		
		int score;
		boolean flag = true;
		Scanner keyboard = new Scanner(System.in);
		
		while(flag){
			
			System.out.println("점수를 입력하세요 >");
			score = keyboard.nextInt();
			
			if(score >= 0 && score <= 100){
				if(score >= 90){
					System.out.println("수");
					flag = false;
				}else if(score >= 80){
					System.out.println("우");
					flag = false;
				}else if(score >= 70){
					System.out.println("미");
					flag = false;
				}else if(score >= 60){
					System.out.println("양");
					flag = false;
				}else{
					System.out.println("가");
					flag = false;
				}
			}else{
				System.out.println("숫자가 잘못 입력되었습니다. 0 ~ 100 사이로 입력하세요");
			}
		}
		keyboard.close();
	}
}
