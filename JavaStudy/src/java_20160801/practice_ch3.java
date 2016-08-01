package java_20160801;

public class practice_ch3 {
	
	public static void main(String[] args){
		
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65
		
		System.out.println(1 + x << 33);
		System.out.println(y >= 5 || x < 0 && x > 2); // && 는 || 보다 우선순위가 높다
		System.out.println(y += 10 - x++);
		
	}
	
}
