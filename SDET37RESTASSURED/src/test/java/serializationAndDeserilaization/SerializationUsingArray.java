package serializationAndDeserilaization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoClassForSerializationAndDeserialization.EmployeeForArray;

public class SerializationUsingArray {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		int[] arr = {9777,8976};
		EmployeeForArray emp2 = new EmployeeForArray("sunand","tyss01","sunand@gmail.com",arr);
		
		ObjectMapper objmapper3 = new ObjectMapper();
		objmapper3.writeValue(new File("./array.json"), emp2);

	}

}
