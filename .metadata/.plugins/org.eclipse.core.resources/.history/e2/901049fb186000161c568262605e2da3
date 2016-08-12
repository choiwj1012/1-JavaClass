package shop;

import java.util.Scanner;

public class Start {
	
	public void start(){
		
		Scanner keyboard = new Scanner(System.in);		
		ShopProcess process = new ShopProcess();		

		boolean exit = false;
		while(!exit){
			
			System.out.println("\n쇼핑몰에 오신걸 환영합니다.\n");
			// 상품리스트 보여주기
			process.displayProductList();
			System.out.println("\n1. 회원가입하기");
			System.out.println("2. 로그인하기");
			System.out.println("3. 나가기");

			int selectedMain = keyboard.nextInt();		
			if(selectedMain == 1){					
				// 회원가입
				process.insertUserInUserList();
				
			}else if(selectedMain == 2){
				// 로그인
				process.login();
				
			}else if(selectedMain == 3){
				// 프로그램 종료
				exit = true;
				
			} else {
				
				System.out.println("선택 다시하세요");
				
			}
		}
		
	}
	
}
