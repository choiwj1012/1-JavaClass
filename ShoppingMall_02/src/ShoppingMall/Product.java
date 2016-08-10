package ShoppingMall;

public class Product implements ProductRepository{
	
	String productName; // 상품 이름
	int price; // 상품 가격
	
	public void printDetail() {
		
		System.out.println("상품명: " + productName + ",");
		System.out.println("가격: " + price + ",");
		printExtra();
		
	}
	
	public void genProduct() {
		
		product[0] = new CellPhone("갤럭시 노트5", 1000000, "SKT");
		product[1] = new CellPhone("애플 아이폰7", 980000, "KT");
		product[2] = new SmartTV("삼성 3D Smart TV", 5000000, "4K");
		product[3] = new SmartTV("LG Smart TV", 2500000, "Full HD");
		
	}
	
	public void printExtra(){};
}