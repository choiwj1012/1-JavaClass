package java_20160815;

import java.util.Scanner;

public class Scanner_01 {
	
	public static void main(String[] args){
		
		Scanner keyboard = new Scanner(System.in);
		String[] argArr = null;
		
		while(true){
		
			String prompt = ">>";
			System.out.print(prompt);
			
			String input = keyboard.nextLine();
			
			input = input.trim();
			argArr = input.split(" +");
			
			String command = argArr[0].trim();
			
			if("".equals(command)){
				continue;
			}
			
			// 명령어를 소문자로 바꾼다.
			command = command.toLowerCase();
			
			if(command.equals("q")){
				System.exit(0);
			} else {
				for(int i=0; i<argArr.length; i++){
					System.out.println(argArr[i]);
				}
			}
			
			
		}
		
		
		
	}
	
}
