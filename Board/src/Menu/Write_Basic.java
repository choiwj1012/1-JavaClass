package Menu;

import java.util.Scanner;

public class Write_Basic extends Write{

	Scanner keyboard = new Scanner(System.in);
	
	@Override
	public void write(){
		System.out.println("글쓰기 항목에 오셨습니다.");
		
		// 제목 입력
		Modify.modifyTitle(Article.totalArticleNumber);
		
		// 내용 입력
		Modify.modifyWriter(Article.totalArticleNumber);
		
		// 작성자 입력
		Modify.modifyContent(Article.totalArticleNumber);
		
		// 작성시 글번호 1씩 증가
		Article.articleNumber[Article.totalArticleNumber] = Article.totalArticleNumber + 1;
		
		// 조회수 0으로 초기화
		Article.articleReadCount[Article.totalArticleNumber] = 0;
		
		// 글갯수 1씩 증가
		Article.totalArticleNumber = Article.totalArticleNumber + 1; 
			
	}
	
}
