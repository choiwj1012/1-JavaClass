package java_20160807_OOP;

public class DeckTest_321page {
	
	public static void main(String[] args){
	
		Deck d = new Deck();   // 카드 한 deck을 만든다
		Card c = d.pick(0);    // 섞기 전에 제일 위의 카드를 뽑는다
		System.out.println(c); // System.out.println(c.toString());과 같다 
		
	}
	
}
