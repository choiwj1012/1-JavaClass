package Menu;

import java.util.Scanner;

public class Read_Selected extends Read{

	@Override
	public void read() {
		
		Scanner keyboard = new Scanner(System.in);
			
		boolean isFind = false; // 없는 글번호 선택시 다음 행동을 판단하는 기준
		System.out.println("보시고 싶은 글번호를 입력하세요");
		int selectedArtNum = keyboard.nextInt();
		
		for(int i=0; i<Article.totalArticleNumber; i++){
			if(selectedArtNum == Article.articleNumber[i]){ // 선택한 글번호를 찾으면
				Article.articleReadCount[i] = Article.articleReadCount[i] + 1; // 조회수 1 증가
				Print.printList(i);					  // 리스트를 출력
				isFind = true;					  // 글번호를 찾았으므로 true로 변경
			}
		}
		
		if(!isFind){							  // 글번호를 찾지 못했다면
			System.out.println("없는 글번호 입니다");
			read();						          // 다시 입력창으로 돌아감	
		}
		
	}

}
