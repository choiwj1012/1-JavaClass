package java_20160801;

import java.util.Scanner;

public class Ch3_for_01 {
	public static void main(String[] args){
		
		int missileCount = 0;
		int residualQuantity = 0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("�̻����� ������ ������ �Է��ϼ���");
		missileCount = keyboard.nextInt();
		residualQuantity = missileCount - 1;
		System.out.println("�̻��� �ܿ����� : "+residualQuantity);
		
		for(int i=0; i<missileCount; i++){
			
			int missileType = 0; // �̻��� ������
			char isMissileShoot; // y�� �� ������ �̻��� �߻�, n�� ���� �̻��� �߻� ���
			
			System.out.println("�Ʒ��� ���� 0 ~ 3 ������ �̻��� ������ �����ϼ���");
			System.out.println("0:������, 1:��Ŀ�� �̻���, 2:�丶ȣũ �̻���, 3:���");
			missileType = keyboard.nextInt();
			
			System.out.println("�̻����� �߻��Ͻðڽ��ϱ�? (y/n)");
			isMissileShoot = keyboard.next().charAt(0);
			
			if(isMissileShoot == 'y' || isMissileShoot == 'Y'){
				if(missileType == 0){
					System.out.println("�̻����� ������ �Ǿ����ϴ�.");
				}else if(missileType == 1){
					System.out.println("��Ŀ�� �̻��� �߻�");
				}else if(missileType == 2){
					System.out.println("�丶ȣũ �̻��� �߻�");
				}else if(missileType == 3){
					System.out.println("��� �̻��� �߻�");
				}
				
			}else if(isMissileShoot=='n' || isMissileShoot=='Y'){
				System.out.println("�̻��� �߻簡 ��ҵǾ����ϴ�.");
				missileCount--;
			}
		}
		keyboard.close();
		System.out.println("����");
		
	}
}
