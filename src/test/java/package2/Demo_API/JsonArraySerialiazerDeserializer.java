package package2.Demo_API;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonArraySerialiazerDeserializer {

	public static void main(String[] args) throws JsonProcessingException {
		Employee emp1 = new Employee();
		emp1.setFirstName("Vibha");
		emp1.setLastName("Singh");
		emp1.setAge(30);
		emp1.setSalary(75000);
		emp1.setDesignation("Manager");
		emp1.setContactNumber("+919999988822");
		emp1.setEmailId("abc@test.com");

		Employee emp2 = new Employee();
		emp2.setFirstName("Neha");
		emp2.setLastName("Verms");
		emp2.setAge(35);
		emp2.setSalary(60000);
		emp2.setDesignation("Lead");
		emp2.setContactNumber("+914442266221");
		emp2.setEmailId("xyz@test.com");

		Employee emp3 = new Employee();
		emp3.setFirstName("Rajesh");
		emp3.setLastName("Gupta");
		emp3.setAge(20);
		emp3.setSalary(40000);
		emp3.setDesignation("Intern");
		emp3.setContactNumber("+919933384422");
		emp3.setEmailId("pqr@test.com");

		// Creating a List of Employees
		List<Employee> EmpList = new ArrayList<Employee>();
		EmpList.add(emp1);
		EmpList.add(emp2);
		EmpList.add(emp3);

		// Converting a Java class object to a JSON Array Payload as string
		ObjectMapper mapper = new ObjectMapper();
		String EmployeeList = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(EmpList);
		System.out.println(EmployeeList);

		// Converting a Java class object to a JSON Array Payload as string
		List<Employee> empDList = mapper.readValue(EmployeeList, new TypeReference<List<Employee>>() {
		});
		for (Employee emp : empDList) {

			System.out.println("===================================");

			System.out.println("First Name of employee : " + emp.getFirstName());
			System.out.println("Last Name of employee : " + emp.getLastName());
			System.out.println("Age of employee : " + emp.getAge());
			System.out.println("Salary of employee : " + emp.getSalary());
			System.out.println("Designation of employee : " + emp.getDesignation());
			System.out.println("Contact Number of employee : " + emp.getContactNumber());
			System.out.println("EmailId of employee : " + emp.getEmailId());
		}

	}

}
