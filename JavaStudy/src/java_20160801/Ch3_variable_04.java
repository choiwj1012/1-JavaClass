/* �䱸����
 * ȸ���� ������ �Է¹޾�, ����ϴ� SW�� ����� �ּ���.
 * �䱸���� �м�
 * 1. ȸ�� ������ ���̵�, ��ȣ, �̸�, ����, ����(M/F), �ּ�, ��ȭ��ȣ, �̸���, �̸��� ���ſ���(true, false)
 * 2. �Է� ��ġ�� Ű����
 * 3. ����� �ܼ�â */

package java_20160801;

import java.util.Scanner;

public class Ch3_variable_04 {
	public static void main(String[] args){
		
		float f1 = 12.34F;
		double d = 12.34;
		float f2 = (float)d;
		
		// declaire variable
		
		String id;
		String password;
		String name;
		int age;
		char gender;
		String address;
		String tel;
		String userEmail;
		boolean acceptEmail;

		Scanner keyboard = new Scanner(System.in);
		
		// next()�� nextLine()�� ���̴� ������ �νĿ������� 
		// nextInt()�� ������ �߻��Ѵ� (52�� ���� Ȯ��)
		
		System.out.println("���̵� �Է��ϼ��� > ");
		id = keyboard.next();
		
		System.out.println("��й�ȣ�� �Է��ϼ��� > ");
		password = keyboard.next();
		
		System.out.println("�̸��� �Է��ϼ��� > ");
		name = keyboard.next();

		System.out.println("���̸� �Է��ϼ��� > ");
		age = keyboard.nextInt();
		
		System.out.println("������ �Է��ϼ��� (M �Ǵ� F) > ");
		gender = keyboard.next().charAt(0); // char Ÿ���� �����͸� �޴� ���
		
		System.out.println("�ּҸ� �Է��ϼ��� > ");
		keyboard.nextLine(); // nextLine ������ �߻��ÿ��� �ѹ� �� �־��ָ� ���� �ȴ�
		address = keyboard.nextLine();
		
		System.out.println("��ȭ��ȣ�� �Է��ϼ��� > ");
		tel = keyboard.next();
		
		System.out.println("�̸����� �Է��ϼ��� > ");
		userEmail = keyboard.next();
		
		System.out.println("�̸��� ���ŵ��� ���θ� �Է��ϼ���. ��, true or false > ");
		acceptEmail = keyboard.nextBoolean();
		
		keyboard.close();
		
		System.out.println("����� ���̵�� : " + id);
		System.out.println("����� ��й�ȣ�� : " + password);
		System.out.println("����� �̸��� : " + name);
		System.out.println("����� ���̴� : " + age);
		System.out.println("����� ������ : " + gender);
		System.out.println("����� �ּҴ� : " + address);
		System.out.println("����� ��ȭ��ȣ�� : " + tel);
		System.out.println("�̸��� ���ſ��� : " + acceptEmail);
		// {} blace [] bracket
	}
}








