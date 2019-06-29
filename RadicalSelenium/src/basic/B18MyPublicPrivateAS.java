package basic;

public class B18MyPublicPrivateAS {
	
	public void method1(){
		System.out.println(" in method 1");
		method2();
	}
	
	private void method2(){
		System.out.println(" in method 2");
	}
	
	public static void main(String args[]){
		B18MyPublicPrivateAS obj = new B18MyPublicPrivateAS();
		obj.method1();
		obj.method2();
	}
	

}
