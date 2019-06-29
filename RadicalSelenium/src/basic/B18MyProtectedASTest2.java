package basic;

public class B18MyProtectedASTest2 extends B18MyProtectedAS {
	
	public static void main(String args[]){
		B18MyProtectedASTest2 obj = new B18MyProtectedASTest2();
		obj.method2();
		obj.method1();
		//method1() will be accessible when there is an inheritance
	}

}
