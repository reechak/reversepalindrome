package reverseplaindrome;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		
		
		System.out.println(reverseString("Yahoo"));
		//this gives "00haY"
		System.out.println(isPalindrome("KAYAK12"));
		//this is false
		System.out.println(isAnagram("isAnagram","isnagrama"));
		//this is false
	}
	//Method to reverse s string
	public static StringBuilder reverseString(String text) {
		
		StringBuilder sb= new StringBuilder();
		//convert string to an array
		char[] array= text.toCharArray();
		//start from the last character and add values to a string builder
		for (int i = array.length-1; i >= 0 ;i-- ) {
			sb.append(array[i]);
		}
		// return reversed string sb 
		return sb;
		
	}

	//method to check if a string is a palindrome or not 
	public static boolean isPalindrome(String text) {
		//
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
		// defensive coding check for null values first 
		//return false if one of the strings is null
		if(text1.length()==0|| text2.length()==0)
			return false;
		//check if the lenght if two strings is not equal
		if(text1.length()!=text2.length())
			return false;
		//convert strings to arrays
		char[] array1= text1.toCharArray();
		char[] array2=text2.toCharArray();
		//sort the arrays 
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		if(array1.equals(array2))
			return true;	
		return true ;
	}
	
	
	
}
