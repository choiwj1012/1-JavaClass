/* �䱸����
 * 2���� ���ڸ� �Է¹޾� ��Ģ������ ����� ���� ǥ���ϴ� sw�� ����� �޶�.
 * 2���� ������ Ÿ���� ���� �Ǵ� �Ǽ� ��� �����ؾ� �Ѵ�.
 * �Է��� Ű����� �޴´�.
 * ����� console�� �Ѵ�.*/


package java_20160801;

import java.util.Scanner;

import sun.net.www.content.text.plain;

public class Ch3_variable_03 {
	public static void main(String[] args){
		
		// declair variable
		double firstNum;
		double secondNum;
		double sumResult;
		double subtractResult;
		double multiplyResult;
		double divideResult;
		
		// import scanner class
		Scanner keyboard = new Scanner(System.in);
		
		// input keyboard data
		System.out.println("ù��° ���ڸ� �Է��ϼ���");
		firstNum = keyboard.nextDouble();
		System.out.println("�ι�° ���ڸ� �Է��ϼ���");
		secondNum = keyboard.nextDouble();
		keyboard.close();
		
		// calculate number
		sumResult = firstNum + secondNum;
		subtractResult = firstNum - secondNum;
		multiplyResult = firstNum * secondNum;
		divideResult = firstNum / secondNum;
		
		// print result
		System.out.println("������� : "+sumResult);
		System.out.println("������� : "+subtractResult);
		System.out.println("������� : "+multiplyResult);
		System.out.println("��������� : "+divideResult);
	}
}
