package java_20160804_Robot;

public class Robot6 {
	
	
	// properties
	private String sn;
	private String name;
	
	
	// getter and setter 선언
	public String getSn() {
		
		return sn;
	
	} // getSn
	
	public String getName() {
	
		return name;
	
	} // getName

	public void setName(String name){
		this.name = name;
	}
	
	
	// method
	public void actionWalk(){
		
		System.out.println("걷다");
	
	} // actionWalk() end
	
	public void actionRun(){
	
		System.out.println("뛰다");
	
	} // actionRun() end
	
	public void actionMissile(){
	
		System.out.println("미사일 발사");
	
	} // actionMissle() end
	
	public void actionKnife(){
	
		System.out.println("검을 휘두르다");
	
	} // actionKnife() end
	
	
	// constructor
	Robot6(){
		
	}
	
	Robot6(String getSn){
		
		this.sn = getSn;
	
	}
	
	Robot6(String getSn, String getName){
	
		this.sn = getSn;
		this.name = getName;
	
	}
	
}
