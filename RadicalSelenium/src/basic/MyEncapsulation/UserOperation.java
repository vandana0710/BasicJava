package basic.MyEncapsulation;

public class UserOperation {

	public void createEmp(MyEncapsulationUser userObj) {
		int id = userObj.getEmpID();
		//driver.......................................steTest(id)
		System.out.println("entering id = 23 ");
		String na=userObj.getEmpName();
		System.out.println("entering name = Ram");
		String ad=userObj.getEmpAddress();
		String de=userObj.getEmpDepartment();
		int mo=userObj.getEmpMobile();
		
		if(ad!=null) {
			System.out.println("entering address = Aundh ");
			//driver.......................................steTest(ad)
			
		}
		if(de!=null) {
			System.out.println("entering department = IT ");
			//driver.......................................steTest(de)
			
		}
		//if(mo!=null) {
			//System.out.println("entering Mobile = 9");
			//driver.......................................steTest(mo)
		//}
	}
		
	
public void updateEmp() {
		
	}
}
