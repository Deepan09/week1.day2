package week1.day2;

public class CallVariableInsideMethod {   //using return in method
int shop= 67;  //learn calling instance out ofa method
private static int shop2;
public String makeCalls()
{
	String callMsg="hello"; //local variable // variables outside method is global(instance)/use return 
	System.out.println("making calls");
	return callMsg;
}
public void takeSnap(String str)   //passiing args in method
{
	
	System.out.println("taking snap :  " +str);
}
public void payMoney()
{
	System.out.println("paying money");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
CallVariableInsideMethod objMob=new  CallVariableInsideMethod();
String str= objMob.makeCalls();
System.out.println(str);  //while calling the method, inputs(str,int..) are given..
objMob.takeSnap("good");
shop2 = objMob.shop;   //call the variable using obj and create local variable by ctrl+1
System.out.println(shop2);
	}

}
/*to call a local variable ..meaning = variable created inside a method. in main using object. we have to store in new variable(like mention the type str or int)
and then Syso out*/