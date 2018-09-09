package reverseplaindrome;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(reverseString("Yahoo"));
		
		System.out.println(Ispalindrome("KAYAK12"));
		
		System.out.println(isAnagram("isAnagram","isnagrama"));

	}
	
	public static StringBuilder reverseString(String text) {
		
		StringBuilder sb= new StringBuilder();
		char[] array= text.toCharArray();
		
		for (int i = array.length-1; i >= 0 ;i-- ) {
			sb.append(array[i]);
		}
		
		return sb;
		
	}

	public static boolean Ispalindrome(String text) {
		if(text.length()==0)
			return false;
		//text= text.replace(" ", "");
		
		int n= text.length();
		for(int i=0 ; i<n/2;i++) {
			if(text.charAt(i)!=text.charAt(n - i - 1)) {
				return false;
			}
		}
		return true;
		
	}
	
	public static boolean isAnagram(String text1, String text2) {
		
		if(text1.length()==0|| text2.length()==0)
			return false;
		
		if(text1.length()!=text2.length())
			return false;
		
		char[] array1= text1.toCharArray();
		char[] array2=text2.toCharArray();
		
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		if(array1.equals(array2))
			return true;	
		return true ;
	}
	
	
	
}
