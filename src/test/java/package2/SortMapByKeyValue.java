package package2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class SortMapByKeyValue {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("David", 95);
		map.put("Jane", 80);
		map.put("Mary", 97);
		map.put("Lisa", 78);
		map.put("Dino", 65);
		map.put("Pankaj", 99);

		System.out.println(map);

		Set<Entry<String, Integer>> smap = map.entrySet();

		for (Entry<String, Integer> imap : smap) {
			System.out.println(imap.getKey() + "  ==>  " + imap.getValue());
		}

		// to sort Map by Key
		TreeMap<String, Integer> tmap = new TreeMap<String, Integer>(map);
		System.out.println(tmap);
		System.out.println("Map after sorting by Keys");
		Set<Entry<String, Integer>> stmap = tmap.entrySet();
		for (Entry<String, Integer> itmap : stmap) {
			System.out.println(itmap.getKey() + " ==> " + itmap.getValue());
		}

		// to sort Map by value
		List<Entry<String, Integer>> listMap = new ArrayList<Entry<String, Integer>>(smap);
		listMap.sort((x, y) -> x.getValue().compareTo(y.getValue()));
		System.out.println(listMap);
		System.out.println("Map after sorting by values");
		for (Entry<String, Integer> finalMap : listMap) {
			System.out.println(finalMap.getKey() + "==>" + finalMap.getValue());
		}
	}

}
