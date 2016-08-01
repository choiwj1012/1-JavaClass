package java_20160801;

import java.util.Scanner;

public class Ch3_for_01 {
	public static void main(String[] args){
		
		int missileCount = 0;
		int residualQuantity = 0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("미사일을 장착할 수량을 입력하세요");
		missileCount = keyboard.nextInt();
		residualQuantity = missileCount - 1;
		System.out.println("미사일 잔여량은 : "+residualQuantity);
		
		for(int i=0; i<missileCount; i++){
			
			int missileType = 0; // 미사일 미장착
			char isMissileShoot; // y일 때 장착한 미사일 발사, n일 때는 미사일 발사 취소
			
			System.out.println("아래와 같이 0 ~ 3 사이의 미사일 종류를 선택하세요");
			System.out.println("0:미장착, 1:스커드 미사일, 2:토마호크 미사일, 3:사드");
			missileType = keyboard.nextInt();
			
			System.out.println("미사일을 발사하시겠습니까? (y/n)");
			isMissileShoot = keyboard.next().charAt(0);
			
			if(isMissileShoot == 'y' || isMissileShoot == 'Y'){
				if(missileType == 0){
					System.out.println("미사일이 미장착 되었습니다.");
				}else if(missileType == 1){
					System.out.println("스커드 미사일 발사");
				}else if(missileType == 2){
					System.out.println("토마호크 미사일 발사");
				}else if(missileType == 3){
					System.out.println("사드 미사일 발사");
				}
				
			}else if(isMissileShoot=='n' || isMissileShoot=='Y'){
				System.out.println("미사일 발사가 취소되었습니다.");
				missileCount--;
			}
		}
		keyboard.close();
		System.out.println("종료");
		
	}
}
