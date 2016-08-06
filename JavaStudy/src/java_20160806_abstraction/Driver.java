package java_20160806_abstraction;

public class Driver {

	public static void main(String[] args){
		
		System.out.println("main 메서드 시작!");
		System.out.println(Animal.age);
		
		Animal[] animals = new Animal[5];
		
		animals[0] = new Mouse();  // 쥐
		animals[1] = new Cat();    // 고양이
		animals[2] = new Dog();    // 개
		animals[3] = new Calf();   // 송아지
		animals[4] = new Chick();  // 병아리
		
		for(int i=0; i<animals.length; i++){
			animals[i].cry();
		}
		
	}

}
