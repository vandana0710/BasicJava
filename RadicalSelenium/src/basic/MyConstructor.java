package basic;

public class MyConstructor {

	int i;
	String name;
	String loc;
	int v;
	
	MyConstructor(){
		System.out.println("Inside Constructor");
		i=10;
		name="pooja";
		
	}
	MyConstructor(int id, String username){
		System.out.println("Inside Constructor");
		i=id;
		name=username;	
	}
	MyConstructor(int id, int value){
		System.out.println("Inside Constructor");
		i=id;
		v=value;	
	}
	
	MyConstructor(String username, int id){
		System.out.println("ulta Inside Constructor");
		i=id;
		name = username;
			
	}
	
	MyConstructor(int id, String username, String location){
		System.out.println("Inside Constructor");
		i=id;
		name = username;
		loc = location;
			
	}
}
