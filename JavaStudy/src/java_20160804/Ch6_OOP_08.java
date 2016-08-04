package java_20160804;

public class Ch6_OOP_08 {
	public static void main(String[] args){
		Data d = new Data(); // 클래스 객체를 생성
		d.x = 10; // 생성한 인스턴스의 변수 x에 10을 저장
		
		Data d2 = copy(d); // 리턴타입이 객체이므로 객체타입의 변수를 선언해야 함
		System.out.println("d.x = " + d.x);
		System.out.println("d2.x = " + d2.x);
	}
	
	static Data copy(Data d){  // 메서드 반환 타입을 객체타입으로 해도 됨
		Data tmp = new Data();
		tmp.x = d.x;
		
		return tmp;
	}
}

class Data{

	int x;
	
}