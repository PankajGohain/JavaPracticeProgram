package package2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderMap {

	@Test(dataProvider = "setData")
	public void demoData(HashMap<String, String> hmap) {
		System.out.println("Destination 1 is:" + hmap.get("dest"));
		System.out.println("Destination 2 is:" + hmap.get("dest1"));
		System.out.println("Destination 3 is:" + hmap.get("dest2"));
		System.out.println("Destination 4 is:" + hmap.get("dest3"));
	}

	@DataProvider
	public Object[][] setData() {
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("dest", "Bangalore");
		map1.put("dest1", "Guwahati");
		map1.put("dest2", "Delhi");
		map1.put("dest3", "Noida");
		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("dest", "New York");
		map2.put("dest1", "Florida");
		map2.put("dest2", "Moscow");
		map2.put("dest3", "Paris");
		HashMap<String, String> map3 = new HashMap<String, String>();
		map3.put("dest", "NY");
		map3.put("dest1", "DA");
		map3.put("dest2", "EF");
		map3.put("dest3", "IO");
		HashMap<String, String> map4 = new HashMap<String, String>();
		map4.put("dest", "OO");
		map4.put("dest1", "PT");
		map4.put("dest2", "DR");
		map4.put("dest3", "EF");

		List<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
		list.add(map1);
		list.add(map2);
		list.add(map3);
		list.add(map4);

		return new Object[][] { { list.get(0) }, { list.get(1) }, { list.get(2) }, { list.get(3) } };
	}
}
