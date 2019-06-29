package basic.MyInheritance;

public class CarTest 
{
	public static void main(String args[])
	{
		Car Obj1 = new Car();
		Obj1.Color();
		Obj1.EngineCapacity();
		Obj1.noOfWheels();
		Obj1.SpeedLimit();
		System.out.println();
		
		Audi Obj2 = new Audi();
		Obj2.Color();
		Obj2.EngineCapacity();
		Obj2.noOfWheels();
		Obj2.SpeedLimit();
		System.out.println();
		
		AudiQ7 Obj3 = new AudiQ7();
		Obj3.Color();
		Obj3.EngineCapacity();
		Obj3.noOfWheels();
		Obj3.SpeedLimit();
		System.out.println();
		
		Car Obj4 = new Audi();
		Obj4.Color();
		Obj4.EngineCapacity();
		Obj4.noOfWheels();
		Obj4.SpeedLimit();
		System.out.println();
		
		Car Obj5 = new AudiQ7();
		Obj5.Color();
		Obj5.EngineCapacity();
		Obj5.noOfWheels();
		Obj5.SpeedLimit();
		System.out.println();
		
		AudiQ7 Obj6 = (AudiQ7) new Car();//Exception in thread "main" java.lang.ClassCastException: OopsConcepts.Inheritance.Car.Car
										 //cannot be cast to OopsConcepts.Inheritance.Car.AudiQ7
										 //at OopsConcepts.Inheritance.Car.CarTest.main(CarTest.java:42)
		Obj6.Color();
		Obj6.EngineCapacity();
		Obj6.noOfWheels();
		Obj6.SpeedLimit();
		System.out.println();
		
	}

}
