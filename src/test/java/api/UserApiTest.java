package api;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.microsoft.playwright.APIRequestContext;
import com.microsoft.playwright.APIResponse;
import Core.APIClient;


public class UserApiTest {
	
	@Test(priority=1)
	void getUsersSuccess() {
	    APIRequestContext api = APIClient.getContext();
	    APIResponse response = api.get("/posts");
	    System.out.print(response.text());
	    Assert.assertEquals(200, response.status());
	}


	@Test(priority=2)
	void invalidEndpoint() {
	    APIRequestContext api = APIClient.getContext();
	    APIResponse response = api.get("/invalid");
	    System.out.print(response.text());
	    Assert.assertEquals(404, response.status());
	}

}
