package ShoppingMall;

public class SmartTV extends Product {
	
	String revolution;
	
	public SmartTV(String pname, int price, String revolution) {
		
		this.productName = pname;
		this.price = price;
		this.revolution = revolution;
		
	}
	
	@Override
	public void printExtra() {
		
		System.out.println("해상도: " + revolution);
		
	}

}
