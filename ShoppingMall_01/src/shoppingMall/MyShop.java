package shoppingMall;

import java.util.ArrayList;
import java.util.Scanner;

// 쇼핑몰의 메인 클래스로, IShop 인터페이스를 구현하는 여러 쇼핑몰 클래스가 있다.
public class MyShop{

	Scanner keyboard = new Scanner(System.in);
	
	// 상품을 추가할 수 있는 장바구니
	ArrayList<Product> cart = new ArrayList<Product>();
	
	// 선택한 사용자의 index 보관
	int selectUser;
	
	// 쇼핑몰 이름
	String shopTitle;
	
	// constructor
	MyShop(){
		
	}
	
	// method
	// 쇼핑몰 제목(이름)을 설정한다.
	public void setTitle(String shopTitle) {
		
		this.shopTitle = shopTitle;
		
	}

	// 쇼핑몰을 이용할 수 있는 예제 사용자들을 생성한다.
	public void genUser() {
		
		System.out.println("회원가입을 시작합니다");
		System.out.println("아이디를 입력해 주십시오 > ");
		String id = keyboard.next();
		
		System.out.println("이름을 입력해 주십시오 > ");
		String name = keyboard.next();
		
		String payType = "";
		boolean exit = false;
		
		while(!exit){
			
			System.out.println("결제 유형을 입력해 주십시오 (CARD 혹은 CASH) > ");
			payType = keyboard.next();
			
			if( !(payType.equals("CARD") || payType.equals("CASH")) ){
				
				System.out.println("다시 입력해 주십시오.");
				
			}else{
				
				exit = true;
				
			}	

		}
		
		UserRepository.users[UserRepository.usersNumber] = new User(id, name, payType);
		UserRepository.usersNumber = UserRepository.usersNumber + 1;
		
	}
	
	public void login(){
		
		boolean exit = false;
		while(!exit){
			System.out.println("로그인 화면입니다");
			System.out.println("아이디를 입력해 주십시오");
			String id = keyboard.next();
			
			for(int i=0; i<UserRepository.usersNumber; i++){
				
				if(id.equals(UserRepository.users[i].getId())){
					System.out.println("이름을 입력해 주십시오");
					String name = keyboard.next();
					
					if(name.equals(UserRepository.users[i].getName())){
						System.out.println("로그인 되었습니다.");
						productList();
						exit = true;
					}else{
						System.out.println("이름이 존재하지 않습니다.");
						break;
					}
					
				}else{
					System.out.println("아이디가 존재하지 않습니다");
					break;
				}	
				
			}
		}
		
	}

	// 쇼핑몰의 예제 상품을 생성한다.
	public void genProduct() {
		
		// Q 000에 , 붙이는 법?
		
		CellPhone cp = new CellPhone("갤럭시 노트5", 1000000, "SKT");
		Product.products[0] = cp;
		Product.productCount = Product.productCount + 1;
		
		cp = new CellPhone("애플 아이폰7", 980000, "KT");
		Product.products[1] = cp;
		Product.productCount = Product.productCount + 1;
		
		SmartTV st = new SmartTV("삼성 3D Smart TV", 5000000, "4K");
		Product.products[2] = st;
		Product.productCount = Product.productCount + 1;
		
		st = new SmartTV("LG Smart TV", 2500000, "Full HD");
		Product.products[3] = st;
		Product.productCount = Product.productCount + 1;
		
	}

	// 쇼핑몰 프로그램을 시작하는 메인 시작 메서드
	public void start() {
		
		boolean exit = false;
		while(!exit){
			
			this.setTitle("SAMSUNG");
			System.out.println(shopTitle + " 쇼핑몰에 오신것을 환영합니다");
			System.out.println("===========================");
			System.out.println("회원인 경우에만 이용할 수 있습니다. 원하시는 목록을 선택해주세요");
			System.out.println("1. 회원가입하기 || 2. 로그인하기 || 3. 종료하기");
			int selectedNum = keyboard.nextInt();
			
			if(selectedNum == 1){
				// 회원가입
				genUser();
			}else if(selectedNum == 2){
				// 로그인하기
				login();	
			}else if(selectedNum == 3){
				// 종료하기
				System.exit(0);
				break;
			}else{
				// 재입력받기
				System.out.println("다시 입력해 주세요");
			}
			
		}
		
	}
	
	// 상품 목록을 보여 주고 장바구니에 담을 수 있도록 하는 메서드이다.
	void productList(){
		System.out.println(shopTitle + " : 상품 목록 - 상품 선택");
		System.out.println("==========================");
		
		// 등록한 상품 정보 출력
		for(int i=0; i<Product.productCount; i++){
			System.out.print("[" + i + "]");
			Product.products[i].printDetail();
		}
		System.out.println("상품 번호를 선택하시면 장바구니에 상품이 이동합니다.");
		System.out.println("메인화면으로 돌아가려면 [m]을, 결제하시려면 [c]를 입력하세요");
		System.out.print("선택 : ");
		String selectedChar = keyboard.next();
		System.out.println("## " + selectedChar + "를 선택하셨습니다 ##");
		System.out.println();
		
		// 선택한 메뉴에 따라 처리 
		// Q 다른 문자 눌렀을때 문제 
		if(selectedChar.equals("m")){
			start();
		}else if(selectedChar.equals("c")){
			checkOut();
		}else{
			int productNumber = Integer.parseInt(selectedChar);
			cart.add(Product.products[productNumber]);
			productList();
		}
		
	}
	
	// 결제 진행을 위한 메서드로, 장바구니에 선택된 상품과 결제 금액, 결제 수단을 보여 주고 처리하는 메서드
	public void checkOut(){
		System.out.println(shopTitle + " : 체크아웃");
		System.out.println("=============================");
		int total = 0;
		int i = 0;
		
		// 장바구니에 등록된 상품 정보 출력
		for(Product p : cart){
			System.out.printf("[%d]%s(%s)\n", i++, p.pName, p.price);
			total = total + p.price;
		}
		
		System.out.println("=============================");
		
		// 합계 출력
		System.out.println("합계 : " + total + "원 입니다.");
		
		// 선택한 사용자의 결제 방법 출력
		// Q. 입력된 결제방식은 어떻게?
	    // System.out.println("결제 방법 : " + User.users[selectUser].getPayType());
		System.out.println("등록된 결제 방법은 " + UserRepository.users[0].getPayType() + "입니다");
		
		System.out.println("결제하시려면 [q]를, 이전으로 가시려면 [p]를 입력하십시오");
		System.out.print("선택 : ");
		String selectedChar = keyboard.next();
		
		// 선택한 메뉴에 따라 처리
		switch(selectedChar){
			
			case "q" :
				System.out.println("## 결제가 완료 되었습니다. 감사합니다 ! ##");
				System.exit(0);
				break;
				
			case "p" :
				productList();
				break;
			
			default : 
				checkOut();
				
		}
	}
	
}
