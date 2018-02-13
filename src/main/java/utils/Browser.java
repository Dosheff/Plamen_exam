package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static WebDriver driver;

	public static void start() {
		System.setProperty("webdriver.chrome.driver", "C:/selenium_drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void stop() {
		driver.close();
	}
	public static void goTo(String Url) {
		Browser.driver.get(Url);
	}

}
