package java_20160801;

import java.util.Scanner;

public class Ch3_if_02 {
	
	public static void main(String[] args){
		
		/* �䱸����
		 * 0 ~ 59 "��", 60 ~ 69 "��", 70 ~ 79 "��", 80 ~ 89 "��", 90 ~ 100 "��" */ 
		
		int score;
		boolean flag = true;
		Scanner keyboard = new Scanner(System.in);
		
		while(flag){
			
			System.out.println("������ �Է��ϼ��� >");
			score = keyboard.nextInt();
			
			if(score >= 0 && score <= 100){
				if(score >= 90){
					System.out.println("��");
					flag = false;
				}else if(score >= 80){
					System.out.println("��");
					flag = false;
				}else if(score >= 70){
					System.out.println("��");
					flag = false;
				}else if(score >= 60){
					System.out.println("��");
					flag = false;
				}else{
					System.out.println("��");
					flag = false;
				}
			}else{
				System.out.println("���ڰ� �߸� �ԷµǾ����ϴ�. 0 ~ 100 ���̷� �Է��ϼ���");
			}
		}
		keyboard.close();
	}
}
