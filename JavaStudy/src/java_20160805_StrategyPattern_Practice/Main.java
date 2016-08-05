package java_20160805_StrategyPattern_Practice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Scanner 
		Scanner keyboard = new Scanner(System.in);
		
		// 변수 선언
		String[] mainMenu = {"1.Warrior","2.Hunter","3.Defender","4.Eagle","5.게임종료"};
		boolean exit = false;
		
		// 객체 생성
		Fighter warrior = new Warrior();
		Fighter hunter = new Hunter();
		Fighter defender = new Defender();
		Fighter eagle = new Eagle();
		FightField fightField = new FightField();
		
		// 게임 시작
		while(!exit){	
			// 시작 메뉴
			System.out.println("캐릭터를 선택해 주십시오");
			for(int i=0; i<mainMenu.length; i++){
				System.out.println(mainMenu[i]);
			}	
			String selectedMenu = keyboard.next();
			
			// 캐릭터 선택
			if(selectedMenu.equals("1")){
				warrior.identity();
				warrior.goToField();
				fightField.fight("Warrior");
			}else if(selectedMenu.equals("2")){
				hunter.identity();
				hunter.goToField();
				fightField.fight("Hunter");
			}else if(selectedMenu.equals("3")){
				defender.identity();
				defender.goToField();
				fightField.fight("Defender");
			}else if(selectedMenu.equals("4")){
				eagle.identity();
				eagle.goToField();
				fightField.fight("Eagle");
			}else if(selectedMenu.equals("5")){
				System.out.println("게임을 종료합니다");
				exit = true;
			}
		}
		
	}

}
