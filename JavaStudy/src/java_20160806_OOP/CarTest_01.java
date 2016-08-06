package java_20160806_OOP;

class Car{
	
	// variable
	String color;
	String gearType;
	int door;
	
	// constructor
	Car(){
		
	}
	
	Car(String color, String gearType, int door){
		
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		
	}
	
}

public class CarTest_01 {

	public static void main(String[] args){
		
		Car c1 = new Car();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		Car c2 = new Car("black", "manual", 2);
		
		System.out.println(c1.color + " " + c1.gearType + " " + c1.door);
		System.out.println(c2.color + " " + c2.gearType + " " + c2.door);
		
	}
	
}
