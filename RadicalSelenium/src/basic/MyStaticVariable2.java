package basic;

public class MyStaticVariable2 {
	
int variable1=0;
	MyStaticVariable2(){
		variable1++;
		System.out.println(variable1);
	}
	public static void main(String[] args) {
		
		MyStaticVariable2 obj1=new MyStaticVariable2();
		MyStaticVariable2 obj2=new MyStaticVariable2();
		MyStaticVariable2 obj3=new MyStaticVariable2();
		
		
		
	}

}
 