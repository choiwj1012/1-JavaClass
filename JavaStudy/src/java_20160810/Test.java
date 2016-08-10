package java_20160810;

public class Test {
	
	int i; // instance variable
	
	public void test1(){
	
		int j = 0; // j is local variable 
		System.out.println(j);
		
	}
	
	public void test2(){
		
		// j = 200; // j cannot be resolved to a variable
		i = 100;
		
	}
	
}
