package basic.MyInheritance;
public class MethodOverloading 
{
	
	
	public void method1()
	{
		System.out.println("in method 1");
	}
	
	public void method1(String n)
	{
		System.out.println("in method 2");
		System.out.println(" name = "+n);
	}
	
	public void method1(int i)
	{
		System.out.println("in method 3");
		System.out.println(" value = "+i);
	}
	
	public void method1(int i,String n)
	{
		System.out.println("in method 4");
		System.out.println(" name = "+n);
		System.out.println(" value = "+i);
	}
}
