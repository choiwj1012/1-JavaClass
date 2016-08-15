package java_20160814_api;

public class StringBuffer_01 {
	
	public static void main(String[] args){
	
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		// StringBuffer클래스는 String과 다르게 equals 메서드가 오버라이드 되어있지 않다.
		System.out.println("sb == sb2 ? " + (sb == sb2));
		
		// StringBuffer클래스끼리의 비교를 위해서는 toString() 메서드를 사용해야 한다.
		String s1 = sb.toString();  
		String s2 = sb2.toString();
		System.out.println(s1.equals(s2));
		
	}
	
}
