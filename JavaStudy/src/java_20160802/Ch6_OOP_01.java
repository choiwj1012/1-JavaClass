package java_20160802;

public class Ch6_OOP_01 {
	public static void main(String[] args){
		
		TvSecond[] tvArr = new TvSecond[3];
		
		for(int i=0; i<tvArr.length; i++){
			tvArr[i] = new TvSecond();
			tvArr[i].channel = i + 10;
		}
		
		for(int i=0; i<tvArr.length; i++){
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d].channel = %d%n", i, tvArr[i].channel);
		}
	}
}

class TvSecond{
	
	String color;
	boolean power;
	int channel;
	
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
