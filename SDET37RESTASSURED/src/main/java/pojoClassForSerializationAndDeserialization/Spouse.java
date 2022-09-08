package pojoClassForSerializationAndDeserialization;

public class Spouse {
	String SpouseName;
	String SpouseId;
	int SpuseAge;
	public Spouse(String spouseName, String spouseId, int spuseAge) {
		super();
		SpouseName = spouseName;
		SpouseId = spouseId;
		SpuseAge = spuseAge;
	}
Spouse(){
	
}
public String getSpouseName() {
	return SpouseName;
}
public void setSpouseName(String spouseName) {
	SpouseName = spouseName;
}
public String getSpouseId() {
	return SpouseId;
}
public void setSpouseId(String spouseId) {
	SpouseId = spouseId;
}
public int getSpuseAge() {
	return SpuseAge;
}
public void setSpuseAge(int spuseAge) {
	SpuseAge = spuseAge;
}

}
