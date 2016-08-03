  /* 기능 -> 1.글쓰기  2.특정글보기  3.글수정  4.글목록보기  5.종료
   * 
   * 세부기능
   * 
   * 1. 글쓰기 -> 1) 작성자  / 2) 글제목  / 3) 글내용
   * 2. 특정글보기 -> 글번호 선택 -> 제목, 내용, 작성자 출력
   * 3. 특정글수정 -> 글번호 선택 -> 제목, 내용, 작성자 선택 수정
   * 4. 글목록보기 -> 글번호 / 제목 / 작성자 / 조회수 (내용은 보이지 않음)
   * 5. 종료 -> 프로그램 종료
   */

package java_20160802;

import java.util.Scanner;

public class Homework_04_fixed {
	public static void main(String[] args) {

		final int MAX_LIST_COUNT = 30; //최대 글 갯수는 30개

		//1. 변수 선언(배열화)
		String[] titles = new String[MAX_LIST_COUNT];   //글제목		
		String[] names = new String[MAX_LIST_COUNT];    //작성자
		String[] contents = new String[MAX_LIST_COUNT]; //글내용
		int[] num = new int[MAX_LIST_COUNT]; 			//글번호
		int[] count = new int[MAX_LIST_COUNT]; 			//조회수
		int currentPosition = 0; 	// 현재 글갯수를 의미
		int selectedMenu = 4; 		// 초기에 글목록보기 기능을 먼저 보여주기 위해 4로 지정됨
		boolean exit = true;		// while문 탈출을 위한 변수 지정
		
		Scanner keyboard = new Scanner(System.in);
		
		//2. 메뉴 출력(무한루프, 원할때가 메뉴를 선택할 수 있어야 하기 때문에...)
		while(exit) {
			
			//3. 글 목록 출력
			if(selectedMenu==4){
				
				if(currentPosition == 0){ // 만약 등록된 글이 없다면
					
					System.out.println("글 번호\t글 제목\t작성자\t조회수");
					System.out.println("등록한 글이 없습니다.");
				
				}else if(currentPosition>0){ // 등록된 글이 1개 이상 존재한다면
					
					System.out.println("전체 글 목록입니다.");
					System.out.println("글 번호\t글 제목\t작성자\t조회수");
					
					for(int i = 0 ; i < currentPosition ; i++) { // 글 갯수만큼 글번호, 제목, 작성자, 조회수 출력
						System.out.println(num[i] + "\t" + titles[i] + "\t" + names[i] + "\t" + count[i]);
					}
				}
			}
			System.out.println("\n1. 글쓰기 || 2. 글 조회 || 3. 글 수정 || 4. 글 목록 || 5. 종료");
			selectedMenu = keyboard.nextInt();
			
			//메뉴 선택에 따른 서로 다른 기능(작성, 조회, 수정, 전체 조회, 종료) 수행
			if(selectedMenu == 1) {
				
				System.out.println("글 번호 "+(currentPosition+1)+"의 글을 작성합니다.");
				
				System.out.print("작성자 : ");
				keyboard.nextLine();
				String currentName = keyboard.nextLine();

				System.out.print("글 제목 : ");
				String currentTitle=keyboard.nextLine();
				
				System.out.print("글 내용 : ");
				String currentContent=keyboard.nextLine();
				

				names[currentPosition] = currentName;       // 위에서 입력받은 작성자 데이터 입력
				titles[currentPosition] = currentTitle;     // 위에서 입력받은 글제목 데이터 입력
				contents[currentPosition] = currentContent; // 위에서 입력받은 글내용 데이터 입력
				num[currentPosition] = currentPosition+1;   // 글번호 1 추가
				count[currentPosition] = 0;                 // 조회수는 0

				currentPosition = currentPosition + 1;      
				
			} else if(selectedMenu == 2) {
				
				//조회하고자 하는 글 번호 입력
				System.out.println("조회하고자 하는 글 번호를 입력하세요.");
				int chNum=keyboard.nextInt();
				
				//입력한 글 번호가 존재하는지를 찾아라.
				if(chNum>0 && chNum<=currentPosition) {
						
					++count[chNum-1]; //조회수 ++
					System.out.println("글 번호\t글 제목\t작성자\t글내용\t조회수"); 
					
					//찾으면 해당 글 번호의 조회할 정보(글 제목, 글 내용, 작성자)					
					System.out.println(num[chNum-1] + "\t" + titles[chNum-1] + "\t" + names[chNum-1] + "\t" + contents[chNum-1] + "\t" + count[chNum-1]);
					
				} else {
					//글 번호가 존재하지 않을 때 경고 메세지 출력
					System.out.println("글 번호"+chNum+"은 존재하지 않습니다. 메뉴화면으로 돌아갑니다.");
				}	
				
			} else if(selectedMenu == 3) {
				
				System.out.println("수정하고자 하는 글 번호를 입력하세요.");
				int chNum=keyboard.nextInt(); // 수정대상 글 번호 입력 받음
				
				//입력한 글 번호가 존재하는지를 찾음
				if(chNum>0 && chNum<=currentPosition) {
					
					//찾으면 해당 글 번호의 수정할 정보(글 제목, 글 내용, 작성자)
					while(true) {
						
						System.out.println("수정할 정보를 선택하세요. (1)글제목 (2)글 내용 (3)작성자 (4)나가기");
						String chgMenu=keyboard.next();
						
						if(chgMenu.equals("1")) {
							
							System.out.println("수정할 글 제목을 입력하세요.");
							keyboard.nextLine();
							titles[chNum-1]=keyboard.nextLine();
							
						} else if(chgMenu.equals("2")) {
							
							System.out.println("수정할 글 내용을 입력하세요.");
							keyboard.nextLine();
							contents[chNum-1]=keyboard.nextLine();
							
						} else if(chgMenu.equals("3")) {
							
							System.out.println("수정할 작성자를 입력하세요.");
							keyboard.nextLine();
							names[chNum-1]=keyboard.nextLine();
							
						} else if(chgMenu.equals("4")) {
							
							break; // 나가기
							
						} else {
							
							System.out.println("1~4를 선택해야합니다. 다시 입력해주세요.");
							
						}
					}
					
					// 위의 글 수정 while문이 종료된 후 실행
					while(true){
						
						System.out.println("(1)글 목록 보기 (2)프로그램 종료");
						String menu=keyboard.next();
						
						if(menu.equals("1")){ //글 목록 출력
							selectedMenu=4; 
							break;
						}else if(menu.equals("2")){ //프로그램 종료
							exit=false; 
							break;
						}
						
						System.out.println("1~2를 선택해야합니다. 다시 입력해주세요."); //다른 키를 입력했을 때 경고 메세지 출력	
					} // while문 종료
					
				} else {
					System.out.println("글 번호"+chNum+"은 존재하지 않습니다. 메뉴화면으로 돌아갑니다.");
				} // if문 종료

			} else if(selectedMenu == 4) {
				
				// selectedMenu = 4; 필요없음
				
			} else if(selectedMenu == 5) {
				
				break;
				
			} else {
				
				System.out.println("메뉴는 1~5를 선택해야 합니다.");
				System.out.println("메뉴를 다시 선택해 주세요.");
				
			}	
		} // end while
		
		keyboard.close();
		System.out.println("프로그램 종료");
		
	}
}
