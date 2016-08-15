package java_20160815;

public class Wrapper_02 {

	public static void main(String[] args){
		
		int i = new Integer("100").intValue();
		System.out.println(i);
		System.out.println();
		
		int i2 = Integer.parseInt("100");
		System.out.println(i2);
		System.out.println();
		
		Integer i3 = Integer.valueOf("100");
		System.out.println(i3);
		System.out.println();
		
		int i4 = Integer.parseInt("100", 2);
		System.out.println(i4);
		System.out.println();
		
		int i5 = Integer.parseInt("100", 8);
		System.out.println(i5);
		System.out.println();
		
		int i6 = Integer.parseInt("100", 16);
		System.out.println(i6);
		System.out.println();
		
		int i7 = Integer.parseInt("FF", 16);
		System.out.println(i7);
		System.out.println();
		
		//int i8 = Integer.parseInt("FF");
		
		Integer i9 = Integer.valueOf("100", 2);
		System.out.println(i9);
		System.out.println();
		
		Integer i10 = Integer.valueOf("100", 8);
		System.out.println(i10);
		System.out.println();
		
		Integer i11 = Integer.valueOf("100", 16);
		System.out.println(i11);
		System.out.println();
		
		Integer i12 = Integer.valueOf("FF", 16);
		System.out.println(i12);
		System.out.println();
		
	}

}
