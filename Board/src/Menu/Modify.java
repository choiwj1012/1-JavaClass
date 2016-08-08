package Menu;

import java.util.Scanner;

public class Modify {

	public static void modifyTitle(int selectedArticle){
		
		Scanner keyboard = new Scanner(System.in);
		// 제목 입력
		System.out.print("제목을 입력해 주세요 >");
		String modifyTitle = keyboard.next();
		Article.articleTitles[selectedArticle] = modifyTitle;
		
	} // modifyTitle() end
	
	public static void modifyWriter(int selectedArticle){
		
		Scanner keyboard = new Scanner(System.in);
		// 작성자 입력
		System.out.print("작성자를 입력해 주세요 >");
		String modifyWriter = keyboard.next();
		Article.articleWriters[selectedArticle] = modifyWriter;
		
	} // modifyWriter() end
	
	public static void modifyContent(int selectedArticle){
		
		Scanner keyboard = new Scanner(System.in);
		// 내용 입력
		System.out.print("내용을 입력해 주세요 >");
		String modifyContent = keyboard.next();
		Article.articleContents[selectedArticle] = modifyContent;
		
	} // modifyContent() end
	
}
