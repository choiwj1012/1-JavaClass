package java_20160801;

import java.util.Scanner;

public class Ch3_variable_02 {
	public static void main(String[] args){
		
		// declare variable
		int graduate; // g ���� �ڹ� �⺻�� 0�� ����ȴ�.
		int employee; // e ���� �ڹ� �⺻�� 0�� ����ȴ�.
		double result; //result ���� �ڹ� �⺻�� 0�� ����ȴ�.
		
		// import scanner class
		Scanner keyboard = new Scanner(System.in);
		
		// input data using keyboard
		System.out.println("������ ���� �Է��ϼ���. ��, ������ ���� �����Դϴ�.");
		graduate = keyboard.nextInt();
		System.out.println("����� ���� �Է��ϼ���. ��, ����� ���� �����Դϴ�.");
		employee = keyboard.nextInt();
		
		// scanner class close
		keyboard.close();
		
		// Calculate result
		result = (double)employee/graduate * 100;
		
		// print result
		System.out.println("����� : " + result + "%");
	}
}
