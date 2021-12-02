package com.vfislk.oops;

interface WebDriverDemo {
	public abstract void get(String url);

	public abstract void quit();

	void click();

	String getTitle();
}

interface TakeScreenshotDemo {
	void getScreenshot();
}

class ChromeDriverDemo implements WebDriverDemo, TakeScreenshotDemo {
	public ChromeDriverDemo() {
		System.out.println("Launch chrome browser");
	}

	public void chromeOnly() {
		System.out.println("only for chrome browser");
	}

	public void get(String url) {
		System.out.println("navigate to url in chrome");
	}

	public void quit() {
		System.out.println("close the chrome browser");

	}

	public void click() {
		System.out.println("click in chrome!!");

	}

	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getScreenshot() {
		// TODO Auto-generated method stub
		System.out.println("chrome Screenshot");
	}

}

class FirefoxDriverDemo implements WebDriverDemo, TakeScreenshotDemo {
	public FirefoxDriverDemo() {
		System.out.println("Launch Firefox browser");
	}

	public void get(String url) {
		System.out.println("navigate to url in firefox");
	}

	public void quit() {
		System.out.println("close the firefox browser");

	}

	public void click() {
		System.out.println("click in firefox!!");

	}

	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getScreenshot() {
		// TODO Auto-generated method stub
		System.out.println("firefox Screenshot");
	}
}

class XBrowser {

}

public class BrowserTest {

	public static void main(String[] args) {

		WebDriverDemo driver = new FirefoxDriverDemo(); // launch browser

//		driver=new FirefoxDriverDemo();
		driver.get("google.com");

		driver.click();

		driver.quit();

		TakeScreenshotDemo ts = (TakeScreenshotDemo) driver; // launch browser

		ts.getScreenshot();

	}

}
