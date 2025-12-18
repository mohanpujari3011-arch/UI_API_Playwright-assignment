package Pages;

import com.microsoft.playwright.Page;

public class LoginPage {

	  private Page page;

	    private String username = "//input[@id='username']";
	    private String password = "//input[@id='password']";
	    private String loginBtn = "button[type='submit']";
	    private String message = "//div[@id='flash']";

	    public LoginPage(Page page) {
	        this.page = page;
	    }
        
	    
	    public void login(String user, String pass) {
	        page.navigate("https://the-internet.herokuapp.com/login");
	        page.setDefaultTimeout(10000);
	        page.fill(username, user);
	        page.fill(password, pass);
	        page.click(loginBtn);
	    }

	    public String getMessage() {
	        return page.textContent(message);
	    }
	}

