/*
 * �䱸����
 * 2���� ���ڸ� ������� ��Ģ����(����, ����, ����, ������)�� �ϴ� sw�� ����� �ּ���
 * 
 * �䱸���� �м� (�����ڵ�ȭ)
 * ���� Ÿ����? ����
 * �Է� ��ġ��? Ű����
 * ��� ��ġ��? �����(�ܼ�)
 * ��� �̶�? ��Ģ����
 * 
 * */


package java_20160729;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {

		// 1. ���� ����
		// 1.1 ��� ������ �ʿ��Ѱ�? 6�� (2���� ���� ����, �� ������ ��� ���� 4��)
		// 1.2 �� ������ �̸��� �������� �ϴ°�? firstNumber, secondNumber, resultSum, resultSub, resultMul, resultDiv
		// 1.3 �� ������ Ÿ���� �������� �� ���ΰ�?
		int firstNumber, secondNumber, resultSum, resultSub, resultMul;
		double resultDiv;

		//ctrl+a, ctrl+i => ������

		// 2. ���� ������ (raw data) �Է�
		// 2.1 �Է� ��ġ ���� (���� Ű����)
		Scanner keyboard = new Scanner(System.in);
		
		// 2.2 �Է� ��ġ�κ��� �о���� ���� ������ ����
		System.out.println("1��° ���ڸ� �Է��ϼ���. ��, ���ڴ� ������ ���˴ϴ�.");
		firstNumber = keyboard.nextInt();
		System.out.println("2��° ���ڸ� �Է��ϼ���. ��, ���ڴ� ������ ���˴ϴ�.");
		secondNumber = keyboard.nextInt();
		keyboard.close();
		
		// 3. ���
		resultSum = firstNumber + secondNumber;
		resultSub = firstNumber - secondNumber;
		resultMul = firstNumber * secondNumber;
		resultDiv = (double)firstNumber / secondNumber;
		
		// 4. ���
		System.out.println(firstNumber + "+" + secondNumber + "=" + resultSum);
		System.out.println(firstNumber + "-" + secondNumber + "=" + resultSub);
		System.out.println(firstNumber + "*" + secondNumber + "=" + resultMul);
		System.out.println(firstNumber + "/" + secondNumber + "=" + resultDiv);
		
		// Question
		// ������? firstNumber, secondNumber, resultSum, resultSub, resultMul, resultDiv
		// 
		
		int abc = Integer.MAX_VALUE;
		abc += 1;
		System.out.println(abc);
		
		byte num = (byte)300;
		System.out.println(num);
	}

}
