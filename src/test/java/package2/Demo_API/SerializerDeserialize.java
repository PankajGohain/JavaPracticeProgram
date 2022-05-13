package package2.Demo_API;

//https://qaautomation.expert/2021/11/03/how-to-create-json-object-payload-using-pojo-jackson-api/

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SerializerDeserialize {

	public static void main(String[] args) throws JsonProcessingException {

		Employee employee = new Employee();
		employee.setFirstName("Tim");
		employee.setLastName("Tran");
		employee.setAge(49);
		employee.setSalary(89000);
		employee.setDesignation("Manager");
		employee.setContactNumber("+3538944412341");
		employee.setEmailId("ttran@test.com");

		// Converting a Java class object to a JSON payload as string
		ObjectMapper mapper = new ObjectMapper();
		String emp = mapper.writeValueAsString(employee);
		String empPretty = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee);
		System.out.println(emp);
		System.out.println(empPretty);

		// Converting Employee json string to Employee class object
		Employee empDeserialize = mapper.readValue(emp, Employee.class);
		System.out.println("First Name of employee : " + empDeserialize.getFirstName());
		System.out.println("Last Name of employee : " + empDeserialize.getLastName());
		System.out.println("Age of employee : " + empDeserialize.getAge());
		System.out.println("Salary of employee : " + empDeserialize.getSalary());
		System.out.println("Designation of employee : " + empDeserialize.getDesignation());
		System.out.println("Contact Number of employee : " + empDeserialize.getContactNumber());
		System.out.println("EmailId of employee : " + empDeserialize.getEmailId());
	}

}
