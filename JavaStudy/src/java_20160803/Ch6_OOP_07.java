package java_20160803;

public class Ch6_OOP_07 {

	public static void main(String[] args){
		Ch6_OOP_07 r = new Ch6_OOP_07();
		
		int result = r.add(3,5);
		System.out.println(result);
		
		int[] result2 = {0};
		r.add(3,5,result2);
		System.out.println(result2[0]);
	}
	
	int add(int a, int b){
	
		return a + b;
		
	}
	
	// 반환값이 있는 메서드를 반환값이 없는 메서드로 변경하는 방법
	void add(int a, int b, int[] result){
		
		result[0] = a + b;
		
	}
	
}
