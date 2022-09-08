package Practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.collect.ObjectArrays;

public class DataproviderTest {
	@Test(dataProvider = "journey")
	public void BookingTicket(String source, String Destination, int price)
	{
		System.out.println("From"+ source+"to"+Destination+"package"+price);
	}
	@DataProvider
	public Object[][] journey()
	
	{
		Object[][] objectArray = new Object[3][3];
		objectArray[0][0]="bangalore";
		objectArray[0][1]="kedarnath";
		objectArray[0][2]=30000;
		
		objectArray[1][0]="bangalore";
		objectArray[1][1]="goa";
		objectArray[1][2]=12000;
		
		objectArray[2][0]="bangalore";
		objectArray[2][1]="manali";
		objectArray[2][2]=40000;
		return objectArray;
		
		
		
		
	}

}
