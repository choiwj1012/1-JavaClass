package java_20160805_homework;

public class Driver_03 {
	public static void main(String[] args){
		
		Animal[] animals = new Animal[7];
		animals[0] = new Animal();
		animals[1] = new Mammal();
		animals[2] = new Birds();
		animals[3] = new Whale();
		animals[4] = new Bat();
		animals[5] = new Sparrow();
		animals[6] = new Penguin();
		
		// 포유류, 조류, 고래, 박쥐, 참새, 펭귄은 ====== 동물이다!
		
		for(int i=0; i<animals.length; i++){
			animals[i].showMe();
		}
		
	}
}
