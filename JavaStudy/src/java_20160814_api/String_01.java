package java_20160814_api;

import java.util.StringJoiner;

public class String_01 {

	public static void main(String[] args){
		
		String animals = "dog,cat,bear";
		String[] arr = animals.split(",");
		System.out.println(arr[0]);
		
		System.out.println(String.join("-",arr));
		
		StringJoiner sj = new StringJoiner("a", "[" , "]");
				
		System.out.println(sj);		
		for(String s : arr){
			sj.add(s);
		}
		System.out.println(sj.toString());
 		
	}
	
}
