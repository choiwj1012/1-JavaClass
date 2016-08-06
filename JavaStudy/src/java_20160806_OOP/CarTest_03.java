package java_20160806_OOP;

class Car3{
	
	// variable
	String color;
	String gearType;
	int door;
	
	// constructor
	Car3(){
		this("white", "auto", 4);
	}
	
	Car3(Car3 c){ // this is a constructor to copy a instance
		this(c.color, c.gearType, c.door);
	}
	
	Car3(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
}

public class CarTest_03 {

	public static void main(String[] args){
		
		Car3 c1 = new Car3();
		Car3 c2 = new Car3(c1); // c1의 복사본 c2를 생성한다.
		
		System.out.println("c1의 color = " + c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
		System.out.println("c2의 color = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);
		
		System.out.println();
		
		c1.door = 100;
		System.out.println("c1의 color = " + c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
		System.out.println("c2의 color = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);
		
	}
	
}
