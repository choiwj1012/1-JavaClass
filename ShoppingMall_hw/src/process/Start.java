package process;

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
				
				process.insertUserInUserList(); // 회원가입
				
			}else if(selectedMain == 2){
				
				process.login(); // 로그인
				
			}else if(selectedMain == 3){
				
				exit = true; // 프로그램 종료
				
			} else {
				
				System.out.println("선택 다시하세요");
				
			}
		}
		
	}
	
}
