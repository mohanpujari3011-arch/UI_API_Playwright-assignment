package Core;

import com.microsoft.playwright.APIRequest;
import com.microsoft.playwright.APIRequestContext;
import com.microsoft.playwright.Playwright;

public class APIClient {
	
	 static Playwright playwright;
	 private static APIRequestContext request;
	 
	    public static APIRequestContext getContext() {
	        playwright = Playwright.create();
	        request =playwright.request().newContext(new APIRequest.NewContextOptions().setBaseURL("https://jsonplaceholder.typicode.com"));
	        return request;
	    }
}
