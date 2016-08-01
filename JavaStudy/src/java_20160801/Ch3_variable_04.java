/* 요구사항
 * 회원의 정보를 입력받아, 출력하는 SW를 만들어 주세요.
 * 요구사항 분석
 * 1. 회원 정보는 아이디, 암호, 이름, 나이, 성별(M/F), 주소, 전화번호, 이메일, 이메일 수신여부(true, false)
 * 2. 입력 장치는 키보드
 * 3. 출력은 콘솔창 */

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
		
		// next()와 nextLine()의 차이는 공백의 인식여부차이 
		// nextInt()는 문제가 발생한다 (52번 라인 확인)
		
		System.out.println("아이디를 입력하세요 > ");
		id = keyboard.next();
		
		System.out.println("비밀번호를 입력하세요 > ");
		password = keyboard.next();
		
		System.out.println("이름을 입력하세요 > ");
		name = keyboard.next();

		System.out.println("나이를 입력하세요 > ");
		age = keyboard.nextInt();
		
		System.out.println("성별을 입력하세요 (M 또는 F) > ");
		gender = keyboard.next().charAt(0); // char 타입의 데이터를 받는 방법
		
		System.out.println("주소를 입력하세요 > ");
		keyboard.nextLine(); // nextLine 오류가 발생시에는 한번 더 넣어주면 구별 된다
		address = keyboard.nextLine();
		
		System.out.println("전화번호를 입력하세요 > ");
		tel = keyboard.next();
		
		System.out.println("이메일을 입력하세요 > ");
		userEmail = keyboard.next();
		
		System.out.println("이메일 수신동의 여부를 입력하세요. 단, true or false > ");
		acceptEmail = keyboard.nextBoolean();
		
		keyboard.close();
		
		System.out.println("당신의 아이디는 : " + id);
		System.out.println("당신의 비밀번호는 : " + password);
		System.out.println("당신의 이름은 : " + name);
		System.out.println("당신의 나이는 : " + age);
		System.out.println("당신의 성별은 : " + gender);
		System.out.println("당신의 주소는 : " + address);
		System.out.println("당신의 전화번호는 : " + tel);
		System.out.println("이메일 수신여부 : " + acceptEmail);
		// {} blace [] bracket
	}
}








