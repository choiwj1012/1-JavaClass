package java_20160806_abstraction;

public class Animal {
	
	static int age = 0;
	
	static{
		System.out.println("동물 클래스 레디 온 !");
	}
	
	void cry(){	
		System.out.println("나는 동물, 어떻게 울어야 하나?");
	}
	
}
