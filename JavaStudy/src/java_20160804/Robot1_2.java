/*
 * 요구사항 
 * 성질(속성 = 프로퍼티 = 멤버변수 = 변수의 대상) : 제품번호, 로봇이름
 * 행위(멤버 메서드 = 메서드의 대상) : 걷다, 뛰다, 날다, 미사일을 쏘다, 검을 휘두른다.
 * */
package java_20160804;

public class Robot1_2 {
	
	// constructor
	Robot1_2(){
		
	}
	
	// properties
	private String serialNumber;
	private String name;
	
	// serialNumber getter & setter
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public String getSerialNumber() {
		return serialNumber;
	}
	
	// name getter & setter
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	// method
	void walk(){
		System.out.println("제품번호 : " + this.getSerialNumber());
		System.out.println("이름 : " + this.getName());
		System.out.println("로봇이 걷습니다");
	}
	
	void walk(String serialNumber, String name){
		System.out.println("시리얼넘버가 " + serialNumber + "인 " + name + "로봇이 걷습니다");
	}
	
	void run(){
		System.out.println("제품번호 : " + this.getSerialNumber());
		System.out.println("이름 : " + this.getName());
		System.out.println("로봇이 뜁니다");
	}
	
	void run(String serialNumber, String name){
		System.out.println("시리얼넘버가 " + serialNumber + "인 " + name + "로봇이 뜁니다");
	}
	
	void fly(){
		System.out.println("제품번호 : " + this.getSerialNumber());
		System.out.println("이름 : " + this.getName());
		System.out.println("로봇이 날고 있습니다");
	}
	
	void fly(String serialNumber, String name){
		System.out.println("시리얼넘버가 " + serialNumber + "인 " + name + "로봇이 날고 있습니다");
	}
	
	void shootMissle(){
		System.out.println("제품번호 : " + this.getSerialNumber());
		System.out.println("이름 : " + this.getName());
		System.out.println("로봇이 미사일을 쏩니다");
	}
	
	void shootMissle(String serialNumber, String name){
		System.out.println("시리얼넘버가 " + serialNumber + "인 " + name + "로봇이 미사일을 쏩니다");	
	}
	
	void swingKnife(){
		System.out.println("제품번호 : " + this.getSerialNumber());
		System.out.println("이름 : " + this.getName());
		System.out.println("로봇이 검을 휘두릅니다");
	}
	
	void swingKnife(String serialNumber, String name){
		System.out.println("시리얼넘버가 " + serialNumber + "인 " + name + "로봇이 검을 휘두릅니다");
	}
	
}
