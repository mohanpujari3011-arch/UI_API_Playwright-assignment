package Core;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import com.microsoft.playwright.Page;

public class BaseTest {
	
	protected Page page;

	@BeforeClass
	   public void setup() {
	     page = PlaywrightFactory.getPage();   ;
	    }

	    @AfterClass
	    public void tearDown() {
	        PlaywrightFactory.close();
	    }
	}


