package java_20160802;

import java.util.Scanner;

public class Ch4_DoWhile {
	public static void main(String[] args){
		int input = 0;
		int answer = 0;
		
		answer = (int)(Math.random()*100)+1;
		Scanner keyboard = new Scanner(System.in);
		
		do{
			System.out.println("1�� 100������ ������ �Է��ϼ���");
			String tmp = keyboard.next();
			input = Integer.parseInt(tmp);
			
			if(input > answer){
				System.out.println("�� ���� �� �Դϴ�.");
			}else if(input < answer){
				System.out.println("�� ū �� �Դϴ�.");
			}
			
		}while(input!=answer);
		
		System.out.println("�����Դϴ�.");
	}
}
