package java_20160814_api;

public class String_02 {
	public static void main(String[] args){
		
		int iVal = 100;
		String strVal = String.valueOf(iVal);
		
		double dVal = 200.0;
		String strVal2 = dVal + "";
		
		double sum = Integer.parseInt("+" + strVal + Double.parseDouble(strVal2));
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);
	}
}
