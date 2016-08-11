package ShoppingMall;

import java.util.Scanner;

public class CheckOut implements ProductRepository{
	
	public void checkOut() {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("체크아웃");
		System.out.println("========================");
		
		int total = 0;
		int i = 0;

		for(Product p : cart) {
			System.out.printf("[%d]%s(%s)\n", i++, p.productName, p.price);
			total = total + p.price; // 선택된 가격 합산
		}
		
		System.out.println("========================");
		System.out.println("결제 방법: "+UserRepository.users[UserRepository.currentUser].getPayType());

		System.out.println("합계: " + total + " 원 입니다.");
		System.out.println("이전으로 가시려면 [p]를 입력하세요");
		System.out.println("결제를 마치려면 [q]를 입력하세요");
		
		System.out.print("선택 : ");
		String selectedMenu = keyboard.next();

		switch(selectedMenu) {
		
			case "q":
				
				System.out.println("## 결제가 완료 되었습니다. 종료합니다. ##");
				System.exit(0); 
				break;
				
			case "p": 
				
				ProductList productList = new ProductList();
				productList.productList(); 
				break;
				
			default:
				
				checkOut();
		}
		
		keyboard.close();
		
	}
}