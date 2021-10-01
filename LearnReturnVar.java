package week1.day2;

public class LearnReturnVar {
  
	
	public int add()
	{
		int a=5;
		int b=6;
		int c=a+b;
		return c;
	}
	public int sub(int a, int b)
	{
		int subValue=a-b;
		return subValue;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
LearnReturnVar myObj=new LearnReturnVar();
int sum=myObj.add();
System.out.println("addition result : " +sum); //returning variable
int value=myObj.sub(8, 7);//passing arguments in method
System.out.println("subtracted value is: " +value);
	}

}
