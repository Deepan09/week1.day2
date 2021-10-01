package week1.day2;

public class PrivateClassLearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearningClassMobile mobObj = new LearningClassMobile();
		mobObj.makeCalls();
		mobObj.takeSnap();
		//mobObj.payMoney(); cannot access private
		int screensize2 = mobObj.screensize;
		System.out.println("screensize is = " + screensize2);

	}

}
