package test;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
	
		Scanner keyboard = new Scanner(System.in);
		ArticleProcess process = new ArticleProcess();
		
		boolean exit = false;
		while(!exit){
			
			System.out.println("메인 메뉴 목록");
			System.out.println("1. 게시글 쓰기");
			System.out.println("2. 게시글 목록");
			System.out.println("3. 게시글 조회");
			System.out.println("4. 게시글 수정");
			System.out.println("5. 프로그램 종료");
			
			int selectedMenu = keyboard.nextInt();
			
			if(selectedMenu == 1){
				System.out.println("게시글 쓰기 모드");
				process.write();
			}else if(selectedMenu == 2){
				System.out.println("게시글 목록");
				process.list();
			}else if(selectedMenu == 3){
				System.out.println("게시글 조회");
				process.read();
			}else if(selectedMenu == 4){
				System.out.println("게시물 수정");
				process.update();
			}else if(selectedMenu == 5){
				System.out.println("프로그램을 종료합니다.");
				exit = true;
			}else{
				System.out.println("잘못 누르셨습니다");
			}
				
		}
		
	}
	
}
