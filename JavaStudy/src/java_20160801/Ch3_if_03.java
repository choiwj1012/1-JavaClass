/* �䱸����
 * �̻��� �߻� �ý����� ����� �ּ���
 * �̻����� �߻��ϴ� ������
 * ���� �̻����� ������ �����ϰ�,
 * ������ �߻� ��ư�� �����ϴ�.
 * ����, �̻��� ������ �������� ���� ���¿��� �߻� ��ư�� ������ �̻����� �����ϼ���. ��� �޼��� ���
 * �̻����� ���� ���ڷ� �ڵ�ȭ
 * 1 : ��Ŀ�� �̻���, 2 : �丶ȣũ �̻���, 3 : ���
 */

package java_20160801;

import java.util.Scanner;

public class Ch3_if_03 {
	public static void main(String[] args){
		
		int missileType = 0; // �̻��� ������
		char isMissileShoot; // y�� �� ������ �̻��� �߻�, n�� ���� �̻��� �߻� ���
		
		Scanner keyboard = new Scanner(System.in);
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
		}
	}
}





