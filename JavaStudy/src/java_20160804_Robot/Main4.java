package java_20160804_Robot;

import java.util.Scanner;

public class Main4 {
	
	public static void main(String[] args){

		final int ROBOT_COUNT = 3;
		
		// Robot 타입의 인스턴스가 3개 저장 관리될 배열 robots를 선언한다.
		Robot4[] robots = new Robot4[3];
		
		// 인스턴스 배열을 생성한 후에는 각 배열의 요소에 대한 인스턴스를 생성해야 한다.
		/* robots[0] = new Robot3();
		 * robots[1] = new Robot3();
		 * robots[2] = new Robot3(); */
		
		// Robot 타입의 배열인 robots에 각 요소에 Robot 클래스의 인스턴스를 생성하여 저장
		for(int i=0; i<robots.length; i++){
			robots[i] = new Robot4();
		}
		
		Scanner keyboard = new Scanner(System.in);
		
		for(int i=0; i<robots.length; i++){
			
			System.out.print("제품 번호 : ");
			String sn = keyboard.next();
			robots[i].setSn(sn);
			
			System.out.println("로봇 이름 : ");
			String name = keyboard.next();
			robots[i].setName(name);
			
		}
		
		System.out.println("제품번호\t로봇이름");
		for(int i=0; i<robots.length; i++){
			
			System.out.print(robots[i].getSn() + "\t");
			System.out.println(robots[i].getName());
		
		}
		
		keyboard.close();
		
	} // main() end
	
}
