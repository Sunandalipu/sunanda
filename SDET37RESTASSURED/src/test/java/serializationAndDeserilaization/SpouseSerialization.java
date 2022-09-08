package serializationAndDeserilaization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoClassForSerializationAndDeserialization.EmployeeWithSpouse;
import pojoClassForSerializationAndDeserialization.Spouse;

public class SpouseSerialization {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		Spouse spouse = new Spouse("rachana","ty002",25);
		EmployeeWithSpouse emp = new EmployeeWithSpouse("happy","happy@gmail.com",spouse);
		
		ObjectMapper obj = new ObjectMapper();
		obj.writeValue(new File("./spouse1.json"), emp);

	}

}
