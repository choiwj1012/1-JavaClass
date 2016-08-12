package lotto;

public class Lotto {

	public static void main(String[] args){

		int i = 0;
		boolean isFind = false;
		int[] lottoNumber = new int[6];
		
		while(i<6){
			
			isFind = false;
			
			lottoNumber[i] = (int)(Math.random() * 6) + 1;
			
			for(int j=0; j<i; j++){
				if(lottoNumber[i] == lottoNumber[j]){
					isFind = true;
					break;
				}
			}
			
			if(isFind){
				continue;
			}
			
			System.out.println(lottoNumber[i]);	
			i++;

		}

	}

}

