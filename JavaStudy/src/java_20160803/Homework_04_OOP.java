  /* 기능 -> 1.글쓰기  2.특정글보기  3.글수정  4.글목록보기  5.종료
   * 
   * 세부기능
   * 
   * 1. 글쓰기 -> 1) 작성자  / 2) 글제목  / 3) 글내용
   * 2. 특정글보기 -> 글번호 선택 -> 제목, 내용, 작성자 출력
   * 3. 특정글수정 -> 글번호 선택 -> 제목, 내용, 작성자 선택 수정
   * 4. 글목록보기 -> 글번호 / 제목 / 작성자 / 조회수 (내용은 보이지 않음)
   * 5. 종료 -> 프로그램 종료
   */

package java_20160803;

import java.util.Scanner;

public class Homework_04_OOP {
	
	static Scanner keyboard = new Scanner(System.in);
	
	static final int MAX_LIST_COUNT = 30; //최대 글 갯수는 30개
	static String[] articleTitles = new String[MAX_LIST_COUNT];   //글제목		
	static String[] articleWriters = new String[MAX_LIST_COUNT];  //작성자
	static String[] articleContents = new String[MAX_LIST_COUNT]; //글내용
	static int[] articleNumber = new int[MAX_LIST_COUNT]; 		  //글번호
	static int[] articleReadCount = new int[MAX_LIST_COUNT]; 	  //조회수
	static int totalArticleNumber = 0; 	// 글의 총 갯수		
	
	public static void main(String[] args) {
	
		mainMenu(); // 메인메뉴 출력
		
	} // main() end
	
	// 메뉴선택
	public static void mainMenu(){
		
		System.out.println("게시판에 오신것을 환영합니다");
		System.out.println("원하시는 목록을 선택하세요");
		
		while(true){
			
			String[] mainMenu = {"1. 글쓰기","2. 글조회","3. 글수정","4. 글목록","5. 종료"};
			for(int i=0; i<mainMenu.length; i++){
				System.out.println(mainMenu[i]);
			} // mainMenu 배열 표시
			
			System.out.print(">");
			
			int selectedMenu = keyboard.nextInt();
			
			if(selectedMenu == 1){
				// 글쓰기
				writeArticle();
			}else if(selectedMenu == 2){
				// 선택글보기
				readArticle();
			}else if(selectedMenu == 3){
				// 선택글수정
				modifyArticle();
			}else if(selectedMenu == 4){
				// 목록보기
				articleListView();
			}else if(selectedMenu == 5){
				System.out.println("프로그램 종료");
				break;
			}else{
				System.out.println("선택을 잘못 하셨습니다.");
			} // if end
			
		} // while end
		
	} // mainMenu() end
	
	// 글쓰기
	public static void writeArticle(){
		
		System.out.println("글쓰기 항목에 오셨습니다");
		
		while(true){
		
			// 제목 입력
			System.out.print("제목을 입력해 주세요 >");
			keyboard.nextLine();
			String title = keyboard.nextLine();
			
			// 내용 입력
			System.out.print("내용을 입력해 주세요 >");
			String content = keyboard.nextLine();
			
			// 작성자 입력
			System.out.print("작성자를 입력해 주세요 >");
			String writer = keyboard.nextLine();
			
			articleNumber[totalArticleNumber] = totalArticleNumber + 1; // 글번호 1씩 증가
			articleTitles[totalArticleNumber] = title; // 제목 입력
			articleContents[totalArticleNumber] = content; // 내용 입력
			articleWriters[totalArticleNumber] = writer; // 작성자 입력
			articleReadCount[totalArticleNumber] = 0;
			
			totalArticleNumber = totalArticleNumber + 1; // 글갯수 1씩 증가
			
			System.out.println("작성이 완료되었습니다. 한번 더 쓰시겠습니까? yes or no");
			String checkList = keyboard.next();
			
			if(checkList.equals("yes")|| checkList.equals("YES")){
			
				continue;
				
			}else if(checkList.equals("no") || checkList.equals("NO")){ // 메인메뉴로 돌아가기
				
				break;
				
			}else{
				
				System.out.println("잘못 쓰셨습니다. yes나 no로 입력해주세요.");
			}
			
		} // while end
		
	} // writeArticle() end
	
	// 선택글보기
	public static void readArticle(){
		
		while(true){
			
			System.out.println("보시고 싶은 글번호를 입력하세요");
			boolean isFind = false; // 없는 글번호 선택시 다음 행동을 판단하는 기준
			int selectedArtNum = keyboard.nextInt();
			
			for(int i=0; i<totalArticleNumber; i++){
				if(selectedArtNum == articleNumber[i]){ // 선택한 글번호를 찾으면
					articleReadCount[i] = articleReadCount[i] + 1; // 조회수 1 증가
					printList(i);					  // 리스트를 출력	
					isFind = true;					  // 글번호를 찾았으므로 true로 변경
				}
			}
			
			if(!isFind){							  // 글번호를 찾지 못했다면
				System.out.println("없는 글번호 입니다");
				readArticle();						  // 다시 입력창으로 돌아감	
			}
			
			review();
			
		} // while end
		
	} // readArticle() end 
	
