package basic.MyEncapsulation;

public class MyEncapsulationGroupOperation {
	
	public void createGroup(MyEncapsulationGroup obj){
		
		//check for mandatory and non mandatory field
		String gNm = obj.getGrpName();
		if(gNm!=null){
			System.out.println("Group Name is "+gNm);
		}
		
		String dNm = obj.getDeptName();
		if(dNm!=null){
			System.out.println("Department name is "+dNm);
		}else{
			System.out.println("Must Enter Dept name ");
		}
	}

}
