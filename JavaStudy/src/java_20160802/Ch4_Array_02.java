package java_20160802;

import java.util.Scanner;

public class Ch4_Array_02 {
	public static void main(String[] args){
	final int MAX_STD_COUNT = 30; //최대 30명 학생

	//1. 변수 선언(배열화)
	String[] stdIds = new String[MAX_STD_COUNT];		
	String[] names = new String[MAX_STD_COUNT];
	int[] kors = new int[MAX_STD_COUNT]; //국어 점수
	int[] engs = new int[MAX_STD_COUNT]; //영어 점수
	int[] mats = new int[MAX_STD_COUNT]; //수학 점수
	int[] totals = new int[MAX_STD_COUNT]; //총점
	double[] avgs = new double[MAX_STD_COUNT]; //평균
	int currentPosition = 0;

	Scanner keyboard = new Scanner(System.in);

	//2. 메뉴 출력(무한루프, 원할때가 메뉴를 선택할 수 있어야 하기 때문에...)
	while(true) {

		System.out.println("1. 신규 학생 정보 입력");
		System.out.println("2. 특정 학생 정보 수정(학번 기준)");
		System.out.println("3. 특정 학생 정보 조회(학번 기준)");
		System.out.println("4. 모든 학생 정보 조회");
		System.out.println("5. 종료");

		//메뉴 선택에 따른 서로 다른 기능(입력, 수정, 조회, 전체 조회, 종료) 수행
		int selectedMenu = keyboard.nextInt();
		if(selectedMenu == 1) {
			System.out.println("입력 수행함.");

			System.out.println(currentPosition + 1 + "번째 학생 정보를 입력하세요.");
			System.out.println(currentPosition + 1 + "번째 학생의 학번을 입력하세요.");
			String currentStdId = keyboard.next();

			//학번 중복 확인
			boolean isDuplicate = false;
			for(int i = 0 ; i < currentPosition ; i++) {
				if(currentStdId.equals(stdIds[i])) { //동일한 학번이 있다!!!
					isDuplicate = true;
					break;
				}
			}
			
			if(isDuplicate == true) {
				System.out.println("중복된 학번이 있습니다.");					
			} else {
				System.out.println(currentPosition + 1 + "번째 학생의  이름을 입력하세요.");
				String currentName = keyboard.next();
				System.out.println(currentPosition + 1 + "번째 학생의  국어 점수를 입력하세요.");
				int currentKor = keyboard.nextInt();
				System.out.println(currentPosition + 1 + "번째 학생의  영어 점수를 입력하세요.");
				int currentEng = keyboard.nextInt();
				System.out.println(currentPosition + 1 + "번째 학생의  수학 점수를 입력하세요.");
				int currentMat = keyboard.nextInt();

				stdIds[currentPosition] = currentStdId;
				names[currentPosition] = currentName;
				kors[currentPosition] = currentKor;
				engs[currentPosition] = currentEng;
				mats[currentPosition] = currentMat;

				totals[currentPosition] = kors[currentPosition] + engs[currentPosition] + mats[currentPosition];
				avgs[currentPosition] = (double)totals[currentPosition] / 3;

				currentPosition = currentPosition + 1;
			}

		} else if(selectedMenu == 2) {
			System.out.println("수정 수행함.");

			//수정하고자 하는 학번 입력
			System.out.println("수정하고자 하는 학번을 입력하세요 > ");
			int inputStdId = keyboard.nextInt();
			
			// 입력한 학생의 정보를 찾음
			for(int i=0; i<currentPosition; i++){
				
				// 찾으면 해당 학생의 수정할 정보(이름, 국어, 영어, 수학)
				if(inputStdId == Integer.parseInt(stdIds[i])){
					System.out.println((i+1) + "번째 학생의  이름을 입력하세요.");
					names[i] = keyboard.next();
					
					System.out.println((i+1) + "번째 학생의  국어 점수를 입력하세요.");
					kors[i] = keyboard.nextInt();
					
					System.out.println((i+1) + "번째 학생의  영어 점수를 입력하세요.");
					engs[i] = keyboard.nextInt();
					
					System.out.println((i+1) + "번째 학생의  수학 점수를 입력하세요.");
					mats[i] = keyboard.nextInt();
					
					// 해당 학생의 총점 재계산
					totals[i] = kors[i] + engs[i] + mats[i];
					
					// 해당 학생의 평균 재계산
					avgs[i] = (double)totals[i] / 3;
				}
			}

		} else if(selectedMenu == 3) {
			System.out.println("특정 조회 수행함.");
			
			// 확인 하고자 하는 학번을 입력
			System.out.println("확인하고자 하는 학번을 입력하세요");
			int inputStdId = keyboard.nextInt();
			inputStdId = inputStdId - 1;
			
			// 입력한 학생의 정보를 찾아 출력함
			System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
			System.out.println(stdIds[inputStdId] + "\t" + names[inputStdId] + "\t" + kors[inputStdId] + 
					"\t" + engs[inputStdId] + "\t" + mats[inputStdId] + "\t" + totals[inputStdId] + "\t" + avgs[inputStdId]);
			
		} else if(selectedMenu == 4) {
			System.out.println("전체 조회 수행함.");

			if(currentPosition == 0) {
				System.out.println("등록한 학생 정보가 없습니다.");
			} else {
				System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
				for(int i = 0 ; i < currentPosition ; i++) {
					System.out.println(stdIds[i] + "\t" + names[i] + "\t" + kors[i] + 
							"\t" + engs[i] + "\t" + mats[i] + "\t" + totals[i] + "\t" + avgs[i]);
				}
			}

		} else if(selectedMenu == 5) {
			System.out.println("종료");
			break;
		} else {
			System.out.println("메뉴는 1~5를 선택해야 합니다.");
			System.out.println("메뉴를 다시 선택해 주세요.");
		}			

	} // end while
	
	keyboard.close();
	System.out.println("프로그램 종료");
	}
}