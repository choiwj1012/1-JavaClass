package java_20160801;

public class practice_ch2 {
	public static void main(String[] args){
		
		/* ���� boolean(1 byte)
		 * ������ char(2 byte)
		 * ������ byte(1 byte), short(2 byte), int(4 byte), long(8 byte)
		 * �Ǽ��� float(4 byte), long(8 byte)*/
		
		String regNo = "1111111-1234567";
		int i = 100; 
		long j = 100L;
		final float PI = 3.14f;
		
		/* literal : 100, 100L, 3.14f
		 * variable : i, k
		 * keyword : int, long, final, float
		 * constant : PI */
		
		// < primitive type -> byte, char, short, int, long, float, double, boolean >
		
		System.out.println("1" + "2");
		System.out.println(true + "");
		System.out.println('A' + 'B');
		System.out.println('1' + 2);
		System.out.println('1' + '2');
		System.out.println('J' + "ava");
		// System.out.println(true + null);
				
	}
}
