package Menu;

public class Print {
	
	void printViewMenu(){
		
		// 리스트 타이틀 배열처리 및 출력
		String[] artListViewMenu = {"번호", "제목", "내용", "작성자", "조회수"}; 
		for(int i=0; i<artListViewMenu.length; i++){
			System.out.print(artListViewMenu[i] + "\t");
		}
		
		System.out.println();
		
	}
	
	static void printList(int selectedArticle){
		
		Print print = new Print();
		print.printViewMenu();
		
		// 선택된 글번호에 해당하는 각 항목을 출력
		System.out.print(Article.articleNumber[selectedArticle] + "\t");
		System.out.print(Article.articleTitles[selectedArticle] + "\t");
		System.out.print(Article.articleContents[selectedArticle] + "\t");
		System.out.print(Article.articleWriters[selectedArticle] + "\t");
		System.out.print(Article.articleReadCount[selectedArticle]);
		
		System.out.println();
	}
	
	static void PrintAll(){
		
		Print print = new Print();
		print.printViewMenu();
		
		// 전체 글 목록 표시
		for(int i=0; i<Article.totalArticleNumber; i++){
			System.out.print(Article.articleNumber[i] + "\t");
			System.out.print(Article.articleTitles[i] + "\t");
			System.out.print(Article.articleContents[i] + "\t");
			System.out.print(Article.articleWriters[i] + "\t");
			System.out.print(Article.articleReadCount[i]);
			System.out.println();
		}
		
	}
	
}
