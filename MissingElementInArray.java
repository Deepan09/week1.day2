package week1.day2;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arrayNum[]= {0,1,2,3,4,6,7,8,10};
Arrays.sort(arrayNum);

for (int i = 0; i<arrayNum.length; i++) {
	if (arrayNum[i]!=i) {
		System.out.println("the missing element is: " +i);
		break;
	}
}
	}

}
