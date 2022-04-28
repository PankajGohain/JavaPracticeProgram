package package2.OmPrakash;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonUtils {

	// Method1
	public static <T> T deserialzeJsonGeneric(String fileName, Class<T> T)	throws IOException{

		File fName = new File(System.getProperty("user.dir") + "\\src\\test\\java\\package2\\"+fileName+".json");
		
		ObjectMapper mapper = new ObjectMapper();
		return mapper.readValue(fName, T);
	}

	// Method2
	public static BillingAddress deserialzeJsonBill(File fileName, BillingAddress billAdd) throws IOException {

		ObjectMapper mapper = new ObjectMapper();
		return mapper.readValue(fileName, billAdd.getClass());
	}

	
	
}
