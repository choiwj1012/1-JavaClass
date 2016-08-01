package java_20160801;

public class Ch3_variable_01 {
	public static void main(String[] args){
		
		int i = 10; // ������ ���ͷ� 10�� int�� ���� i�� ����
		byte j = 15; // ������ ���ͷ� 15�� byte�� ���� j�� ����

		System.out.println(i);
		System.out.println(j);
		
		double k = 12.34;
		int l = (int)k; //.34 ������ �ҽ�
		
		System.out.println(k);
		System.out.println(l);
		
		/* �ڹ��� �� ��ȯ
		 * 
		 * 1. automatic type casting (������ ����ȯ)
		 * ex_1) double d = 10; (int -> double)
		 * ex_2) int i = 12.78; (double -> int)(exception, type mismatch)
		 *  
		 * 2. forced type casting (����� ����ȯ)
		 * ex_1) int i = (int)12.78;
		 */
		
		// g : ������ ��, e : ����� ��
		// g, e�� �������̴�.
		
		
		int g = 9;
		int e = 7;
		double r = (double) e / g * 100;
		System.out.println(r);
		
	}
}
