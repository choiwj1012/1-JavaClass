package shoppingMall;

public class Users {
	
	private String id; // 유저의 아이디
	private String password; // 유저의 비밀번호
	private String name; // 유저의 이름
	private PayType payType; // 유저의 결제타입
	
	public Users(String id, String password, String name, PayType payType) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.payType = payType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PayType getPayType() {
		return payType;
	}

	public void setPayType(PayType payType) {
		this.payType = payType;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}	
	
	
}
