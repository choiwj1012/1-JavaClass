package java_20160814_api;

class Person{
	
	long id;
	
	public boolean equals(Object obj){
		if(obj != null && obj instanceof Person){
			
			return id == ((Person)obj).id;
			
		} else {
			
			return false;
			
		}
	}
	
	Person(long id) {
		this.id = id;
	}
	
}

public class Equals_02 {

	public static void main(String[] args) {
		
		Person p1 = new Person(801108L);
		Person p2 = new Person(801108L);
		
		if(p1 == p2) {
			System.out.println("p1과 p2는 같은 사람입니다");
		} else {
			System.out.println("p1과 p2는 다른 사람입니다.");
		}
		
		if(p1.equals(p2)) {
			System.out.println("p1과 p2는 같은 사람입니다");
		} else {
			System.out.println("p1과 p2는 다른 사람입니다");
		}
		
	}
	
}
