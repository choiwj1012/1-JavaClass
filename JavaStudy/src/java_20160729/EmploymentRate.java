/* �䱸���� �м�
 * ������� ���ϴ� SW ����
 * ������� ������ �� ����� ����� ������ �ǹ�
 * ���� Ű����� �Է�
 * �ַܼ� ���
 * */

// client �䱸���� -> �䱸���� �м�(�����ڵ�ȭ) -> ���� -> �ڵ�

package java_20160729;

import java.util.Scanner;

public class EmploymentRate {
	
	public static void main(String[] args){
		
		/*
		 * 1. ���� ����
		
		 * 1.1. ���� ����
		 *  => �����, ��������, ����ڼ�
		
		 * 1.2. �ʿ� �������� ���� �̸��� ���� 
		 *	(��Ģ 1 : ���� �̸��� �ҹ��ڷ� �Ѵ�. �ٸ� 2�� �̻��� ���մܾ�� ������ ��� 2��° �ܾ���� �̴ϼ��� �빮�ڷ� ��)
		 *	(��Ģ 2 : variable name�� space�� ������� ����)
		
		 * employmentRate;
		 * graduateCount;
		 * employeeCount;
		
		 * 1.3 ���� Ÿ���� ����
		 * employmentRate => ������ �ε��Ҽ����� �� �� ����. double �Ǵ� float ����
		 * employmentCount & employeeCount => ������ ��. byte, char, short, int, long �� �ϳ� ����
		 */
		
		double employmentRate;
		int graduateCount;
		int employeeCount;
		
		/*
		 * 2. ���꿡 �ʿ��� �����͸� �Է���ġ�� ���� �о�� ������ ����
		 * 2.1 �Է���ġ(����� Ű����)�� ����
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		/*
		 * 2.2 ����� �Է���ġ�� ���� �����͸� �о� �鿩, �̸� ����� ����(graduateCount, employeeCount)
		 * */
		
		System.out.println("������ ���� �Է��ϼ���, �� ������ ���˴ϴ� > ");
		graduateCount = scanner.nextInt();
		System.out.println("����� ���� �Է��ϼ���, �� ������ ���˴ϴ� > ");
		employeeCount = scanner.nextInt();
		
		// Ű���� ��������
		scanner.close();
		
		/*
		 * 3. ���(����) => ������� ���
		 * ����� = ����� �� / ������ �� * 100
		 * */
		
		employmentRate = ((double)employeeCount/graduateCount) * 100;
		
		/* ������ ���� ���
		 * int integerScope = Integer.MAX_VALUE;
		System.out.println(integerScope);*/
		
		/*
		 * 4. ��� => ������� �ַܼ� ���
		 * */
		
		System.out.println("����� : " + employmentRate + "%");
		
	}
	
}










