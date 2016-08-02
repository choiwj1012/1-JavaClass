package java_20160802;

import java.util.Scanner;

public class Ch4_StdScore {
	public static void main(String[] args){
		// 성적 관리
		// 한 학생의 국어 영어 수학의 점수와 이름, 학번을 관리
		// 국어 영어 수학의 점수를 각각 입력 받는다
		// (단, 입력받은 점수는 0 ~ 100점으로 한정한다.)
		// 입력받은 점수의 합과 평균을 계산한다
		// 계산된 결과물을 출력한다.
		
		// declare variable
		String stdId;
		String name;
		int koreanScore;
		int englishScore;
		int mathScore;
		int totalScore;
		double averageScore;
		
		// input data
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("학번을 입력하세요 > ");
		stdId = keyboard.next();
		
		System.out.println("이름을 입력하세요 > ");
		name = keyboard.next();
		
		System.out.println("국어 점수를 입력하세요 > ");
		koreanScore = keyboard.nextInt();
		
		System.out.println("영어 점수를 입력하세요 > ");
		englishScore = keyboard.nextInt();
		
		System.out.println("수학 점수를 입력하세요 > ");
		mathScore = keyboard.nextInt();
		
		// calculate total and average
		totalScore = koreanScore + englishScore + mathScore;
		averageScore = (double)totalScore/3;
		
		// print result (landscape)
			// title
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		
			// data
		System.out.println(stdId + "\t" + name + "\t" + koreanScore + "\t" + englishScore + "\t" +
			mathScore + "\t" + totalScore + "\t" + averageScore);
		
		
	}
}
