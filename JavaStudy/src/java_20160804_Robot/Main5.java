package java_20160804_Robot;

import java.util.Scanner;

public class Main5 {
	
	public static void main(String[] args){

		final int ROBOT_COUNT = 3;
		Robot5[] robots = new Robot5[3];
		Scanner keyboard = new Scanner(System.in);
		
		for(int i=0; i<robots.length; i++){
			
			System.out.print("제품 번호 : ");
			String sn = keyboard.next();
			
			System.out.print("로봇 이름 : ");
			String name = keyboard.next();
			
			robots[i] = new Robot5(sn, name);
				
		}
		
		System.out.println("제품번호\t로봇이름");
		for(int i=0; i<robots.length; i++){
			
			System.out.print(robots[i].getSn() + "\t");
			System.out.println(robots[i].getName());
		
		}
		
		keyboard.close();
		
	} // main() end
	
}
