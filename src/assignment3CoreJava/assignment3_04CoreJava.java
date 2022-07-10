package assignment3CoreJava;

import java.util.Arrays;

public class assignment3_04CoreJava {

	public static void main(String[] args) {
		String str = "porcovete";
		char[] charArr = str.toCharArray();
		// print the char[] elements
		System.out.println("String converted to char array: " 
							+ Arrays.toString(charArr));
		
		char[] charArray = {'p','o','r','c','o','v','e','t','e'};
		
		String str1 = new String(charArray);
		
		System.out.println("Char array converted back to string: " + str1);
	}
}