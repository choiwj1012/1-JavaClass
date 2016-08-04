package java_20160804_Robot;

public class Robot5 {
	
	// properties
	// declare private member
	private String sn;
	private String name;
	
	// 캡슐화된 성질인 sn, name을 클래스 외부에서 접근 가능하도록
	// getter and setter 선언
	
	public String getSn() {
		return sn;
	} // getSn
	
	/*public void setSn(String sn) {
		// this.sn은 Robot4 클래스의 properties인 sn을 의미한다.
		// 이렇게 매개인자(로컬변수) 이름과 성질 변수명이 동일할 경우 this로 구분하여 준다.
		this.sn = sn;
	} // setSn
    */	
	
	public String getName() {
		return name; // return this.name과 동일하다
	} // getName
	
	/*public void setName(String name) {
		this.name = name;
	} // setName
	*/	
	
	// constructor
	Robot5(){}
	
	Robot5(String getSn, String getName){
		this.sn = getSn;
		this.name = getName;
	}
	
}
