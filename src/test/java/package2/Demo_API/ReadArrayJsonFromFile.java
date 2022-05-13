package package2.Demo_API;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadArrayJsonFromFile {

	public static void main(String[] args) {

		ObjectMapper mapper = new ObjectMapper();

		// Converting Employee json string to Employee class object
		List<Employee> allEmployeeDetails = null;
		try {
			allEmployeeDetails = mapper.readValue(new File("C:\\Users\\Vibha\\Desktop\\EmployeeList.json"),
					new TypeReference<List<Employee>>() {});
		} catch (StreamReadException e) {
			e.printStackTrace();
		}  catch (IOException e) {
			e.printStackTrace();
		}

		for (Employee emp : allEmployeeDetails) {

			System.out.println("######################################");

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
