package java_20160802;

public class Ch4_loop_03 {
	public static void main(String[] args){
		
		// 1 ~ 10 까지의 누적 합계를 출력
		int sum_for = 0;
		
		for(int i=1; i<11; i++){
			sum_for = sum_for + i;
		}
		System.out.println(sum_for);
		
		
		int sum_while = 0;
		int j = 1;
		
		while(j<11){
			sum_while = sum_while + j;
			j++;
		}
		System.out.println(sum_while);
		
		
		int sum_doWhile = 0;
		int k = 1;
		
		do{
			sum_doWhile = sum_doWhile + k;
			k++;
		}while(k<11);
		System.out.println(sum_doWhile);
		
	}
}
