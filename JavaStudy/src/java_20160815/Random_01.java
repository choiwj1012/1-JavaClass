package java_20160815;

import java.util.Random;

public class Random_01 {

	public static void main(String[] args){
		
		Random rand = new Random(1);
		Random rand2 = new Random(2);
		
		System.out.println("= rand =");
		for(int i=0; i<5; i++){
			System.out.println(i + " : " + rand.nextInt());
		}

		System.out.println();
		System.out.println("= rand2 =");
		for(int i=0; i<5; i++){
			System.out.println(i + " : " + rand2.nextInt());
		}
		
		
	}
	
}
