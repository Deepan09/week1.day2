package week1.day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int  numArr[]= {21,34,54,56,67,45};
		int fourthEle=numArr[3];   //access array using index number in square brackets after the array name
		System.out.println("the fourth element is: " +fourthEle);
		
		//how to get number of elements(length)
		int lenArr =numArr.length;
		System.out.println("length of the array is: " +lenArr);
		//display all elments in an array
		for (int i = 0; i < numArr.length; i++) {
			//System.out.println(numArr[i]);  
			System.out.println("the elements are [" + i + "]=" + numArr[i]);//sys out the array
		}
			Arrays.sort(numArr);
		
			System.out.println("the sorted array is: " );   // to run thru an array use for loop
			for (int i = 0; i < numArr.length; i++) {
				//System.out.println(numArr[i]);  
				System.out.println("the elements are [" + i + "]=" + numArr[i]);//sys out the array
			}
			int lastElement= numArr[numArr.length-1];  //apply length operator
			System.out.println("the last element is : "  + lastElement);
			
		}
	}


