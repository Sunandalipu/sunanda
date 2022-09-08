package serializationAndDeserilaization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoClassForSerializationAndDeserialization.EmployeeForArray;

public class DeserializationUsingArray {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper objmap3 = new ObjectMapper();
		EmployeeForArray e2 = objmap3.readValue(new File("./array.json"),EmployeeForArray.class );
		System.out.println(e2.getEmpName());
		System.out.println(e2.getEmpId());
		System.out.println(e2.getEmpEmail());
		System.out.println(e2.getEmpPhNo()[0]);
		System.out.println(e2.getEmpPhNo()[1]);
	}

}
