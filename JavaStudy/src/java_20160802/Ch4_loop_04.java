package java_20160802;

import java.util.Scanner;

public class Ch4_loop_04 {
	public static void main(String[] args){
		
		int sum = 0;
		int startNumber = 0;
		int endNumber = 0;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("시작숫자 입력");
		startNumber = keyboard.nextInt();
		System.out.println("끝숫자 입력");
		endNumber = keyboard.nextInt();
		keyboard.close();
		
		for(int i=startNumber; i<endNumber; i++){
			sum = sum + i;
		}
		System.out.println(sum);
		
		
		sum = 0;
		int i = startNumber;
		while(i<endNumber){
			sum = sum + i;
			i++;
		}
		System.out.println(sum);
		
		
		sum = 0;
		i = startNumber;
		do{
			sum = sum + i;
			i++;
		}while(i<endNumber);
		System.out.println(sum);
		
	}
}
