package java_20160802;

import java.util.Scanner;

public class Ch4_StdScore_Array_01 {
	public static void main(String[] args){
		// 성적 관리
		// 3명 학생의 국어 영어 수학의 점수와 이름, 학번을 관리
		// 국어 영어 수학의 점수를 각각 입력 받는다
		// (단, 입력받은 점수는 0 ~ 100점으로 한정한다.)
		// 입력받은 점수의 합과 평균을 계산한다
		// 계산된 결과물을 출력한다.
		
		// declare variable
		
		final int STD_COUNT = 3;
		
		String[] stdIds = new String[STD_COUNT];
		String[] names = new String[STD_COUNT];
		int[] korScores = new int[STD_COUNT];
		int[] engScores = new int[STD_COUNT];
		int[] mathScores = new int[STD_COUNT];
		int[] totalScores = new int[STD_COUNT];
		double[] avgScores = new double[STD_COUNT];
		
		// input data
		Scanner keyboard = new Scanner(System.in);
		
		/*for(int i=0; i<STD_COUNT; i++){
			System.out.println("학번을 입력하세요 > ");
			stdIds[i] = keyboard.next();
			
			System.out.println("이름을 입력하세요 > ");
			names[i] = keyboard.next();
			
			System.out.println("국어 점수를 입력하세요 > ");
			korScores[i] = keyboard.nextInt();
			
			System.out.println("영어 점수를 입력하세요 > ");
			engScores[i] = keyboard.nextInt();
			
			System.out.println("수학 점수를 입력하세요 > ");
			mathScores[i] = keyboard.nextInt();	
		}*/
		
		/*int i = 0;
		while(i<STD_COUNT){
			System.out.println("학번을 입력하세요 > ");
			stdIds[i] = keyboard.next();
			
			System.out.println("이름을 입력하세요 > ");
			names[i] = keyboard.next();
			
			System.out.println("국어 점수를 입력하세요 > ");
			korScores[i] = keyboard.nextInt();
			
			System.out.println("영어 점수를 입력하세요 > ");
			engScores[i] = keyboard.nextInt();
			
			System.out.println("수학 점수를 입력하세요 > ");
			mathScores[i] = keyboard.nextInt();
			
			i++;
		}*/
		
		int i = 0;
		do{
			System.out.println("학번을 입력하세요 > ");
			stdIds[i] = keyboard.next();
			
			System.out.println("이름을 입력하세요 > ");
			names[i] = keyboard.next();
			
			System.out.println("국어 점수를 입력하세요 > ");
			korScores[i] = keyboard.nextInt();
			
			System.out.println("영어 점수를 입력하세요 > ");
			engScores[i] = keyboard.nextInt();
			
			System.out.println("수학 점수를 입력하세요 > ");
			mathScores[i] = keyboard.nextInt();
			
			i++;
		}while(i<STD_COUNT);
		
		keyboard.close();
		
		// calculate total and average
		/*for(int i=0; i<STD_COUNT; i++){
			totalScores[i] = korScores[i] + engScores[i] + mathScores[i];
			avgScores[i] = (double)totalScores[i]/3;	
		}*/
		
		/*i = 0;
		while(i<STD_COUNT){
			totalScores[i] = korScores[i] + engScores[i] + mathScores[i];
			avgScores[i] = (double)totalScores[i]/3;
			i++;
		}*/
		
		i = 0;
		do{
			totalScores[i] = korScores[i] + engScores[i] + mathScores[i];
			avgScores[i] = (double)totalScores[i]/3;
			i++;
		}while(i<STD_COUNT);
		
		// print result (landscape)
		/*for(int i=0; i<STD_COUNT; i++){
			// title
			System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
			
			// data
			System.out.println(stdIds[i] + "\t" + names[i] + "\t" + korScores[i] + "\t" + engScores[i] + "\t" +
				mathScores[i] + "\t" + totalScores[i] + "\t" + avgScores[i]);
		}*/
		
		/*i = 0;
		while(i<STD_COUNT){
			System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
			System.out.println(stdIds[i] + "\t" + names[i] + "\t" + korScores[i] + "\t" + engScores[i] + "\t" +
			mathScores[i] + "\t" + totalScores[i] + "\t" + avgScores[i]);
			i++;
		}*/
		
		i = 0;
		do{
			System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
			System.out.println(stdIds[i] + "\t" + names[i] + "\t" + korScores[i] + "\t" + engScores[i] + "\t" +
			mathScores[i] + "\t" + totalScores[i] + "\t" + avgScores[i]);
			i++;
		}while(i<STD_COUNT);
	}
}
