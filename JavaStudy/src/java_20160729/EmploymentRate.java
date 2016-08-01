/* 요구사항 분석
 * 취업률을 구하는 SW 개발
 * 취업률은 졸업생 중 취업한 사람의 비율을 의미
 * 값은 키보드로 입력
 * 콘솔로 출력
 * */

// client 요구사항 -> 요구사항 분석(가상코드화) -> 설계 -> 코딩

package java_20160729;

import java.util.Scanner;

public class EmploymentRate {
	
	public static void main(String[] args){
		
		/*
		 * 1. 변수 선언
		
		 * 1.1. 변수 도출
		 *  => 취업률, 졸업생수, 취업자수
		
		 * 1.2. 필요 변수마다 변수 이름을 설정 
		 *	(규칙 1 : 변수 이름은 소문자로 한다. 다만 2개 이상의 복합단어로 구성된 경우 2번째 단어부터 이니셜을 대문자로 함)
		 *	(규칙 2 : variable name은 space룰 허용하지 않음)
		
		 * employmentRate;
		 * graduateCount;
		 * employeeCount;
		
		 * 1.3 변수 타입을 설정
		 * employmentRate => 정수와 부동소수점이 들어갈 수 있음. double 또는 float 선택
		 * employmentCount & employeeCount => 정수만 들어감. byte, char, short, int, long 중 하나 선택
		 */
		
		double employmentRate;
		int graduateCount;
		int employeeCount;
		
		/*
		 * 2. 연산에 필요한 데이터를 입력장치로 부터 읽어와 변수에 저장
		 * 2.1 입력장치(현재는 키보드)와 연결
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		/*
		 * 2.2 연결된 입력장치로 부터 데이터를 읽어 들여, 미리 저장된 변수(graduateCount, employeeCount)
		 * */
		
		System.out.println("졸업자 수를 입력하세요, 단 정수만 허용됩니다 > ");
		graduateCount = scanner.nextInt();
		System.out.println("취업자 수를 입력하세요, 단 정수만 허용됩니다 > ");
		employeeCount = scanner.nextInt();
		
		// 키보드 연결해제
		scanner.close();
		
		/*
		 * 3. 계산(연산) => 취업률을 계산
		 * 취업률 = 취업자 수 / 졸업생 수 * 100
		 * */
		
		employmentRate = ((double)employeeCount/graduateCount) * 100;
		
		/* 정수의 범위 출력
		 * int integerScope = Integer.MAX_VALUE;
		System.out.println(integerScope);*/
		
		/*
		 * 4. 출력 => 취업률을 콘솔로 출력
		 * */
		
		System.out.println("취업률 : " + employmentRate + "%");
		
	}
	
}










