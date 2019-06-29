package basic.Final;

//If Class if final We cannot Extend a final class

public class FinalMethodChild extends FinalMethodParent {
	
	
	//We cant not override final method
		//void method1()
		//{
			//System.out.println("this is method 1");
		//}
		
		public static void main(String args[])
		{
			FinalMethodChild obj=new FinalMethodChild();
			obj.method1();
		}
		
}
