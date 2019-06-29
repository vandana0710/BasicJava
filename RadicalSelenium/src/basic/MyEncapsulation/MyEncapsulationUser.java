package basic.MyEncapsulation;

public class MyEncapsulationUser {
	
	private int empID;
	private String name;
	private String address;
	private String department;
	private int mobile;
	
	public void setEmpID(int id) {
		empID = id;
		
	}
	public int getEmpID() {
		return empID;
		
	}
	public void setEmpName(String n) {
		name = n;
		
	}
	
	public String getEmpName() {
		return name;
		
	}
	
	public void setEmpAddress(String A) {
		address = A;
		
	}
	
	public String getEmpAddress() {
		return address;
		
	}
	public void setEmpDepartment(String D) {
		department = D;
		
	}
	
	public String getEmpDepartment() {
		return department;
		
	}
	
	public void setEmpMobile(int mo) {
		mobile = mo;
		
	}
	public int getEmpMobile() {
		return mobile;
		
	}
}
