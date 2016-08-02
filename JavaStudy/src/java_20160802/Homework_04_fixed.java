package java_20160802;

import java.util.Scanner;

public class Homework_04_fixed {
	public static void main(String[] args) {

		final int MAX_LIST_COUNT = 30; //최대 글 갯수

		//1. 변수 선언(배열화)
		String[] titles = new String[MAX_LIST_COUNT]; //글제목		
		String[] names = new String[MAX_LIST_COUNT]; //작성자
		String[] contents = new String[MAX_LIST_COUNT]; //글내용
		int[] num = new int[MAX_LIST_COUNT]; //글 번호
		int[] count = new int[MAX_LIST_COUNT]; //조회수
		int currentPosition=0;
		int selectedMenu=4;
		boolean quit=true;
		
		Scanner keyboard = new Scanner(System.in);
		//2. 메뉴 출력(무한루프, 원할때가 메뉴를 선택할 수 있어야 하기 때문에...)
		while(quit) {
			//3. 글 목록 출력
			if(selectedMenu==4) {
				if(currentPosition == 0) {
					System.out.println("등록한 글이 없습니다.");
				} else if(currentPosition>0){
					System.out.println("전체 조회 수행함.");
					System.out.println("글 번호\t글 제목\t작성자\t조회수");
					for(int i = 0 ; i < currentPosition ; i++) {
						System.out.println(num[i] + "\t" + titles[i] + "\t" + names[i] + "\t" + count[i]);
					}
				}
			}
			System.out.println("\n1. 글쓰기, 2. 글 조회, 3. 글 수정, 4. 글 목록, 5. 종료");

			//메뉴 선택에 따른 서로 다른 기능(작성, 조회, 수정, 전체 조회, 종료) 수행
			selectedMenu = keyboard.nextInt();
			if(selectedMenu == 1) {
				System.out.println("글 번호"+(currentPosition+1)+ "의 글을 작성합니다.");
				System.out.printf("작성자: ");
				String currentName = keyboard.next();

				System.out.printf("글 제목: ");
				String currentTitle=keyboard.next();
				System.out.printf("글 내용: ");
				String currentContent=keyboard.next();

				names[currentPosition] = currentName;
				titles[currentPosition] = currentTitle;
				contents[currentPosition] = currentContent;
				num[currentPosition] = currentPosition+1;
				count[currentPosition] = 0;

				currentPosition = currentPosition + 1;
			} else if(selectedMenu == 2) {
				//조회하고자 하는 글 번호 입력
				System.out.println("조회하고자 하는 글 번호를 입력하세요.");
				int chNum=keyboard.nextInt();
				//입력한 글 번호가 존재하는지를 찾아라.
					if(chNum>0 && chNum<=currentPosition) {
						//찾으면 해당 글 번호의 조회할 정보(글 제목, 글 내용, 작성자)
						++count[chNum-1];
						System.out.println("글 번호\t글 제목\t작성자\t조회수");
						System.out.println(num[chNum-1] + "\t" + titles[chNum-1] + "\t" + names[chNum-1] + "\t" + count[chNum-1]);
						//목록을 조회할 것인지 프로그램을 종료할 것인지 선택
					} else { //글 번호가 존재하지 않을 때 경고 메세지 출력
						System.out.println("글 번호"+chNum+"은 존재하지 않는 글 입니다.");
					}	
			} else if(selectedMenu == 3) {
				System.out.println("수정 수행함.");
				//수정하고자 하는 글 번호 입력
				System.out.println("수정하고자 하는 글 번호를 입력하세요.");
				int chNum=keyboard.nextInt();
				//입력한 글 번호가 존재하는지를 찾아라.
				if(chNum>0 && chNum<=currentPosition) {
					System.out.println("글 번호"+chNum+"은 존재하는 글입니다.");
					//찾으면 해당 글 번호의 수정할 정보(글 제목, 글 내용, 작성자)
					while(true) {
						System.out.println("수정할 정보를 입력하세요. (1)글제목, (2)글 내용, (3)작성자, (4)수정안하기");
						String chgMenu=keyboard.next();
						if(chgMenu.equals("1")) {
							System.out.println("수정할 글 제목을 입력하세요.");
							titles[chNum-1]=keyboard.next();
						} else if(chgMenu.equals("2")) {
							System.out.println("수정할 글 내용을 입력하세요.");
							contents[chNum-1]=keyboard.next();
						} else if(chgMenu.equals("3")) {
							System.out.println("수정할 작성자를 입력하세요.");
							names[chNum-1]=keyboard.next();
						} else if(chgMenu.equals("4")) {
							break;
						} else {
							System.out.println("수정은 1~3을 선택해야합니다. 다시 입력해주세요.");
						}
					}
					while(true) {
						System.out.println("(1)글 목록 보기, (2)프로그램 종료");
						String menu=keyboard.next();
						if(menu.equals("1")) { //글 목록 출력
							selectedMenu=4;
							break;
						} else if(menu.equals("2")) { //프로그램 종료
							quit=false; break;
						}
						System.out.println("1~2를 선택해야합니다. 다시 입력해주세요."); //다른 키를 입력했을 때 경고 메세지 출력
					}
				} else {
						System.out.println("글 번호"+chNum+"은 존재하지 않는 글 입니다. 메뉴화면으로 돌아갑니다.");
					}	

			} else if(selectedMenu == 4) {
				selectedMenu=4;
			} else if(selectedMenu == 5) {
				System.out.println("종료");
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
