import java.util.Scanner;

public class Study01 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자를 입력하세요 >");
		int num1 = scanner.nextInt();
		
		System.out.print("두 번째 숫자를 입력하세요 >");
		int num2 = scanner.nextInt();
		
		int plus = num1 + num2;
		int subtract = num1 - num2;
		int multiple = num1 * num2;
		double divide = (double) num1 / num2;
				
		System.out.println("두 숫자를 합한 수는 = " + plus);
		System.out.println("두 숫자를 뺀 수는 = " + subtract);
		System.out.println("두 숫자를 곱한 수는 = " + multiple);
		System.out.println("두 숫자를 나눈 수는 = " + divide);
	}
}