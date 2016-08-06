package java_20160806_Instanceof;

class Animal{
	void method(){
		System.out.println("동물");
	}
}

class Birds extends Animal{
	void method(){
		super.method();
		System.out.println("조류");
	}	
}

class Penguin extends Birds{
	void method(){
		super.method();
		System.out.println("펭귄");
		
		// Syntax error on token "super", Identifier expected
		// super키워드로 바로 위의 상위 클래스 인스턴스에는 접근할 수 있지만 super.super 형태로 상위의 상위클래스의
		// 인스턴스에는 접근이 불가능하다.
		// super.super.method();
	}
}


public class Driver {

	public static void main(String[] args){
		
		Penguin pororo = new Penguin();
		pororo.method();
		
		/*Animal animal = new Animal();
		Animal bird = new Birds();
		Animal penguin = new Penguin();
		
		System.out.println(animal instanceof Animal);
		
		System.out.println(bird instanceof Animal);
		System.out.println(bird instanceof Birds);
		
		System.out.println(penguin instanceof Animal);
		System.out.println(penguin instanceof Birds);
		System.out.println(penguin instanceof Penguin);
	
		System.out.println(penguin instanceof Object);
		*/
	}
	
}
