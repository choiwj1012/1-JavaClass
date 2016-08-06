package java_20160806_extends;

public class Penguin extends Animal {
	
	public String habitat; // habitat : 서식지
	
	public void showHabitat(){
		System.out.printf("%s는 %s에 살아\n", name, habitat);
	}
	
}
