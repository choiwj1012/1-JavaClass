package java_20160807_OOP;

class Document{
		
	// class variable
	static int count = 0; // 문서 갯수
	
	// instance variable
	String name; // 문서명
		
	// constructor
	Document(){
		this("제목 없음" + (++count)); // 제목이 없는경우 제목 없음과 count 숫자를 1씩 증가후 출력
	}
	
	Document(String name){
		this.name = name; // parameter로 받은 name을 instance 변수 name에 저장
		System.out.println("문서 " + this.name + " 가 생성되었습니다."); // 저장한 name을 출력
	}
	
}

public class DocumentTest {
	
	public static void main(String[] args){
		Document d1 = new Document();
		Document d2 = new Document("자바.txt");
		Document d3 = new Document();
		Document d4 = new Document();
	}
	
}
