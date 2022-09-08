package pojoClassForSerializationAndDeserialization;

public class EmployeeWithSpouse {
	String EmpName;
	String EmpEmail;
	Object Spouse;
	public EmployeeWithSpouse(String empName, String empEmail, Object spouse) {
		super();
		EmpName = empName;
		EmpEmail = empEmail;
		Spouse = spouse;
	}
	
	public EmployeeWithSpouse() {

}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public String getEmpEmail() {
		return EmpEmail;
	}

	public void setEmpEmail(String empEmail) {
		EmpEmail = empEmail;
	}

	public Object getSpouse() {
		return Spouse;
	}

	public void setSpouse(Object spouse) {
		Spouse = spouse;
	}
	
}