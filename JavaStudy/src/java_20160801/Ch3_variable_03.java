/* 요구사항
 * 2개의 숫자를 입력받아 사칙연산한 결과를 각각 표시하는 sw를 만들어 달라.
 * 2개의 숫자의 타입은 정수 또는 실수 모두 가능해야 한다.
 * 입력은 키보드로 받는다.
 * 출력은 console로 한다.*/


package java_20160801;

import java.util.Scanner;

import sun.net.www.content.text.plain;

public class Ch3_variable_03 {
	public static void main(String[] args){
		
		// declair variable
		double firstNum;
		double secondNum;
		double sumResult;
		double subtractResult;
		double multiplyResult;
		double divideResult;
		
		// import scanner class
		Scanner keyboard = new Scanner(System.in);
		
		// input keyboard data
		System.out.println("첫번째 숫자를 입력하세요");
		firstNum = keyboard.nextDouble();
		System.out.println("두번째 숫자를 입력하세요");
		secondNum = keyboard.nextDouble();
		keyboard.close();
		
		// calculate number
		sumResult = firstNum + secondNum;
		subtractResult = firstNum - secondNum;
		multiplyResult = firstNum * secondNum;
		divideResult = firstNum / secondNum;
		
		// print result
		System.out.println("덧셈결과 : "+sumResult);
		System.out.println("뺄셈결과 : "+subtractResult);
		System.out.println("곱셈결과 : "+multiplyResult);
		System.out.println("나눗셈결과 : "+divideResult);
	}
}
