package java_20160802;

public class Ch4_Array_01 {
	public static void main(String[] args){
		int[] score = new int[5];
		int k = 1;
		// int[] scores = {10,20,30,40,50};
		score[0] = 50;
		score[1] = 60;
		score[k+1] = 70;
		score[3] = 80;
		score[4] = 90;
		score[k+3] = 100;
		
		for(int i=0; i<score.length; i++){
			System.out.println(score[i]);
		}
		
		int temp = score[k+2] + score[4];
		for(int i=0; i<score.length; i++){
			System.out.printf("score[%d] : %d%n", i, score[i]);	
		}
		
		System.out.printf("tmp:%d%n",temp);
	}
}
