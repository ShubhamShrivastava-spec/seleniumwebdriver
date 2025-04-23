package WebLoginFlow;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
		

	public class PostAPI
	{

		    @Test
		    public void loginFormAutomation() {
		        RestAssured.baseURI = "https://practicetestautomation.com";

		        // Send POST request with form data
		        Response response = given()
		            .header("Content-Type", "application/x-www-form-urlencoded")
		            .formParam("username", "student")
		            .formParam("password", "Password123")
		        .when()
		            .post("/practice-test-login/")
		        .then()
		            .statusCode(302) 
		            .extract().response();

		        // Print full response
		        System.out.println("Status Code: " + response.getStatusCode());
		        System.out.println("Location Header (Redirect): " + response.getHeader("Location"));
		    }
	}

	


