package test;

import java.util.Scanner;

public class ArticleProcess {

	Scanner keyboard = new Scanner(System.in);
	
	void write(){
		
		if(ArticleRepository.lastArticlePosition >= ArticleRepository.MAX_ARTICLE_COUNT){
			
			System.out.println("글쓰기 갯수가 넘어갔습니다");
			
		}else{
			
			System.out.println("제목 : ");
			String title = keyboard.next();
			System.out.println("내용 : ");
			String content = keyboard.next();
			System.out.println("작성자 : ");
			String writer = keyboard.next();
			
			ArticleRepository.articles[ArticleRepository.lastArticlePosition] = new Article(title, content, writer);
			ArticleRepository.articles[ArticleRepository.lastArticlePosition].setNumber(ArticleRepository.lastArticlePosition + 1);
			ArticleRepository.lastArticlePosition = ArticleRepository.lastArticlePosition + 1;
						
		}
				
	}
	
	void list(){
		
		System.out.println("글번호\t글제목\t글내용\t작성자\t조회수");
		for(int i=0; i<ArticleRepository.lastArticlePosition; i++){
			System.out.print(ArticleRepository.articles[i].getNumber() + "\t");
			System.out.print(ArticleRepository.articles[i].getTitle() + "\t");
			System.out.print(ArticleRepository.articles[i].getContent() + "\t");
			System.out.print(ArticleRepository.articles[i].getWriter() + "\t");
			System.out.println(ArticleRepository.articles[i].getReadCount());
		}
				
	}
	
	void read(){
	
		System.out.println("글 번호를 입력해 주세요");
		int selectedNumber = keyboard.nextInt();
		
		for(int i=0; i<ArticleRepository.lastArticlePosition; i++){
			
			if(selectedNumber == ArticleRepository.articles[i].getNumber()){
				System.out.println("글번호\t글제목\t글내용\t작성자\t조회수");
				System.out.print(ArticleRepository.articles[i].getNumber() + "\t");
				System.out.print(ArticleRepository.articles[i].getTitle() + "\t");
				System.out.print(ArticleRepository.articles[i].getContent() + "\t");
				System.out.print(ArticleRepository.articles[i].getWriter() + "\t");
				System.out.println(ArticleRepository.articles[i].getReadCount());
			}
			
		}
	}
	
	void update(){
	
		System.out.println("글 수정 모드");
		System.out.println("수정할 글번호를 선택해 주세요");
		int selectedNumber = keyboard.nextInt();
		
		for(int i=0; i<ArticleRepository.lastArticlePosition; i++){
			if(selectedNumber == ArticleRepository.articles[i].getNumber()){
				System.out.println("수정할 제목을 입력하세요");
				String modifyTitle = keyboard.next();
				ArticleRepository.articles[i].setContent(modifyTitle);
				
				System.out.println("수정할 작성자를 입력하세요");
				String modifyWriter = keyboard.next();
				ArticleRepository.articles[i].setWriter(modifyWriter);
				
				System.out.println("수정할 글내용을 입력하세요");
				String modifyContent = keyboard.next();
				ArticleRepository.articles[i].setContent(modifyContent);
			}
			
		}
		
	}
	
}
