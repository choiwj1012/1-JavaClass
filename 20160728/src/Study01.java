import java.util.Scanner;

public class Study01 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("ù ��° ���ڸ� �Է��ϼ��� >");
		int num1 = scanner.nextInt();
		
		System.out.print("�� ��° ���ڸ� �Է��ϼ��� >");
		int num2 = scanner.nextInt();
		
		int plus = num1 + num2;
		int subtract = num1 - num2;
		int multiple = num1 * num2;
		double divide = (double) num1 / num2;
				
		System.out.println("�� ���ڸ� ���� ���� = " + plus);
		System.out.println("�� ���ڸ� �� ���� = " + subtract);
		System.out.println("�� ���ڸ� ���� ���� = " + multiple);
		System.out.println("�� ���ڸ� ���� ���� = " + divide);
	}
}