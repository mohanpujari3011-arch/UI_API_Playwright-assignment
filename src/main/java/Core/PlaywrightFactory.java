package Core;

import com.microsoft.playwright.*;

public class PlaywrightFactory {

		private static Playwright playwright;
	    private static ThreadLocal<Browser> browser = new ThreadLocal<>();
	    private static ThreadLocal<Page> page = new ThreadLocal<>();
	      
		public static Page getPage() {
	        playwright = Playwright.create();
	        browser.set(playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(true).setChannel("chrome")));
	        page.set(browser.get().newContext().newPage());
	        return page.get();
	    }

	    public static void close() {
	        browser.get().close();
	        playwright.close();
	    }
	}
