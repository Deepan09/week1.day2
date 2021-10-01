package week1.day2;

public class LearningClassMobile {
int screensize=12;
int cost;
char logo;
float amps;
long mobileNumber;
boolean isTouchScreen;
String brandName;

public void makeCalls()
{
	System.out.println("making calls");
}
public void takeSnap()
{
	System.out.println("taking snap ");
}
private void payMoney()
{
	System.out.println("paying money");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
LearningClassMobile mobObj = new LearningClassMobile();
mobObj.makeCalls();
mobObj.takeSnap();
mobObj.payMoney();
int screensize2 = mobObj.screensize;
System.out.println("screensize is = " + screensize2);

	}

}
                      