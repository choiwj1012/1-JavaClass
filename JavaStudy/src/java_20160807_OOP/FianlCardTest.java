package java_20160807_OOP;

class FinalCard{
	
	// variable
	final int NUMBER;
	final String KIND;
	static int width = 100;
	static int height = 250;
	
	// constructor
	FinalCard(){
		this("HEART", 1);
	}
	
	FinalCard(String kind, int num){
		KIND = kind;
		NUMBER = num;
	}
	
	// method
	public String toString(){
		return KIND + " " + NUMBER;
	}
	
}

public class FianlCardTest {
	
	public static void main(String[] args){
		
		FinalCard c = new FinalCard("HEART", 10);
		// c.NUMBER = 5; // 상수는 변경 불가능
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c);
			
	}
	
}
