package java_20160801;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Ch3_workout_2 {
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);

		// 미사일 장착
		int AIM_9 = 0;
		int AGM_65 = 0;
		int AGM_119 = 0;
		int missileCount = 0;
		int fireMissle;

		System.out.println("F16 무기를 장착합니다.");

		for(;missileCount<1;) { //적어도 1개의 미사일을 장착
			
			System.out.println("AIM_9 미사일을 장착할 수량을 입력하세요.");
			AIM_9 = keyboard.nextInt();
			
			System.out.println("AGM_65 미사일을 장착할 수량을 입력하세요.");
			AGM_65 = keyboard.nextInt();
			
			System.out.println("AGM_119 미사일을 장착할 수량을 입력하세요.");
			AGM_119 = keyboard.nextInt();
			
			missileCount=AIM_9+AGM_65+AGM_119;
			
			if(missileCount==0) //미사일을 장착하지 않았을 때 경고 메세지 출력
				System.out.println("적어도 1개의 미사일을 장착해 주세요.");
		}

		// 전투중
		System.out.println("전투기가 출격합니다.");

		for(;missileCount>0;){ //총 미사일 갯수가 0이 아닐 동안 반복
			System.out.println("발사할 미사일을 선택하십시오.(1:AIM_9, 2:AGM_65, 3:AGM_119)");
			System.out.println("현재 미사일 잔량은 " + "AIM_9(" + AIM_9 + "), " + "AGM_65(" + AGM_65 + "), " + "AGM_119(" + AGM_119 + ") 입니다.");
			fireMissle = keyboard.nextInt(); //발사할 미사일을 fireMissle에 저장
			if(fireMissle == 1){ //발사할 미사일이 AIM_9일 때,
				if(AIM_9>0){ 
					System.out.println("AIM_9 미사일이 발사되어 적을 격추시켰습니다.\n");
					AIM_9--; //미사일이 남아있으면 발사하고 갯수 감소
				}else{ //미사일 잔량이 0일 때, 경고 메세지 출력
					System.out.println("AIM_9 미사일이 모두 소진되었습니다. 다른 미사일을 선택하세요.\n");
				}
			}else if(fireMissle == 2){
				if(AGM_65>0){
					System.out.println("AGM_65 미사일이 발사되어 적을 격추시켰습니다.\n");
					AGM_65--; //미사일이 남아있으면 발사하고 갯수 감소
				}else{ //미사일 잔량이 0일 때, 경고 메세지 출력
					System.out.println("AGM_65 미사일이 모두 소진되었습니다. 다른 미사일을 선택하세요.\n");
				}
			}else if(fireMissle == 3){
				if(AGM_119>0){
					System.out.println("AGM_119 미사일이 발사되어 적을 격추시켰습니다.\n");
					AGM_119--; //미사일이 남아있으면 발사하고 갯수 감소
				}else{ //미사일 잔량이 0일 때, 경고 메세지 출력
					System.out.println("AGM_119 미사일이 모두 소진되었습니다. 다른 미사일을 선택하세요.\n");
				}
			}
			missileCount=AIM_9+AGM_65+AGM_119; //미사일 발사 후, 총 미사일 갯수 초기화
		}
		System.out.println("모든 미사일을 소진하였습니다.베이스로 복귀합니다.");
	}
}
