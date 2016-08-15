package java_20160814_api;

public class Equals_01 {
	
	public static void main(String[] args){
		
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		// 값이 같다고 할지라도 참조하는 주소가 다르기 때문에 false인 것이다!
		if (v1.equals(v2)) {
			System.out.println("v1과 v1는 같음");
		} else {
			System.out.println("v1과 v2는 다름");
		}
		
		v2 = v1;
		
		if (v1.equals(v2)) {
			System.out.println("v1과 v1는 같음");
		} else {
			System.out.println("v1과 v2는 다름");
		}
		
	}
	
}

class Value{
	
	int value;
	
	Value(int value){
		this.value = value;
	}
	
}
