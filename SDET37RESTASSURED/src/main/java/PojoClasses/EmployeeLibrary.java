package PojoClasses;

public class EmployeeLibrary {
	String EmpName;
	String EmpId;
	String EmpEmail;
	int EmpPhNo;
	public EmployeeLibrary(String empName, String empId, String empEmail, int empPhNo) {
		super();
		EmpName = empName;
		EmpId = empId;
		EmpEmail = empEmail;
		EmpPhNo = empPhNo;
	}
	EmployeeLibrary( ){
		
	
	
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getEmpId() {
		return EmpId;
	}
	public void setEmpId(String empId) {
		EmpId = empId;
	}
	public String getEmpEmail() {
		return EmpEmail;
	}
	public void setEmpEmail(String empEmail) {
		EmpEmail = empEmail;
	}
	public int getEmpPhNo() {
		return EmpPhNo;
	}
	public void setEmpPhNo(int empPhNo) {
		EmpPhNo = empPhNo;
	}

}
