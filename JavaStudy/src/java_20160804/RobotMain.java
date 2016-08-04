package java_20160804;

import java.util.Scanner;

public class RobotMain {
	
	public static void main(String[] args){
		
		// create Robot class => firstRobot instance
		Robot1_2 firstRobot = new Robot1_2();
		
		firstRobot.setSerialNumber("1324234-2314234");
		String serial = firstRobot.getSerialNumber();
		
		firstRobot.setName("첫번째 ");
		String name = firstRobot.getName();
		
		// create Robot class => secondRobot instance
		Robot1_2 secondRobot = new Robot1_2();
		
		secondRobot.setSerialNumber("4132452-4234523");
		String secondRobotSerial = secondRobot.getSerialNumber();
		
		secondRobot.setName("두번째 ");
		String secondRobotName = secondRobot.getName();
		
		// create Robot3 class => third, fourth, fifth Robot instance
		Robot3 thirdRobot = new Robot3("9348274-3847273", "가상로봇3");
		Robot3 fourthRobot = new Robot3();
		Robot3 fifthRobot  = new Robot3("1234234-1234234","가상로봇5");
		
		// create Robot4 class => sixth Robot instance
		Robot4 sixthRobot = new Robot4();
		
		// on Scanner 
		Scanner keyboard = new Scanner(System.in);
		
		// choice Menu
		while(true){
			
			System.out.println("원하시는 메뉴를 선택하세요");
			
			String[] menu = {"| 1 걷기 |"," 2 뛰기 |", " 3 날기 |", " 4 미사일쏘기 |", " 5 검휘두르기 |", " 6 종료 |"};
			for(int i=0; i<menu.length; i++){
				System.out.print(menu[i]);
			}
			System.out.println("");
			System.out.print(">");
			
			int selectedMenu = keyboard.nextInt();
			if(selectedMenu == 1){
				firstRobot.walk(serial,name);
				System.out.println();
				secondRobot.walk();
				System.out.println();
				thirdRobot.walk();
				System.out.println();
				fourthRobot.walk();
				System.out.println();
				fifthRobot.walk();
				System.out.println();
			}else if(selectedMenu == 2){
				firstRobot.run(serial,name);
				System.out.println();
				secondRobot.run();
				System.out.println();
				thirdRobot.run();
				System.out.println();
				fourthRobot.run();
				System.out.println();
				fifthRobot.run();
				System.out.println();
			}else if(selectedMenu == 3){
				firstRobot.fly(serial,name);
				System.out.println();
				secondRobot.fly();
				System.out.println();
				thirdRobot.fly();
				System.out.println();
				fourthRobot.fly();
				System.out.println();
				fifthRobot.fly();
				System.out.println();
			}else if(selectedMenu == 4){
				firstRobot.shootMissle(serial,name);
				System.out.println();
				secondRobot.shootMissle();
				System.out.println();
				thirdRobot.shootMissle();
				System.out.println();
				fourthRobot.shootMissle();
				System.out.println();
				fifthRobot.shootMissle();
				System.out.println();
			}else if(selectedMenu == 5){
				firstRobot.swingKnife(serial,name);
				System.out.println();
				secondRobot.swingKnife();
				System.out.println();
				thirdRobot.swingKnife();
				System.out.println();
				fourthRobot.swingKnife();
				System.out.println();
				fifthRobot.swingKnife();
				System.out.println();
			}else if(selectedMenu == 6){
				System.out.println("로봇프로그램을 종료합니다");
				break;
			}else{
				System.out.println("잘못 선택하셨습니다. 다시 선택하세요");
			}// if end
			
		} // while end
		
		keyboard.close();
		
	} // main() end
	
}
