package java_20160804_Robot;

import java.util.Scanner;

public class Main2 {
	
	public static void main(String[] args){
		
		// create robot class instance
		Robot2 robot = new Robot2();
		robot.sn = "Robot_01";
		robot.name = "Robot_태권브이";
		
		Robot2 robot2 = new Robot2();
		robot2.sn = "Robot_02";
		robot2.name = "Robot_마징가Z";
		
		Robot2 robot3 = new Robot2();
		robot3.sn = "Robot_03";
		robot3.name = "Robot_짱가";
		
		System.out.println(robot.sn + " " + robot.name);
		System.out.println(robot2.sn + " " + robot2.name);
		System.out.println(robot2.sn + " " + robot3.name);
		
	} // main() end
	
}
