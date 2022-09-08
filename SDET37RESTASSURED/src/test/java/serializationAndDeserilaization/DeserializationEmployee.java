package serializationAndDeserilaization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoClassForSerializationAndDeserialization.EmployeeForArray;

public class DeserializationEmployee {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
      ObjectMapper objectmapper1 = new ObjectMapper();
      EmployeeForArray e1 = objectmapper1.readValue(new File("./Employee.json"), EmployeeForArray.class);
      System.out.println(e1.getEmpName());
      System.out.println(e1.getEmpId());
      System.out.println(e1.getEmpEmail());
      System.out.println(e1.getEmpPhNo());
	}

}
