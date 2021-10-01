package week1.day2;

import java.util.Arrays;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="malayalam";
String reverse="malayalam";
char[] strinArray=str.toCharArray();
for (int i = 0; i < strinArray.length; i++) {
	System.out.println("the string array is : " + strinArray[i]);	
	
}
System.out.println("***********")	; 
char[] revArray=reverse.toCharArray();
for (int i = revArray.length-1; i >= 0; i--) {
	System.out.println("the reversed string array is : " + revArray[i]);	
	
}
if (Arrays.equals(strinArray, revArray)){   //using array class equals() method
	System.out.println("it is a palindrome");
	
} else {
System.out.println("it is not a palindrome");
}

}
}