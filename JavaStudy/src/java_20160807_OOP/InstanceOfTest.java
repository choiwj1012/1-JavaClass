package java_20160807_OOP;

public class InstanceOfTest {
	
	public static void main(String[] args){
		FireEngine1 fe = new FireEngine1();
		
		if(fe instanceof FireEngine1){
			System.out.println("this is a FireEngine instance");
		} 
		
		if(fe instanceof Car1){
			System.out.println("this is a car instance");
		}
		
		if(fe instanceof Object){
			System.out.println("this is an object instance");
		}
		
		System.out.println(fe.getClass().getName());
		
	}
	
}

class Car1{}
class FireEngine1 extends Car1{}