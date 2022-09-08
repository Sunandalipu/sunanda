package serializationAndDeserilaization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoClassForSerializationAndDeserialization.EmployeeWithSpouse;

public class SpouseDesentralization {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper objmapp = new ObjectMapper();
		EmployeeWithSpouse e3 = objmapp.readValue(new File("./spouse1.json"),EmployeeWithSpouse.class);
		System.out.println(e3.getEmpName());
		System.out.println(e3.getEmpEmail());
		System.out.println(e3.getSpouse());
	}

}
