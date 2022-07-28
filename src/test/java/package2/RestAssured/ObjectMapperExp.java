package package2.RestAssured;

import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.collections4.map.HashedMap;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMapperExp {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {

		String json = "{\r\n" + "\"problems\": [{\r\n" + "    \"Diabetes\":[{\r\n" + "        \"medications\":[{\r\n"
				+ "            \"medicationsClasses\":[{\r\n" + "                \"className\":[{\r\n"
				+ "                    \"associatedDrug\":[{\r\n" + "                        \"name\":\"asprin\",\r\n"
				+ "                        \"dose\":\"\",\r\n" + "                        \"strength\":\"500 mg\"\r\n"
				+ "                    }],\r\n" + "                    \"associatedDrug#2\":[{\r\n"
				+ "                        \"name\":\"somethingElse\",\r\n"
				+ "                        \"dose\":\"\",\r\n" + "                        \"strength\":\"500 mg\"\r\n"
				+ "                    }]\r\n" + "                }],\r\n" + "                \"className2\":[{\r\n"
				+ "                    \"associatedDrug\":[{\r\n" + "                        \"name\":\"asprin\",\r\n"
				+ "                        \"dose\":\"\",\r\n" + "                        \"strength\":\"500 mg\"\r\n"
				+ "                    }],\r\n" + "                    \"associatedDrug#2\":[{\r\n"
				+ "                        \"name\":\"somethingElse\",\r\n"
				+ "                        \"dose\":\"\",\r\n" + "                        \"strength\":\"500 mg\"\r\n"
				+ "                    }]\r\n" + "                }]\r\n" + "            }]\r\n" + "        }],\r\n"
				+ "        \"labs\":[{\r\n" + "            \"missing_field\": \"missing_value\"\r\n" + "        }]\r\n"
				+ "    }],\r\n" + "    \"Asthma\":[{}]\r\n" + "}]}";

		ObjectMapper mapper = new ObjectMapper();

		Map<Object, Object> hmap = new HashedMap<Object, Object>();
		hmap = mapper.readValue(json, new TypeReference<Map<Object, Object>>() {});

		System.out.println(hmap);

		for (Map.Entry<Object, Object> emap : hmap.entrySet()) {
			
			System.out.println("Key:"+ emap.getKey());
			System.out.println("Value:"+ emap.getValue());

		}

	}

}
