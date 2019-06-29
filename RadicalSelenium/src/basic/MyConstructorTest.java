package basic;

public class MyConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyConstructor obj=new MyConstructor();
		int k = obj.i;
		System.out.println("printing i ="+k);
		String n=obj.name;
		System.out.println("printing n ="+n);
		
		MyConstructor obj2=new MyConstructor(11, "Shashi");
		int k2 = obj2.i;
		String loc2=obj2.loc;
		System.out.println("printing i ="+k2);
		System.out.println("printing loc ="+loc2);
		
		MyConstructor obj3=new MyConstructor(11, "Shashi", "Aundh");
		int k3 = obj3.i;
		String loc3=obj3.loc;
		System.out.println("printing i ="+k3);
		System.out.println("printing loc ="+loc3);
		
		MyConstructor obj4=new MyConstructor(11,22);
	}

}
