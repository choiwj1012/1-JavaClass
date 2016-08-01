/*
 * 요구사항
 * 2개의 숫자를 기반으로 사칙연산(덧셈, 뺄셈, 곱셈, 나눗셈)를 하는 sw를 만들어 주세요
 * 
 * 요구사항 분석 (가상코드화)
 * 숫자 타입은? 정수
 * 입력 장치는? 키보드
 * 출력 장치는? 모니터(콘솔)
 * 계산 이란? 사칙연산
 * 
 * */


package java_20160729;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {

		// 1. 변수 선언
		// 1.1 몇개의 변수가 필요한가? 6개 (2개의 숫자 변수, 각 연산자 결과 변수 4개)
		// 1.2 각 변수의 이름은 무엇으로 하는가? firstNumber, secondNumber, resultSum, resultSub, resultMul, resultDiv
		// 1.3 각 변수의 타입은 무엇으로 할 것인가?
		int firstNumber, secondNumber, resultSum, resultSub, resultMul;
		double resultDiv;

		//ctrl+a, ctrl+i => 줄정리

		// 2. 원시 데이터 (raw data) 입력
		// 2.1 입력 장치 연결 (현재 키보드)
		Scanner keyboard = new Scanner(System.in);
		
		// 2.2 입력 장치로부터 읽어들인 값을 변수에 저장
		System.out.println("1번째 숫자를 입력하세요. 단, 숫자는 정수만 허용됩니다.");
		firstNumber = keyboard.nextInt();
		System.out.println("2번째 숫자를 입력하세요. 단, 숫자는 정수만 허용됩니다.");
		secondNumber = keyboard.nextInt();
		keyboard.close();
		
		// 3. 계산
		resultSum = firstNumber + secondNumber;
		resultSub = firstNumber - secondNumber;
		resultMul = firstNumber * secondNumber;
		resultDiv = (double)firstNumber / secondNumber;
		
		// 4. 출력
		System.out.println(firstNumber + "+" + secondNumber + "=" + resultSum);
		System.out.println(firstNumber + "-" + secondNumber + "=" + resultSub);
		System.out.println(firstNumber + "*" + secondNumber + "=" + resultMul);
		System.out.println(firstNumber + "/" + secondNumber + "=" + resultDiv);
		
		// Question
		// 변수는? firstNumber, secondNumber, resultSum, resultSub, resultMul, resultDiv
		// 
		
		int abc = Integer.MAX_VALUE;
		abc += 1;
		System.out.println(abc);
		
		byte num = (byte)300;
		System.out.println(num);
	}

}
