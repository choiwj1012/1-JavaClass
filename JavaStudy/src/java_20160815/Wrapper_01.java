package java_20160815;

public class Wrapper_01 {
	
	public static void main(String[] args){
		
		Integer i  = new Integer(100);
		Integer i2 = new Integer(100);
		Integer i3 = new Integer(200);
		
		System.out.println(i == i2);
		System.out.println(i.equals(i2));
		System.out.println(i.compareTo(i2));
		System.out.println(i.compareTo(i3));
		System.out.println(i.toString());
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE + " bits");
		System.out.println(Integer.BYTES + " bytes");
		System.out.println(Integer.TYPE);
		
	}
	
}
