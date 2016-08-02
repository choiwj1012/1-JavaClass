package java_20160802;

import java.util.Scanner;

public class Ch4_StdScore_Array_02 {
	public static void main(String[] args){
		// 성적 관리
		// 최대 30명 학생의 국어 영어 수학의 점수와 이름, 학번을 관리
		// 국어 영어 수학의 점수를 각각 입력 받는다
		// (단, 입력받은 점수는 0 ~ 100점으로 한정한다.)
		// 입력받은 점수의 합과 평균을 계산한다
		// 계산된 결과물을 출력한다.
		
		// 메뉴
		// 1. 신규 학생 정보 입력
		// 2. 특정 학생 정보 수정 (학번 기준)
		// 3. 특정 학생 정보 조회 (학번 기준)
		// 4. 모든 학생 정보 조회 
		// 5. 종료
		
		// 2. declare variable
		
		final int MAX_STD_COUNT = 30; // 최대 30명 학생
		
		String[] stdIds = new String[MAX_STD_COUNT]; // 학생번호
		String[] names = new String[MAX_STD_COUNT];  // 학생이름
		int[] korScores = new int[MAX_STD_COUNT];    // 국어점수
		int[] engScores = new int[MAX_STD_COUNT];    // 영어점수
		int[] mathScores = new int[MAX_STD_COUNT];   // 수학점수
		int[] totalScores = new int[MAX_STD_COUNT];  // 총점수
		double[] avgScores = new double[MAX_STD_COUNT]; // 평균점수
		int currentPosition = 0;
		Scanner keyboard = new Scanner(System.in);
		
		// 2. print menu
		while(true){
			System.out.println("1. 신규 학생 정보 입력");
			System.out.println("2. 특정 학생 정보 수정 (학번 기준) ");
			System.out.println("3. 특정 학생 정보 조회 (학번 기준)");
			System.out.println("4. 모든 학생 정보 조회");
			System.out.println("5. 종료");
			System.out.print("번호를 입력해 주세요 > ");
			int selectedMenu = keyboard.nextInt();
			
			// 메뉴 선택에 따른 서로 다른 기능 수행
			if(selectedMenu == 1){
				System.out.println("입력수행함");
				System.out.println((currentPosition + 1) + "번째 학생 정보를 입력하세요");
				System.out.println((currentPosition + 1) + "번째 학생의 학번을 입력하세요");
				String currentStdId = keyboard.next();
				String currentName = keyboard.next();
				String currentKor = keyboard.next();
				String currentEng = keyboard.next();
				String currentMat = keyboard.next();
				
			}else if(selectedMenu == 2){
				System.out.println("수정");
			}else if(selectedMenu == 3){
				System.out.println("조회");
			}else if(selectedMenu == 4){
				System.out.println("조회");
			}else if(selectedMenu == 5){
				System.out.println("종료");
				break;
			}else{
				System.out.println("메뉴는 1 ~ 5 까지 입니다");
				System.out.println("메뉴를 다시 선택해 주세요");
			}
		}
	}
}
