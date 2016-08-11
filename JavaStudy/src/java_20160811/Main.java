package java_20160811;

public class Main {
	
	static Product[] products = new Product[3];
	
	public static void main(String[] args){
	
		Main.products[0] = new Product("1", 1, "1");
		Main.products[1] = new Product("2", 2, "2");
		Main.products[2] = new Product("3", 3, "3");
		
		Main.products[0].setNumber(1);
		Main.products[1].setNumber(2);
		Main.products[2].setNumber(3);
		
		System.out.println("번호\t이름\t가격\t정보");
		for(int i=0; i<Main.products.length; i++){
			System.out.print(Main.products[i].getNumber() + "\t");
			System.out.print(Main.products[i].getName() + "\t");
			System.out.print(Main.products[i].getPrice() + "\t");
			System.out.println(Main.products[i].getInfo());
		}
		
		Main.products[0].setNumber(-1);
		
		System.out.println("번호\t이름\t가격\t정보");
		for(int i=0; i<Main.products.length; i++){
			if(Main.products[i].getNumber() != -1){
				System.out.print(Main.products[i].getNumber() + "\t");
				System.out.print(Main.products[i].getName() + "\t");
				System.out.print(Main.products[i].getPrice() + "\t");
				System.out.println(Main.products[i].getInfo());
			}
		}
		
	}
	
}
