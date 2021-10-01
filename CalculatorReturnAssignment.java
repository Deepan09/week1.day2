package week1.day2;

public class CalculatorReturnAssignment {
public int add(int num1,int num2, int num3)
{
	int sum=num1+num2+num3;
	return sum;
}
public int sub(int num1,int num2)
{
	int subtraction=num1-num2;
	return subtraction;
}
public int product(int num1,int num2)
{
	int mulValue=num1*num2;
	return mulValue;
}
public int divide(int num1,int num2)
{
	int dividedValue=num1/num2;
	return dividedValue;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
CalculatorReturnAssignment myObj=new CalculatorReturnAssignment();
int sum1=myObj.add(3, 40, 50);
System.out.println("the sum value is: " +sum1);
int sub1=myObj.sub(8, 5);
System.out.println("the subtracted value is : " +sub1);
int mul1=myObj.product(4, 8);
System.out.println("the product value : " +mul1);
int div1=myObj.divide(9, 3);
System.out.println("the divide value : " +div1);
 
	
	}

}


