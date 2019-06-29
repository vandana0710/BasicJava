package basic.MyAbstraction;

public abstract class ClassAChild extends ClassA
{

	@Override
	public void method1()
	{
			System.out.println("Method 1 in the ClassAChild class");
		
	}

	@Override
	public void method4()
	{
			System.out.println("Method 4 in the ClassAChild class");
		
	}

	public abstract void method5();
	
	public void  method3()
	{
			System.out.println("Method 3 in the ClassAChild class");
	}
	
}
