package final_exam;

import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Browser;

public class ShopCustemerServiceTest {
	WebDriver driver;

	@Before
	public void setUp() {
		Browser.start();

	}

	@Test
	public void customerService() throws InterruptedException {
		Browser.goTo("http://shop.pragmatic.bg");

		WebElement contactUs = Browser.driver.findElement(By.xpath("/html/body/footer/div/div/div[2]/ul/li[1]/a"));

		assertEquals(true, contactUs.isDisplayed());

		contactUs.click();

		WebElement yourName = Browser.driver.findElement(By.id("input-name"));

		yourName.sendKeys("My name");

		WebElement yourMail = Browser.driver.findElement(By.id("input-email"));

		yourMail.sendKeys("alabala@abv.bg");

		WebElement enquiry = Browser.driver.findElement(By.id("input-enquiry"));

		enquiry.sendKeys("alabala@abv.bg");

		WebElement submit = Browser.driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input"));

		submit.click();

		WebElement continueButton = Browser.driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a"));

		assertEquals(true, continueButton.isDisplayed());

	}

	@After
	public void tearDown() {
		Browser.stop();

	}

}
