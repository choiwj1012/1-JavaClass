package java_20160801;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Ch3_workout_2 {
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);

		// �̻��� ����
		int AIM_9 = 0;
		int AGM_65 = 0;
		int AGM_119 = 0;
		int missileCount = 0;
		int fireMissle;

		System.out.println("F16 ���⸦ �����մϴ�.");

		for(;missileCount<1;) { //��� 1���� �̻����� ����
			
			System.out.println("AIM_9 �̻����� ������ ������ �Է��ϼ���.");
			AIM_9 = keyboard.nextInt();
			
			System.out.println("AGM_65 �̻����� ������ ������ �Է��ϼ���.");
			AGM_65 = keyboard.nextInt();
			
			System.out.println("AGM_119 �̻����� ������ ������ �Է��ϼ���.");
			AGM_119 = keyboard.nextInt();
			
			missileCount=AIM_9+AGM_65+AGM_119;
			
			if(missileCount==0) //�̻����� �������� �ʾ��� �� ��� �޼��� ���
				System.out.println("��� 1���� �̻����� ������ �ּ���.");
		}

		// ������
		System.out.println("�����Ⱑ ����մϴ�.");

		for(;missileCount>0;){ //�� �̻��� ������ 0�� �ƴ� ���� �ݺ�
			System.out.println("�߻��� �̻����� �����Ͻʽÿ�.(1:AIM_9, 2:AGM_65, 3:AGM_119)");
			System.out.println("���� �̻��� �ܷ��� " + "AIM_9(" + AIM_9 + "), " + "AGM_65(" + AGM_65 + "), " + "AGM_119(" + AGM_119 + ") �Դϴ�.");
			fireMissle = keyboard.nextInt(); //�߻��� �̻����� fireMissle�� ����
			if(fireMissle == 1){ //�߻��� �̻����� AIM_9�� ��,
				if(AIM_9>0){ 
					System.out.println("AIM_9 �̻����� �߻�Ǿ� ���� ���߽��׽��ϴ�.\n");
					AIM_9--; //�̻����� ���������� �߻��ϰ� ���� ����
				}else{ //�̻��� �ܷ��� 0�� ��, ��� �޼��� ���
					System.out.println("AIM_9 �̻����� ��� �����Ǿ����ϴ�. �ٸ� �̻����� �����ϼ���.\n");
				}
			}else if(fireMissle == 2){
				if(AGM_65>0){
					System.out.println("AGM_65 �̻����� �߻�Ǿ� ���� ���߽��׽��ϴ�.\n");
					AGM_65--; //�̻����� ���������� �߻��ϰ� ���� ����
				}else{ //�̻��� �ܷ��� 0�� ��, ��� �޼��� ���
					System.out.println("AGM_65 �̻����� ��� �����Ǿ����ϴ�. �ٸ� �̻����� �����ϼ���.\n");
				}
			}else if(fireMissle == 3){
				if(AGM_119>0){
					System.out.println("AGM_119 �̻����� �߻�Ǿ� ���� ���߽��׽��ϴ�.\n");
					AGM_119--; //�̻����� ���������� �߻��ϰ� ���� ����
				}else{ //�̻��� �ܷ��� 0�� ��, ��� �޼��� ���
					System.out.println("AGM_119 �̻����� ��� �����Ǿ����ϴ�. �ٸ� �̻����� �����ϼ���.\n");
				}
			}
			missileCount=AIM_9+AGM_65+AGM_119; //�̻��� �߻� ��, �� �̻��� ���� �ʱ�ȭ
		}
		System.out.println("��� �̻����� �����Ͽ����ϴ�.���̽��� �����մϴ�.");
	}
}
