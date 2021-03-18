class Test{
	double r = 2.0;
	
	double findArea() {
		return 3.14  * r * r;
	}
}


public class Testcircle {
	public static void main(String args[]) {
		Test c1 = new Test();
		
		System.out.println("The area of circle with radius " + c1.r + " is " + c1.findArea());
	}
}
