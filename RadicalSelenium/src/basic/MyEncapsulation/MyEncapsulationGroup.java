package basic.MyEncapsulation;

public class MyEncapsulationGroup {
	
	private String groupName;
	private String depName;

	//for group name
	public void setGrpName(String gName){
		groupName=gName;
	}
	
	public String getGrpName(){
		return groupName;
	}
	
	//For Department name
	
	public void setDeptName(String dept){
		depName=dept;
	}
	
	public String getDeptName(){
		return depName;
	}
}
