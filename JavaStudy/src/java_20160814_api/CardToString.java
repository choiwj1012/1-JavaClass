package java_20160814_api;

class Card {
	
	String kind;
	int number;
	
	Card () {
		this("SPADE", 1);
	}
	
	Card (String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	public String toString(){
		
		return "kind : " + kind + ", number : " + number;
	}
		
}

public class CardToString {

	public static void main(String[] args){
		
		Card c1 = new Card("DIAMOND",2);
		Card c2 = new Card("CLOVER",3);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		String str = new String("KOREA");
		java.util.Date today = new java.util.Date();
		
		System.out.println(str);
		System.out.println(str.toString());
		System.out.println(today);
		System.out.println(today.toString());
	}
	
}
