package java_20160805_homework;

public class MouseDriver_01 {
	/* 객체 : 세상에 존재하는 유일무이한(unique) 사물
	 * 클래스 : 분류, 집합, 같은 속성과 기능을 가진 객체를 총칭하는 개념
	 * 예) 사람 홍길동 = new 사람();
	 *     => 객체(object) = 클래스의 인스턴스(instance)
	 *     
	 * 추상 : 여러 가지 사물이나 개념에서 공통되는 특성이나 속성 따위를 추출하여 파악하는 작용 
	 * 추상화 : 구체적인 것을 분해해서 관심 영역에 대한 특성만을 가지고 재조립하는 것
	 * - 객체 지향의 추상화는 곧 모델링이다.
	 * - 클래스 설계에서 추상화가 사용된다.
	 * 
	 * 상위 클래스 쪽으로 갈수록 추상화, 일반화됐다고 말하며, 하위 클래스 쪽으로 갈수록 추체화, 특수화 됐다고 말한다.
	 * */
	
	public static void main(String[] args){
		
		Mouse mickey = new Mouse();
		
		mickey.name = "미키";
		mickey.age = 86;
		mickey.countOfTail_01 = 1;
		
		mickey.sing();
		
		mickey = null;
		
		Mouse jerry = new Mouse();
		
		jerry.name = "제리";
		jerry.age = 75;
		jerry.countOfTail_01 = 1;
		
		jerry.sing();	
	}
	
}
