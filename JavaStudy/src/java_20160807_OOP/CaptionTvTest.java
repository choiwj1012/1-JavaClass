package java_20160807_OOP;

class Tv{
	
	// variable
	boolean power;
	int channel;
	
	// method
	void power(){
		power = !power;
	}
	void channelUp(){
		++channel;
	}
	
	void channelDown(){
		--channel;
	}
	
}

class CaptionTv extends Tv{
	// variable
	boolean caption;
	
	//method
	void displayCaption(String text){
		
		if(caption){
			System.out.println(text);
		} // if end
		
	}

}

public class CaptionTvTest {
	
	public static void main(String[] args){
		
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello World");
		ctv.caption = true;
		ctv.displayCaption("Hello World");
		
	}
		
}
