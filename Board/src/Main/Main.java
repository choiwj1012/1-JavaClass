package Main;

import java.util.Scanner;

import Menu.*;

public class Main {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Article article = new Article(); 
		
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
				article.setWrite(new Write_Basic());
				article.write();
			}else if(selectedMenu == 2){
				// 선택글보기
				article.setRead(new Read_Selected());
				article.read();
			}else if(selectedMenu == 3){
				// 선택글수정
				article.setWrite(new Write_Selected());
				article.write();
			}else if(selectedMenu == 4){
				// 목록보기
				article.setRead(new Read_All());
				article.read();
			}else if(selectedMenu == 5){
				System.out.println("프로그램 종료");
				break;
			}else{
				System.out.println("선택을 잘못 하셨습니다.");
			} // if end
			
		} // while end
		
	} // mainMenu() end
}
