package ShoppingMall;

import java.util.Scanner;

public class Menu {
	
	public void menuList() { // 메인 메뉴 선택하기
		
		Scanner keyboard = new Scanner(System.in);
		
		boolean exit = false;
		while(!exit) {
			String[] mainMenu = {"### 메뉴 선택 ###", "1. Join", "2. Login", "3. exit"};
			for(int i=0; i<mainMenu.length; i++){
				System.out.println(mainMenu[i]);
			}

			int selectedMenu = keyboard.nextInt();

			switch(selectedMenu) {
			
				case 1:
					JoinUser joinUser = new JoinUser(); 
					joinUser.join(); 
					break;
				
				case 2: 
					Login login = new Login();
					login.login(); 
					break;
				
				case 3: 
					exit = true; 
					break;
				
				default:
					System.out.println("메뉴를 다시 선택해 주세요.");
			}
		}
		
		keyboard.close();
		
	}

}
