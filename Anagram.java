package week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="fried";
		String str2="flexi";
		char[] str1Arr=str1.toCharArray();
		for (int i = 0; i < str1Arr.length; i++) {
			System.out.println("the string array is : " + str1Arr[i]);	
			
		}
		System.out.println("***********")	; 
		char[] str2Arr=str2.toCharArray();
		for (int i = 0; i < str2Arr.length; i++) {
			System.out.println("the reversed string array is : " + str2Arr[i]);	
			
		}
		Arrays.sort(str2Arr);
		Arrays.sort(str1Arr);
		if (Arrays.equals(str1Arr, str2Arr)){   //using array class equals() method
			System.out.println("it is a anagram");
			
		} else {
		System.out.println("it is not a anagram");
		}

	}

	
}
