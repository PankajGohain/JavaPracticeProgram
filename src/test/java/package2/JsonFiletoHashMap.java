package package2;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonFiletoHashMap {

	public static List<HashMap<String, String>> readJson(String pathToJson) throws IOException {

		String jsonInString = FileUtils.readFileToString(new File(pathToJson), StandardCharsets.UTF_8);

		ObjectMapper mapper = new ObjectMapper();

		List<HashMap<String, String>> listmap = new ArrayList<HashMap<String, String>>();

		listmap = mapper.readValue(jsonInString, new TypeReference<List<HashMap<String, String>>>() {
		});

		return listmap;
	}

}
