package week1.day2;

import java.util.Arrays;


public class ArraySecondLargeandSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int numArr[]= {23,87,25,64,90,12};
Arrays.sort(numArr);
//second lagrest length -2
System.out.println("the second largest is : " +numArr[numArr.length-2]);
System.out.println("the second smallest is : " +numArr[1]);

	}

}
