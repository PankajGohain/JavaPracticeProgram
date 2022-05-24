package package2.RShetty;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class JsonFiletoHashMapDataProvider {

	@Test(dataProvider = "setData")
	public void demoData(HashMap<String, String> hmap) {
		System.out.println("Destination 1 is:" + hmap.get("dest"));
		System.out.println("Destination 2 is:" + hmap.get("dest1"));
		System.out.println("Destination 3 is:" + hmap.get("dest2"));
		System.out.println("Destination 4 is:" + hmap.get("dest3"));
	}

	@DataProvider
	public Object[][] setData() throws IOException {

		List<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
		list = JsonFiletoHashMap
				.readJson(System.getProperty("user.dir") + "\\src\\test\\java\\package2\\JsonDataProvider.json");

		return new Object[][] { { list.get(0) }, 
								{ list.get(1) } 
							  };
	}
}