	// 다시보기
	public static void review(){
		
		System.out.println("다시 보시겠습니까? yes or no");
		String checkList = keyboard.next();
		
		if(checkList.equals("yes") || checkList.equals("YES")){	// 다시보겠다고 하면 재실행
			
			readArticle();
			
		}else if(checkList.equals("no")||checkList.equals("NO")){ // 다시 안보겠다고 하면 메인메뉴로 복귀
			
			mainMenu();
			
		}else{
			
			System.out.println("잘못 쓰셨습니다. yes나 no로 입력해주세요");
			review();
		}
	}
	
	// 목록 표시 타이틀 표시
	public static void printListTitle(){
		
		// 리스트 타이틀 배열처리 및 출력
		String[] artListViewMenu = {"번호", "제목", "내용", "작성자", "조회수"}; 
		for(int i=0; i<artListViewMenu.length; i++){
			System.out.print(artListViewMenu[i] + "\t");
		}
		
		System.out.println();
	
	}
	
	// 목록 표시
	public static void printList(int selectedArticle){
		
		// 목록 표시 타이틀 먼저 표시
		printListTitle();
		
		// 선택된 글번호에 해당하는 각 항목을 출력
		System.out.print(articleNumber[selectedArticle] + "\t");
		System.out.print(articleTitles[selectedArticle] + "\t");
		System.out.print(articleContents[selectedArticle] + "\t");
		System.out.print(articleWriters[selectedArticle] + "\t");
		System.out.print(articleReadCount[selectedArticle]);
		
		System.out.println();
		
	} // printList() end
	
	// 선택글수정
	public static void modifyArticle(){
		
		while(true){
			
			System.out.println("수정하고 싶은 글번호를 입력하세요");
			boolean isFind = false; // 없는 글번호 선택시 다음 행동을 판단하는 기준
			int selectedArticle = keyboard.nextInt();
			
			for(int i=0; i<totalArticleNumber; i++){
				if(selectedArticle == articleNumber[i]){ // 선택한 글번호를 찾으면
					
					isFind = true;	// 글번호를 찾았으므로 true로 변경
					
					System.out.println("어떤것을 수정하시겠습니까?");
					System.out.println("1. 제목 || 2. 작성자 || 3. 글내용 || 4. 수정완료 및 취소");
					int selectedModifyMenu = keyboard.nextInt();
					
					if(selectedModifyMenu == 1){
						modifyTitle(selectedArticle);
					}else if(selectedModifyMenu == 2){
						modifyWriter(selectedArticle);
					}else if(selectedModifyMenu == 3){
						modifyContent(selectedArticle);
					}else if(selectedModifyMenu == 4){
						mainMenu();
					}else{
						System.out.println("잘못입력하셨습니다");
					}
								
				} // if end	
				
			} // for end
			
			if(!isFind){							  // 글번호를 찾지 못했다면
				System.out.println("없는 글번호 입니다");
				break;					  			  // 다시 입력창으로 돌아감	
			}
			
			remodify();
			
		} // while end
			
	} // modifyArticle() end
	
	public static void remodify(){
		
		System.out.println("다시 수정하시겠습니까? yes or no");
		String checkList = keyboard.next();
		
		if(checkList.equals("yes") || checkList.equals("YES")){	// 다시보겠다고 하면 재실행
			
			modifyArticle();
			
		}else if(checkList.equals("no")||checkList.equals("NO")){ // 다시 안보겠다고 하면 메인메뉴로 복귀
			
			mainMenu();
			
		}else{
			
			System.out.println("잘못 쓰셨습니다. yes나 no로 입력해주세요");
			
		}
	}
	
	public static void modifyTitle(int selectedArticle){
		// 제목 입력
		System.out.print("제목을 입력해 주세요 >");
		String modifyTitle = keyboard.next();
		articleTitles[selectedArticle] = modifyTitle;
	}
	
	public static void modifyWriter(int selectedArticle){
		System.out.print("작성자를 입력해 주세요 >");
		String modifyWriter = keyboard.next();
		articleWriters[selectedArticle] = modifyWriter;
	}
	
	public static void modifyContent(int selectedArticle){
		System.out.print("내용을 입력해 주세요 >");
		String modifyContent = keyboard.next();
		articleContents[selectedArticle] = modifyContent;	
	}
	
	// 목록보기
	public static void articleListView(){
		
		// 목록 표시 타이틀 먼저 표시
		printListTitle();
		
		// 전체 글 목록 표시
		for(int i=0; i<totalArticleNumber; i++){
			System.out.print(articleNumber[i] + "\t");
			System.out.print(articleTitles[i] + "\t");
			System.out.print(articleContents[i] + "\t");
			System.out.print(articleWriters[i] + "\t");
			System.out.print(articleReadCount[i]);
			System.out.println();
		}
		
		mainMenu();
		
	} // articleListView() end
	
}
