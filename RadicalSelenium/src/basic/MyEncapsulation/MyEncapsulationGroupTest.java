package basic.MyEncapsulation;

public class MyEncapsulationGroupTest {

	public static void main(String args[]){
		
		MyEncapsulationGroup obj = new MyEncapsulationGroup();
		obj.setDeptName("Reaserch");
		obj.setGrpName("Einstine");
		MyEncapsulationGroupOperation grpOp = new MyEncapsulationGroupOperation();
		grpOp.createGroup(obj);
		
		
	}
}
