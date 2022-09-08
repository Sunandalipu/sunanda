package serializationAndDeserilaization;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;

import pojoClassForSerializationAndDeserialization.Employee;
import pojoClassForSerializationAndDeserialization.EmployeeForArray;

public class EmployeeSerialization  {
	public static void main(String[] args) throws Throwable {

		//create an object for pojo class
		 Employee employeeserialization=new Employee("Sunanda","ID1255","dummy@gmail.com",9789);

		//create an object for objectmapper class	
		ObjectMapper objmapper=new ObjectMapper();
		
		//use write value method
		objmapper.writeValue(new File("./Employee.json"),employeeserialization);

	}
}
