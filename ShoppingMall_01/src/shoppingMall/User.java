package shoppingMall;

// 사용자 정의를 위한 클래스
public class User {
	
	// variable
	private String id; // 사용자 id
	private String name; // 사용자 이름
	private String payType; // 결제 유형 
	
	// constructor
	User(){
		
	}
	
	// 생성자로 이름과 결제 정보를 받아 설정한다
	public User(String id, String name, String payType){
		this.id = id;	
		this.name = name;
		this.payType = payType;
	}

	// getter and setter
	public String getName() { // 사용자 이름 정보 리턴
		return name;
	}

	public void setName(String name) { // 사용자 이름 정보 설정
		this.name = name;
	}

	public String getPayType() { // 사용자 결제 정보 리턴
		return payType;
	}

	public void setPayType(String payType) { // 사용자 결제 정보 설정
		this.payType = payType;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
