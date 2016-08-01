package java_20160801;

public class Ch3_variable_01 {
	public static void main(String[] args){
		
		int i = 10; // 정수형 리터럴 10을 int형 변수 i에 저장
		byte j = 15; // 정수형 리터럴 15를 byte형 변수 j애 저장

		System.out.println(i);
		System.out.println(j);
		
		double k = 12.34;
		int l = (int)k; //.34 데이터 소실
		
		System.out.println(k);
		System.out.println(l);
		
		/* 자바의 형 변환
		 * 
		 * 1. automatic type casting (묵시적 형변환)
		 * ex_1) double d = 10; (int -> double)
		 * ex_2) int i = 12.78; (double -> int)(exception, type mismatch)
		 *  
		 * 2. forced type casting (명시적 형변환)
		 * ex_1) int i = (int)12.78;
		 */
		
		// g : 졸업생 수, e : 취업자 수
		// g, e는 정수형이다.
		
		
		int g = 9;
		int e = 7;
		double r = (double) e / g * 100;
		System.out.println(r);
		
	}
}
