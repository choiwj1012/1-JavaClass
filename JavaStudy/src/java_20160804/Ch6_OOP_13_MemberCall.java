package java_20160804;

class MemberCall{
	
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv; // instance변수는 class변수를 사용할 수 있다.
	// static int cv2 = instanceValiable; class변수는 instance변수를 사용할 수 없다.
	static int cv2 = new MemberCall().iv;
	
	
	static void staticMethod1(){
		System.out.println(cv);
		// System.out.println(iv); // class메서드에서는 instance변수를 사용할 수 없다.
		MemberCall c = new MemberCall();
		System.out.println(c.iv); // object를 생성한 후에야 instance변수를 사용할 수 있다.
	}
	
	void instanceMethod1(){
		System.out.println(cv);
		System.out.println(iv);
	}
	
	static void staticMethod2(){
		staticMethod1();
		// instanceMethod1();
		MemberCall c = new MemberCall();
		c.instanceMethod1();
	}
	
	void instanceMethod2(){
		staticMethod1();
		instanceMethod1();
	}
	
}


public class Ch6_OOP_13_MemberCall {

}
