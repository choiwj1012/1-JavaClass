/* 요구사항
 * 미사일 발사 시스템을 만들어 주세요
 * 미사일을 발사하는 절차는
 * 먼저 미사일을 종류를 선택하고,
 * 다음에 발사 버튼을 누릅니다.
 * 만약, 미사일 종류를 선택하지 않은 상태에서 발사 버튼을 누르면 미사일을 선택하세요. 라는 메세지 출력
 * 미사일의 종류 숫자로 코드화
 * 1 : 스커드 미사일, 2 : 토마호크 미사일, 3 : 사드
 */

package java_20160801;

import java.util.Scanner;

public class Ch3_if_03 {
	public static void main(String[] args){
		
		int missileType = 0; // 미사일 미장착
		char isMissileShoot; // y일 때 장착한 미사일 발사, n일 때는 미사일 발사 취소
		
		Scanner keyboard = new Scanner(System.in);
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
		}
	}
}





