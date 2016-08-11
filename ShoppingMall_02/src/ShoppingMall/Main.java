package shoppingMall;

public class Main {
	
	public static void main(String[] args) {
		
		Menu menu = new Menu();
		Product product = new Product();
		
		product.genProduct();
		menu.menuList(); // 메인메뉴 시작
		
	}
}