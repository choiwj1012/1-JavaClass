package java_20160803;

import java.util.Scanner;

public class Ch6_OOP_04 {
	
	// 전역변수 global variable
	static Scanner keyboard = new Scanner(System.in);
	static int num1;
	static int num2;
	static double result;
	
	
	public static void main(String[] args){
		
		// main()는 java application의 start point
		// method안에 method는 올 수 없다.
		// method는 다른 method를 호출할 수 있다.
		
		main();
	}
	
	public static void main(){
		
		boolean exit = false;
		
		while(!exit){
			System.out.println("메뉴를 선택하세요");
			System.out.println("1. 더하기");
			System.out.println("2. 빼기");
			System.out.println("3. 곱하기");
			System.out.println("4. 나누기");
			System.out.println("5. 종료");
			
			int selectedMenu = keyboard.nextInt();
			
			if(selectedMenu == 1){
				plus(10,20); 
			}else if(selectedMenu == 2){
				sub();
			}else if(selectedMenu == 3){
				mul();
			}else if(selectedMenu == 4){
				div();
			}else if(selectedMenu == 5){
				exit = true;
			}else{
				System.out.println("메뉴를 다시 선택해 주세요");
			}
		}
	}
	
	public static void input(){
		num1 = keyboard.nextInt();
		num2 = keyboard.nextInt();
	}
	
	public static void output(){
		System.out.println(result);
	}
	
	// 모든 method는 void라도 return은 한다. return하는 값이 없는 것이다.
	// local variable의 기준은 method
	
	public static void plus(int num1, int num2){
		input();
		result = num1 + num2;
		output();
	}
	
	public static void sub(){
		input();
		result = num1 - num2;
		output();
	}
	
	public static void mul(){
		input();
		result = num1 * num2;
		output();
	}
	
	public static void div(){
		input();	
		result = num1 / num2;
		output();
	}	
}
