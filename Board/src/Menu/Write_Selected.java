package Menu;

import java.util.Scanner;

public class Write_Selected extends Write {

	Scanner keyboard = new Scanner(System.in);

	@Override
	public void write(){ 

		boolean exit = false;
		while(!exit) {

			System.out.println("1. 수정 || 2. 취소");
			int selectedMenu = keyboard.nextInt();

			if(selectedMenu == 1) {
				System.out.println("수정할 글번호를 입력하세요.");
				int updateArticleNumber = keyboard.nextInt();
				
				//검색
				boolean isFind = false;
				for(int i = 0 ; i < Article.totalArticleNumber ; i++) {
					if(updateArticleNumber == Article.articleNumber[i]) {						
						isFind = true;
						break;
					}
				}
				
				if(isFind) {
					boolean innerWhileExit = false;
					while(!innerWhileExit) {
						System.out.println("어떤것을 수정하시겠습니까?");
						System.out.println("1. 제목 || 2. 작성자 || 3. 글내용 || 4. 취소");
						int selectedModifyMenu = keyboard.nextInt();
						
						if(selectedModifyMenu == 1){
							Modify.modifyTitle(updateArticleNumber);
						}else if(selectedModifyMenu == 2){
							Modify.modifyWriter(updateArticleNumber);
						}else if(selectedModifyMenu == 3){
							Modify.modifyContent(updateArticleNumber);
						}else if(selectedModifyMenu == 4){
							System.out.println("수정을 취소하였습니다");
							innerWhileExit = true;
						}else{
							System.out.println("잘못입력하셨습니다");
						}
					}
				}
				
			} else if(selectedMenu == 2) {
				exit = true;
			} else {
				System.out.println("메뉴를 다시 선택하세요.");
			}
			
		}
	}
}
