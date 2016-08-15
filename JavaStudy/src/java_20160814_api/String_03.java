package java_20160814_api;

public class String_03 {
	
	public static void main(String[] args){
	
		int iVal = 100;
		String strVal = String.valueOf(iVal);
		
		double dVal = 200.0;
		String strVal2 = dVal + "";
		
		double sum = Integer.parseInt( "+" + strVal.trim()) + Double.parseDouble(strVal2.trim());
		double sum2 = Integer.valueOf(strVal.trim()) + Double.valueOf(strVal2.trim());
		
		System.out.println(sum);
		System.out.println(sum2);
		
	}
	
}
