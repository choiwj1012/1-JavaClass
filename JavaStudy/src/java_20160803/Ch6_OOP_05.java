/* 요구사항
 * 1. 메뉴
 * 2. 글쓰기 (C)
 * 3. 목록보기 (R)
 * 4. 글조회 (R)
 * 5. 글수정 (U)
 * 6. 글삭제 (D, 나중에) */

package java_20160803;

import java.util.Scanner;

public class Ch6_OOP_05 {

	static Scanner keyboard = new Scanner(System.in);
	static final int MAX_ARTICLE_COUNT = 30; // 최대 글수
	static int[] articleNumbers = new int[MAX_ARTICLE_COUNT]; // 글번호 배열
	static String[] articleTitles = new String[MAX_ARTICLE_COUNT]; // 글제목 배열
	static String[] articleContents = new String[MAX_ARTICLE_COUNT]; // 글내용 배열
	static String[] articleWriters = new String[MAX_ARTICLE_COUNT]; // 글작성자 배열
	static int[] articleReadCounts = new int[MAX_ARTICLE_COUNT];	
	static int currentArticleCount = 0;
	
	public static void main(String[] args){
		
		showMainMenu();
		
	}
	
	public static void showMainMenu(){
		
		String[] mainMenuList = {"메인 메뉴","1. 글쓰기","2. 글목록","3. 글조회","4. 글수정","5. 종료"};
		
		while(true){
			
			for(int i=0; i<mainMenuList.length; i++){
				System.out.println(mainMenuList[i]);
			}
			
			System.out.println();
			
			int selectedMenu = selectMenu();
			
			if(selectedMenu == 1){	
				articleWrite();
			}else if(selectedMenu == 2){
				articleList();
			}else if(selectedMenu == 3){
				articleRead();
			}else if(selectedMenu == 4){
				articleUpdate();
			}else if(selectedMenu == 5){
				System.out.println("종료");
				break;
			}else{
				System.out.println("잘못된 선택입니다.");
			} // if end
			
		}
	} // showMainMenu() end
	
	public static int selectMenu(){
	
		int selectedMenu = keyboard.nextInt();
		return selectedMenu;
		
	} // selectMenu() end
	
	public static void articleWrite(){
		
		System.out.println("글쓰기 모드 선택");
		
		if(currentArticleCount > MAX_ARTICLE_COUNT){
			
			System.out.println("글이 꽉찼어요");
			
		}
		
		System.out.print("글제목 : ");
		String title = keyboard.next();
		
		System.out.print("글내용 : ");
		String content = keyboard.next();
		
		System.out.print("작성자 : ");
		String writer = keyboard.next();
		
		articleNumbers[currentArticleCount] = currentArticleCount; // 글번호 자동 입력
		articleTitles[currentArticleCount] = title; // 글제목 배열에 저장
		articleContents[currentArticleCount] = content; // 글내용 배열에 저장
		articleWriters[currentArticleCount] = writer; // 글작성자 배열에 저장
		articleReadCounts[currentArticleCount] = 0; // 글 조회수 배열에 저장
		
		currentArticleCount = currentArticleCount + 1; // 글 수 갱신
				
	} // articleWrite() end
	
	public static void articleList(){
		
		System.out.println("글목록 보기 선택");
		System.out.println("번호\t제목\t내용\t작성자\t조회수");
		
		for(int i=0; i<currentArticleCount; i++){
			printArticle(i);
		}
		
	} // articleList() end
	
	public static void printArticle(int i){
	
		System.out.print(articleNumbers[i]+"\t");
		System.out.print(articleTitles[i]+"\t");
		System.out.print(articleContents[i]+"\t");
		System.out.print(articleWriters[i]+"\t");
		System.out.print(articleReadCounts[i]);
		System.out.println();
		
	} // printArticle() end
	
	public static void articleRead(){
		
		System.out.println("글조회 선택");
		System.out.println("읽기 모드");
		System.out.println("글번호 : ");
		int articleNumber = keyboard.nextInt();
		
		boolean isFind = false;
		for(int i=0; i<currentArticleCount; i++){
			if(articleNumbers[i] == articleNumber){
				articleReadCounts[i] = articleReadCounts[i] + 1;
				System.out.println("번호\t제목\t내용\t작성자\t조회수");
				printArticle(i);
				isFind = true;
				break;
			}
		}
		
		if(!isFind){ // isFind가 false인 경우
			System.out.println("검색하신 글이 없습니다");
		}
		
	} // articleRead() end
	
	public static void articleUpdate(){
		
		System.out.println("글수정 선택");
		System.out.println("읽기 모드");
		System.out.println("글번호 : ");
		int articleNumber = keyboard.nextInt();
		
		boolean isFind = false;
		for(int i=0; i<currentArticleCount; i++){
			if(articleNumbers[i] == articleNumber){
				showUpdateMenu(i);
				isFind = true;
				break;
			}
		}
		
		if(!isFind){ // isFind가 false인 경우
			System.out.println("검색하신 글이 없습니다");
		}
		
	} // articleUpdate() end
	
	public static void showUpdateMenu(int i){
		
		while(true){
			
			String[] showUpdateMenuList = {"수정메뉴","1. 제목","2. 내용","3. 작성자","4. 취소"};
			
			for(int j=0; j<showUpdateMenuList.length; j++){
				System.out.println(showUpdateMenuList[j]);
			}
			
			int selectedMenu = selectMenu();
	
			if(selectedMenu == 1){	
				updateTitle(i);
			}else if(selectedMenu == 2){
				updateContent(i);
			}else if(selectedMenu == 3){
				updateWriter(i);
			}else if(selectedMenu == 4){
				System.out.println("수정 취소");
				break;
			}else{
				System.out.println("잘못된 선택입니다.");
			} // if end
			
		} // while end
		
	}
	
	public static void updateTitle(int i){
		System.out.println("수정 제목 : ");
		String title = keyboard.next();
		
		articleTitles[i] = title;
	} // updateTitle end
	
	public static void updateContent(int i){
		System.out.println("수정 내용 : ");
		String content = keyboard.next();
		
		articleContents[i] = content;
	} // updateContent end
	
	public static void updateWriter(int i){
		System.out.println("수정 작성자 : ");
		String writer = keyboard.next();
		
		articleWriters[i] = writer;
	} // updateWriter
	
}
