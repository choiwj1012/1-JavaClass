// �䱸����
// ���̵�� �н����带 ���� �α����ϴ� sw�� ����� �ּ���
// ��, id�� 1234, password�� 1234�� �����Ǿ� �ֽ��ϴ�.

package java_20160801;

import java.util.Scanner;

public class Ch3_if_01 {
	public static void main(String[] args){
		
		// declair variable
		String id;
		String password;
		
		// import scanner class
		Scanner keyboard = new Scanner(System.in);
		
		// input data
		System.out.println("���̵� �Է��ϼ��� > ");
		id = keyboard.next();
		
		// scanner close
		keyboard.close();
		
		// calculate
		// id == "1234" && password == "1234" --> ���ڿ� �񱳴� == �� �ƴϰ� equals()�� �ؾ� �Ѵ�.
		while(true){
			if(id.equals("1234")){
				
				System.out.println("��й�ȣ�� �Է��ϼ��� > ");
				password = keyboard.next();
				
				if(password.equals("1234")){
					System.out.println("�α��� �Ǿ����ϴ�.");
				}else{
					System.out.println("�н����带 Ȯ���� �ּ���");
					return;
				}
			}else{
				System.out.println("���̵� Ȯ���� �ּ���");
				return;
			}
		}	
	}
}
