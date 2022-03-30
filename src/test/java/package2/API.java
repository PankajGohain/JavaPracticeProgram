package package2;

public class API {

	public static void main(String[] args) {
		
			/*
			 * Every response that is received from a server contains zero or more headers.
			 * Headers are the part of Response that is sent by the server. Each header
			 * entry is basically a Key-Value pair. Headers are used to send across extra
			 * information by the server. This extra information is also referred to as
			 * Metadata of the Response.
			 */

		Response response="abcd";
		
		 String contentType = response.header("Content-Type");
		 System.out.println("Content-Type value: " + contentType);
		 
		 // Reader header of a give name. In this line we will get Header named Server
		 String serverType =  response.header("Server");
		 System.out.println("Server value: " + serverType);
		 
		 // Reader header of a give name. In this line we will get Header named Content-Encoding
		 String acceptLanguage = response.header("Content-Encoding");
		 System.out.println("Content-Encoding: " + acceptLanguage);
		 
			/*
			 * Note: Response.GetHeader(String headerName) method does exactly the same
			 * thing as the Response. Header(String headerName) method does. So the above
			 * can be written with replacing .Header with . GetHeader. Try it out yourself.
			 */
		 
	//	 All the headers in a Response can also be printed by simply iterating over each Header. 
    //   Response interface provides two methods
	//	 headers() : returns Headers
	//	 getHeaders() : returns Headers
		 
		 Headers allHeaders = response.headers();
		 // Iterate over all the Headers
		 for(Header header : allHeaders)
		 {
		 System.out.println("Key: " + header.getName() + " Value: " + header.getValue());
		 }
		 
		 
		 
	}

}
