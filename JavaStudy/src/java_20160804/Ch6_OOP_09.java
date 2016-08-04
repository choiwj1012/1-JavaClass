package java_20160804;

public class Ch6_OOP_09 {
	public static void main(String[] args){
		
		int result = factorial(0);
		
		System.out.println(result);
		
	}
	
	static int factorial(int n){
		if(n<=0 || n>12){return -1;}
		if(n==1){return 1;}
		
		return n * factorial(n-1);
		
		// 위 식을 펼쳐놓은 코드
		/*int result = 0;
		
		if(n==1){
			result = 1;
		}else{
			result = n * factorial(n-1);
		}
		
		return result;*/
	}
}
