package ShoppingMall;

import java.util.Scanner;

public class ProductList implements ProductRepository{
	
	public void productList() {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("상품 목록 - 상품 선택");
		System.out.println("========================");
		
		for(int i=0; i<MAX_PRODUCT_COUNT;i++) {
			
			System.out.print("[" + i + "]");
			ProductRepository.products[i].printDetail();
			
		}
		
		System.out.println("상품의 번호를 입력하시면 장바구니에 담깁니다");
		System.out.println("메인화면으로 가시려면 [h]를 입력하세요.");
		System.out.println("체크아웃하시려면 [c]를 입력하세요");
		System.out.println("물건번호 선택 : ");
		String selectedProduct = keyboard.next();
		System.out.println("##" + selectedProduct + "가 선택되어 장바구니로 이동되었습니다 ##");
		
		switch(selectedProduct) {
			
			case "h":
				Menu menu = new Menu();
				menu.menuList(); 
				break;
			
			case "c": 
				CheckOut checkOut = new CheckOut();
				checkOut.checkOut(); 
				break;
		
			default:
				int productSelect = Integer.parseInt(selectedProduct);
				cart.add(products[productSelect]);
				productList();
		}
		
		keyboard.close();
		
	}
}
