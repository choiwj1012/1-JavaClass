package java_20160801;

import java.util.Scanner;

public class Ch3_variable_02 {
	public static void main(String[] args){
		
		// declare variable
		int graduate; // g 에는 자바 기본값 0이 저장된다.
		int employee; // e 에는 자바 기본값 0이 저장된다.
		double result; //result 에는 자바 기본값 0이 저장된다.
		
		// import scanner class
		Scanner keyboard = new Scanner(System.in);
		
		// input data using keyboard
		System.out.println("졸업생 수를 입력하세요. 단, 졸업생 수는 정수입니다.");
		graduate = keyboard.nextInt();
		System.out.println("취업자 수를 입력하세요. 단, 취업자 수는 정수입니다.");
		employee = keyboard.nextInt();
		
		// scanner class close
		keyboard.close();
		
		// Calculate result
		result = (double)employee/graduate * 100;
		
		// print result
		System.out.println("취업률 : " + result + "%");
	}
}
