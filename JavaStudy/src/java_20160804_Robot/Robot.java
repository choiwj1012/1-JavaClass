package java_20160804_Robot;

import java.util.Scanner;

public class Robot {

	Scanner keyboard = new Scanner(System.in);
	
	// variable
	private String robotName;
	private String serialNumber;
	
	// getter and setter
	public String getRobotName() {
		return robotName;
	}

	public void setRobotName(String robotName) {
		this.robotName = robotName;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	// method
	// 로봇 정보 수정
	void fixRobot(){
	
		while(true){
			System.out.println("원하시는 수정을 선택하십시오");
			System.out.println("1.로봇 이름" + "2.로봇 시리얼");
			int selectedNum = keyboard.nextInt();
			
			if(selectedNum == 1){
				System.out.println("로봇 이름을 작성해 주십시오");
				String robotName = keyboard.next();
				setRobotName(robotName);	
			}else if(selectedNum == 2){
				System.out.println("로봇 시리얼 넘버를 작성해 주십시오");
				String serialNumber = keyboard.next();
				setRobotName(serialNumber);	
			}else if(selectedNum == 3){
				System.out.println("수정을 종료하겠습니다");
				break;
			}else{
				System.out.println("잘못 입력하셨습니다");
			} // if end
			
		} // while end
		
	}
	
	// 로봇 걷기
	void walk(){
		
		
		
	}
	
	// 로봇 뛰기
	void run(){
		
		
		
	}
	
	// 로봇 날기
	void fly(){
		
		
		
	}
	
	// 로봇 미사일 쏘기
	void shootMissile(){
		
		
		
	}
	
	// 로봇 칼을 휘두르기
	void swingSnife(){
		
		
		
	}
	
	// 로봇정보 보기
	void viewRobotInfo(){
		
		
		
	}
	
	// constructor
	Robot(){
		
		
		
	}

	Robot(String robotName, String serialNumber){
		
		
		
	}
	
}
