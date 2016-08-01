// 요구사항
// 아이디와 패스워드를 통해 로그인하는 sw를 만들어 주세요
// 단, id는 1234, password는 1234로 고정되어 있습니다.

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
		System.out.println("아이디를 입력하세요 > ");
		id = keyboard.next();
		
		// scanner close
		keyboard.close();
		
		// calculate
		// id == "1234" && password == "1234" --> 문자열 비교는 == 이 아니고 equals()로 해야 한다.
		while(true){
			if(id.equals("1234")){
				
				System.out.println("비밀번호를 입력하세요 > ");
				password = keyboard.next();
				
				if(password.equals("1234")){
					System.out.println("로그인 되었습니다.");
				}else{
					System.out.println("패스워드를 확인해 주세요");
					return;
				}
			}else{
				System.out.println("아이디를 확인해 주세요");
				return;
			}
		}	
	}
}
