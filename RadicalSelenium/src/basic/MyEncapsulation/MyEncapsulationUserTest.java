package basic.MyEncapsulation;

import basic.MyMethod;

public class MyEncapsulationUserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyEncapsulationUser userObj=new MyEncapsulationUser();
		userObj.setEmpID(1);
		userObj.setEmpName("Ram");
	    userObj.setEmpAddress("Aundh");
	    userObj.setEmpDepartment("IT");
	    userObj.setEmpMobile(9);
		
		UserOperation userOp=new UserOperation();
		userOp.createEmp(userObj);
				
		MyEncapsulationUser userObj1=new MyEncapsulationUser();
		//userObj.setEmpID(2);
		//userObj.setEmpName("Monu");
		//userObj.setEmpAddress("Aundh");

	}

}
