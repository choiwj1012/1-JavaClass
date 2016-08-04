package java_20160804;

public class Robot4 {

	// properties variable
	private String sn;
	private String name;

	// getter and setter
	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// constructor
	Robot4(){

	}

	public Robot4(String sn, String name) {
		super();
		this.sn = sn;
		this.name = name;
	}
}
