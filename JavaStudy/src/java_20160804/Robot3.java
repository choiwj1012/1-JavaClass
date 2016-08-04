package java_20160804;

public class Robot3 {
	
		// constructor
		Robot3(){
			
		}
		
		Robot3(String serialNumber, String name){
			this.serialNumber = serialNumber;
			this.name = name;
		}
		
		// properties
		private String serialNumber;
		private String name;
		
		// serialNumber getter & setter	
		public String getSerialNumber() {
			return serialNumber;
		}
		
		// name getter & setter
		public String getName() {
			return name;
		}
		
		// method
		void walk(){
			System.out.println("제품번호 : " + this.getSerialNumber());
			System.out.println("이름 : " + this.getName());
			System.out.println("로봇이 걷습니다");
		}
		
		void run(){
			System.out.println("제품번호 : " + this.getSerialNumber());
			System.out.println("이름 : " + this.getName());
			System.out.println("로봇이 뜁니다");
		}
		
		void fly(){
			System.out.println("제품번호 : " + this.getSerialNumber());
			System.out.println("이름 : " + this.getName());
			System.out.println("로봇이 날고 있습니다");
		}
		
		void shootMissle(){
			System.out.println("제품번호 : " + this.getSerialNumber());
			System.out.println("이름 : " + this.getName());
			System.out.println("로봇이 미사일을 쏩니다");
		}
		
		void swingKnife(){
			System.out.println("제품번호 : " + this.getSerialNumber());
			System.out.println("이름 : " + this.getName());
			System.out.println("로봇이 검을 휘두릅니다");
		}
		
}
