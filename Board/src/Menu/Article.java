package Menu;

public class Article{
	
	// variable
	Read_Interface read;
	Write_Interface write;
	
	static final int MAX_LIST_COUNT = 30; //최대 글 갯수는 30개
	static String[] articleTitles = new String[MAX_LIST_COUNT];   //글제목		
	static String[] articleWriters = new String[MAX_LIST_COUNT];  //작성자
	static String[] articleContents = new String[MAX_LIST_COUNT]; //글내용
	static int[] articleNumber = new int[MAX_LIST_COUNT]; 		  //글번호
	static int[] articleReadCount = new int[MAX_LIST_COUNT]; 	  //조회수
	static int totalArticleNumber = 0; 	// 글의 총 갯수
	
	// setter
	public void setRead(Read_Interface read){
		this.read = read;
	}
	
	public void setWrite(Write_Interface write){
		this.write = write;
	}
	
	// method
	public void read(){
		this.read.read();
	}
	
	public void write(){
		this.write.write();
	}
	
}
