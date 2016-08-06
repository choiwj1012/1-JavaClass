package java_20160805_homework;

public class Bat extends Mammal implements Fly{

	Bat(){
		myClass = "박쥐";
	}

	@Override
	public void fly() {
		System.out.println(myClass + "나알고오오오이이잉ㅆ다다아아");
	}
	
}
