package java_20160802;

import java.util.Scanner;

public class Homework_04 {
	public static void main(String[] args){
		
		/* 기능 -> 1.글쓰기  2.특정글보기  3.글수정  4.글목록보기  5.종료
	       * 
	       * 세부기능
	       * 글 목록 먼저 보여야 함
	         1. 글쓰기 -> 1) 제목  / 2) 내용  / 3) 작성자
	         2. 특정글보기 -> 글번호 선택 -> 제목, 내용, 작성자 출력
	         3. 특정글수정 -> 글번호 선택 -> 제목, 내용, 작성자 수정
	         4. 글목록보기 -> 글번호 / 제목 / 작성자 / 조회수
	         5. 종료 -> 프로그램 종료
		   */
		
		// 1. 변수 선언(배열화)
			
		  final int MAX_LIST_COUNT = 30;
	      String[] titles = new String[MAX_LIST_COUNT]; //글제목      
	      String[] names = new String[MAX_LIST_COUNT]; //작성자
	      String[] contents = new String[MAX_LIST_COUNT]; //글내용
	      int[] num = new int[MAX_LIST_COUNT]; //글 번호
	      int[] count = new int[MAX_LIST_COUNT]; //조회수
	      int currentPosition = 0;
		
	      Scanner keyboard = new Scanner(System.in);
	      
	    // 2. 게시판 시작. 글 목록 보이기
	      System.out.println("글번호\t제목\t작성자\t조회수");
	      System.out.println("--------------------------");
	      System.out.println("게시판이 비어있습니다 글을 작성해주세요");
	      System.out.println("");
	      
	    // 3. 선택 메뉴 출력 
	    // -> 1.글쓰기 2.특정글보기 3.특정글수정 4.글목록보기 5.종료
	      while(true){
	    	  
	    	  int selectedMenu = 0; // 메뉴 선택 숫자
	    	  
	    	  // 선택 메뉴 출력
	    	  System.out.println("원하는 기능을 선택해 주세요");
	    	  System.out.println("1. 글쓰기");
	    	  System.out.println("2. 특정글보기");
	    	  System.out.println("3. 특정글수정");
	    	  System.out.println("4. 글목록보기");
	    	  System.out.println("5. 종료");
	    	  System.out.print(">>>");
	    	  selectedMenu = keyboard.nextInt(); // 사용자 기능 선택
	    	  
	    	  
	    	  if(selectedMenu == 1){ // 글쓰기 기능 활성화
	    		 
	    		 // 글쓰기 -> 제목  / 내용  / 작성자 순으로 작성
		         System.out.println("글 제목을 입력하세요");
		         keyboard.nextLine();
		         titles[currentPosition] = keyboard.nextLine();
		         
		         System.out.println("글 내용을 입력하세요");
		         contents[currentPosition] = keyboard.nextLine(); 
		         
		         System.out.println("작성자 이름을 입력하세요");
		         names[currentPosition] = keyboard.next();
	    		  
	    		 currentPosition++;
	    		 
	    	  }else if(selectedMenu == 2){ // 특정글보기 기능 활성화
		         
	    		  // 특정글보기 -> 글번호 선택 -> 제목, 내용, 작성자 출력
	    		  System.out.println("보시고 싶은 글번호를 입력해 주세요 >");
	    		  int writingNumber = keyboard.nextInt(); 
	    		
	    		  System.out.println("글번호 : " + (writingNumber));
	    		  System.out.println("글제목 : " + (titles[writingNumber-1]));
			   	  System.out.println("글내용 : " + (contents[writingNumber-1]));
			   	  System.out.println("글작성자 : " + (names[writingNumber-1]));
			   	  
			   	  count[writingNumber] = count[writingNumber] + 1;
	    					  
	    	  }else if(selectedMenu == 3){ // 특정글수정 기능 활성화
		         
	    		  // 특정글수정 -> 글번호 선택 -> 제목, 내용, 작성자 수정
	    		  
	    		  // 원하는 글번호를 선택
	    		  System.out.println("수정하고 싶은 글번호를 입력해 주세요 > ");
	    		  int writingNumber = keyboard.nextInt();
	    		     		  
	    		  // 선택된 글번호를 찾아서 수정
	    		  boolean flag = true; // 수정을 정지하기 위한 변수
	    		  while(flag){
	    			  
	    			  // 제목, 내용, 작성자를 골라서 수정
		    		  System.out.println("수정할 내용을 골라주세요");
		    		  System.out.println("1.제목수정  2.내용수정  3.작성자수정 4.그만수정하기");
		    		  int selectedMenu_2 = keyboard.nextInt();
		    		  
					  switch(selectedMenu_2){
						
						case 1 : // 제목 수정을 선택한 경우
							System.out.println("원하는 제목을 입력하세요");
							String newTitle = keyboard.next();
							titles[writingNumber] = newTitle;
							break;
						
						case 2 : // 내용 수정을 선택한 경우
							System.out.println("원하는 내용을 입력하세요");
							keyboard.nextLine();
							String newContent = keyboard.nextLine();
							contents[writingNumber] = newContent;
							break;
						
						case 3 : // 작성자 수정을 선택한 경우
							System.out.println("원하는 작성자를 입력하세요");
							String newName = keyboard.next();
							names[writingNumber] = newName;
							break;
						
						case 4 : // 그만수정하기를 선택한 경우
							System.out.println("수정을 중지합니다");
							flag = false;
							break;
						
						default :
							System.out.println("번호가 맞지 않습니다.");
					} // switch end  
				 } //while end
	    		  
	    	  }else if(selectedMenu == 4){ // 글목록보기 기능 활성화
		         
	    		  // 글목록보기 -> 글번호 / 제목 / 작성자 / 조회수
	    		 System.out.println("글번호\t제목\t작성자\t조회수");
	    		 for(int i=0; i<currentPosition; i++){
	    			 System.out.println((i+1)+"\t"+titles[i]+"\t"+names[i]+"\t"+count[i]);	 
	    		 }
	    		  	  
	    	  }else if(selectedMenu == 5){ // 프로그램 종료
	    		  System.out.println("프로그램을 종료합니다");
	    		  break;
	    	  }else{
	    		  System.out.println("번호를 다시 입력해주세요");
	    	  }
	    	 
	      }
	      keyboard.close();
	}
}
