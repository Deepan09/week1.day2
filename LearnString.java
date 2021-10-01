package week1.day2;

public class LearnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//two ways to initialize the string. string is a class
		//first one is usual way..like we do variable declare
		String str ="welcome to Testleaf";
		//operations done on string(class)
		int len=str.length();   //find length of str using dot
		System.out.println("the length of the string is: " +len);
		char letter= str.charAt(4); //find a char at position using dot
		System.out.println("the leteer in 4th position is : " +letter);
		int position=str.indexOf('m');// find the position of char in a string
		System.out.println("the position of m is : " +position);
		int lastChar= str.lastIndexOf('w');
		System.out.println(lastChar);
		
		//change a string to array
		char[] strArray=str.toCharArray();
		for (int i = 0; i < strArray.length; i++) {
			System.out.println("the elements in chararray are [" + i + "]=" +strArray[i]);
		}
		char letterAt=strArray[6];  //to find an element in string array
		System.out.println("the letter at the 5th position is " +letterAt);
		
		String[] splitStr=str.split("o");  //delimiter splitting the string
		for (int i = 0; i < splitStr.length; i++) {
			System.out.println("string split at o's = " + splitStr[i]);
		}
		//System.out.println("string split at o's = " + splitStr);
	}

}
