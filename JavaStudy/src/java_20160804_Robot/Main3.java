package java_20160804_Robot;

import java.util.Scanner;

public class Main3 {
	
	public static void main(String[] args){

		final int ROBOT_COUNT = 3;
		
		// Robot 타입의 인스턴스가 3개 저장 관리될 배열 robots를 선언한다.
		Robot3[] robots = new Robot3[3];
		
		// 인스턴스 배열을 생성한 후에는 각 배열의 요소에 대한 인스턴스를 생성해야 한다.
		/* robots[0] = new Robot3();
		 * robots[1] = new Robot3();
		 * robots[2] = new Robot3(); */
		
		// Robot 타입의 배열인 robots에 각 요소에 Robot 클래스의 인스턴스를 생성하여 저장
		for(int i=0; i<robots.length; i++){
			robots[i] = new Robot3();
		}
		
		Scanner keyboard = new Scanner(System.in);
		for(int i=0; i<robots.length; i++){
			System.out.print("제품 번호 : ");
			robots[i].sn = keyboard.next();
			System.out.println("로봇 이름 : ");
			robots[i].name = keyboard.next();
		}
		
		System.out.println("제품번호\t로봇이름");
		for(int i=0; i<robots.length; i++){
			System.out.print(robots[i].sn + "\t");
			System.out.println(robots[i].name);
		}
		
		keyboard.close();
		
	} // main() end
	
}
