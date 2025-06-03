import static io.restassured.RestAssured.baseURI;
	import static io.restassured.RestAssured.given;
	import static org.hamcrest.CoreMatchers.equalTo;

	import java.util.List;

	import org.testng.annotations.Test;

	import io.restassured.http.ContentType;
	import io.restassured.http.Header;
	import io.restassured.response.Response;

	public class Activity4 {
	    Long petId;  

	    @Test
	    public void AddNewPet() {
	        baseURI = "https://petstore.swagger.io/v2/pet";

	        String reqBody = "{ \"name\": \"Ansar\", \"status\": \"alive\" }";

	        Response response = 
	            given()
	                .contentType(ContentType.JSON)
	                .body(reqBody)
	            .when()
	                .post(baseURI); // Send POST request

	        

	        petId = response.then().extract().path("id");
	        System.out.println("Pet ID: " + petId);
	        String body = response.getBody().asPrettyString();
	        System.out.println(body);
	    }

	    @Test
	    public void UpdatePet() {
	        String updateURI = "https://petstore.swagger.io/v2/pet";

	        String reqBody = "{ \"id\": " + petId + ", \"name\": \"Ansar\", \"status\": \"studying\" }";
	        System.out.println("PUT Request Body:\n" + reqBody);

	        Response response = 
	            given()
	                .contentType(ContentType.JSON)
	                .body(reqBody)
	            .when()
	                .put(updateURI); // Send PUT request
	        System.out.println(response.prettyPrint());
	        String petStatus=response.then().extract().path("status");

	        //String body = response.getBody().asPrettyString();
	        System.out.println(petStatus);
	    }

	    @Test(priority = 3)
	    public void GetPet() {
	        String getURI = "https://petstore.swagger.io/v2/pet/{petId}"; // Correct URL
	        System.out.println("Pet ID: " + petId);

	        Response response = 
	            given()
	                .contentType(ContentType.JSON)
	                .pathParam("petId", petId) // Set path parameter
	            .when()
	                .get(getURI); // Send GET request

	        // Print full response body
	        String petResponse = response.prettyPrint();
	        System.out.println("Pet Response:\n" + petResponse);

	        // Optional: check status code
	        response.then().statusCode(200);

	        // Optional: get pet status
	        String petStatus = response.path("status");
	        System.out.println("Pet Status: " + petStatus);
	    }


	    @Test(priority = 4)
	    public void deleteDetails() {
	        baseURI = "https://petstore.swagger.io/v2/pet";

	        Response response = 
	            given()
	                .contentType(ContentType.JSON)
	            .when()
	                .delete(baseURI + "/" + petId); // Run GET request

	        String responseBody = response.getBody().prettyPrint();
	        System.out.println("delete Response:\n" + responseBody);
	    }
	}