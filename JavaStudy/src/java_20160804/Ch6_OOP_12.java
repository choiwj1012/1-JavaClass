package java_20160804;

class MyMath2{
	long a, b;
	
	long add(){return a + b;}
	long subract(){return a - b;}
	long multiply(){return a * b;}
	long divide(){return a / b;}
	
	static long add(long a, long b){return a + b;}
	static long subtract(long a, long b){return a - b;}
	static long multiply(long a, long b){return a * b;}
	static long divide(long a, long b){return a / b;}
}

public class Ch6_OOP_12 {
	
	public static void main(String[] args){
		
		System.out.println(MyMath2.add(200L, 100L));
		System.out.println(MyMath2.subtract(200,100));
		System.out.println(MyMath2.multiply(200, 100));
		System.out.println(MyMath2.divide(200, 100));
		
		MyMath2 mm = new MyMath2();
		mm.a = 500L;
		mm.b = 300L;
		
		System.out.println(mm.add());
		System.out.println(mm.subract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
		
	}
	
}
