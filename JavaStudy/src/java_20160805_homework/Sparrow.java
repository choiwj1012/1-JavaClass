package java_20160805_homework;

public class Sparrow extends Birds implements Fly{

	// constructor
	Sparrow(){
		myClass = "참새";
	}

	@Override
	public void fly() {
		
		System.out.println(myClass + "날고 있삼... 허우적 허우적");
		
	}
	
}
