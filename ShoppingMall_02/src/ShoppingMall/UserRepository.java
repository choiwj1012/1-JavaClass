package shoppingMall;

public class UserRepository {
	
	final static int MAX_USER_COUNT = 3; // 유저는 3명까지만 가입할 수 있다.
	static int currentUserCount = 0; // 가입유저수
	static int currentUserNumber = 0; // 현재 선택된 유저의 배열 번호
	static Users[] users = new Users[MAX_USER_COUNT];
	
}
