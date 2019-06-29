package basic.MyInheritance;

public class MethodOverloadingTest 
{
	public static void main(String args[])
	{
		MethodOverloading mo = new MethodOverloading();
		mo.method1();
		mo.method1(10);
		mo.method1("Suruchi");
		mo.method1(11, "Sucheta");
	}
}
