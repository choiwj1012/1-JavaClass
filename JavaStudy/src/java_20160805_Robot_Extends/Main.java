/*
 * <요구사항>
 * 
 * - 로봇 제작 소프트웨어
 *  
 * 1. 종류 : Super Robot, Standard Robot, Low Robot 
 * 
 * 2. 공통사양 
 * 	
 * 	1) 모든 로봇은 머리, 몸통, 팔, 다리로 구성되어있다.
 *  2) 모든 로봇은 기본적으로 걷고, 달릴 수 있다.
 * 
 * 3. 특이사항
 *  
 *  1) Super Robot
 *     => 날 수 있다.
 *     => 미사일을 쏠 수 있다.
 *     => 레이저검을 가지고 있다.
 *  
 *  2) Standard Robot
 *     => 날 수 없다.
 *     => 미사일을 쏠 수 있다.
 *     => 목검을 가지고 있다.
 *  
 *  3) Low Robot
 *     => 날 수 없다.
 *     => 미사일을 쏠 수 없다.
 *     => 검이 없다.*/

package java_20160805_Robot_Extends;

public class Main {
	
	public static void main(String[] args){
	
		// create SuperRobot
		SuperRobot superRobot = new SuperRobot();
		
		// operate SuperRobot
		superRobot.shape();
		superRobot.actionWalk();
		superRobot.actionRun();
		superRobot.actionFly();
		superRobot.actionMissile();
		superRobot.actionKnife();
		
		System.out.println();
		
		// create StandardRobot
		StandardRobot standardRobot = new StandardRobot();
		
		// operate StandardRobot
		standardRobot.shape();
		standardRobot.actionWalk();
		standardRobot.actionRun();
		standardRobot.actionFly();
		standardRobot.actionMissile();
		standardRobot.actionKnife();
	
		System.out.println();
		
		// create LowRobot
		LowRobot lowRobot = new LowRobot();
		
		// operate LowRobot
		lowRobot.shape();
		lowRobot.actionWalk();
		lowRobot.actionRun();
		lowRobot.actionFly();
		lowRobot.actionMissile();
		lowRobot.actionKnife();
		
		System.out.println();
		
		// create robot using polymorphism 
		Robot robot1 = new SuperRobot();
		robot1.shape();
		robot1.actionWalk();
		robot1.actionRun();
		// abstract class => abstract method actionFly()
		robot1.actionFly();
		// abstract class => abstract method actionMissle()
		robot1.actionMissile();
		// abstract class => abstract method actionKnife()
		robot1.actionKnife(); 
		
		
		System.out.println();
		
		// create robot using polymorphism 
		Robot robot2 = new StandardRobot();
		robot2.shape();
		robot2.actionWalk();
		robot2.actionRun();
		// abstract class => abstract method actionFly()
		robot2.actionFly();
		// abstract class => abstract method actionMissle()
		robot2.actionMissile();
		// abstract class => abstract method actionKnife()
		robot2.actionKnife();

		System.out.println();
		
		// create robot using polymorphism 
		Robot robot3 = new LowRobot();
		robot3.shape();
		robot3.actionWalk();
		robot3.actionRun();
		// abstract class => abstract method actionFly()
		robot3.actionFly();
		// abstract class => abstract method actionMissle()
		robot3.actionMissile();
		// abstract class => abstract method actionKnife()
		robot3.actionKnife();

		// can`t create instance using abstract class
		// Robot robot4 = new Robot(); => (x)
		
	}
	
}
