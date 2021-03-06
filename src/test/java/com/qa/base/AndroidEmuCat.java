
package com.qa.base;

import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AndroidEmuCat {

	public static AndroidDriver<MobileElement> driver;

	@BeforeClass
	public static void setup() throws Exception {


		// Below are device capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		// caps.setCapability("app", "D:\\WWF Words with Friends
		// Helper_v4_apkpure.com.apk");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "8.0.0");
		caps.setCapability("deviceName", "emulator-5554");
		caps.setCapability("browserName", "chrome");
		caps.setCapability("chromedriverExecutable", "D:\\appium_browserstack-master\\driver\\chromedriver.exe");
//		caps.setCapability("appPackage", "com.android.chrome");
//		caps.setCapability("appActivity", "org.chromium.chrome.browser.ChromeTabbedActivity t7}}}");
		caps.setCapability("automationName", "UiAutomator2");
//		driver = new AndroidDriver<>(new URL(appiumServiceUrl), caps);
		driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//		 wait = new WebDriverWait(driver, 10);

	}

	@Test
	public void buyProduct() throws Throwable {
		driver.navigate().to("https://catevolution.com.au/index.php?route=common/amp_home");
		System.out.println("Browser is launched");
		System.out.println("Title " + driver.getTitle());
		Thread.sleep(3000);
		System.out.println("Url is launched");

//		System.out.println("****************Scrolled down starts****************");
//		Thread.sleep(3000);
//		for (int i = 0; i < 12; i++) {
//			JavascriptExecutor ja = (JavascriptExecutor) driver;
//			ja.executeScript("window.scrollBy(0,350)", "");
//			Thread.sleep(500);
//			System.out.println("Scrolled time: " + i);
//		}
//		System.out.println("****************Scrolled down end****************");
//
//		System.out.println("****************Scrolled up starts****************");
//		for (int i = 0; i < 12; i++) {
//			JavascriptExecutor jb = (JavascriptExecutor) driver;
//			jb.executeScript("window.scrollBy(0,-350)", "");
//			Thread.sleep(500);
//			System.out.println("Scrolled time: -" + i);
//		}
		
		System.out.println("****************Scrolled up end****************");

		Thread.sleep(3000);
		WebElement hamburgerMenu = driver.findElement(By.xpath("//button[@class=\"menu-button amp-close-image\"]"));
		hamburgerMenu.click();
		Thread.sleep(1000);
		System.out.println("We have clicked on hamburger menu");

		WebElement subMenuLitterRobot = driver.findElement(By.xpath("//a[contains(text(),'Litter-Robot Connect')]"));
		subMenuLitterRobot.click();
		System.out.println("We have clicked on Litter-Robot Connect sub menu");

		WebElement writeReview = driver.findElement(By.xpath("(//a[contains(text(),'Write a review')])[2]"));
		writeReview.isDisplayed();
		writeReview.isEnabled();

		System.out.println("Write review is enable and displayed.");
		Thread.sleep(3000);
		System.out.println("****************Scrolled down starts****************");
//		Thread.sleep(3000);
//		for (int i = 0; i < 8; i++) {
//			JavascriptExecutor jaa = (JavascriptExecutor) driver;
//			jaa.executeScript("window.scrollBy(0,350)", "");
//			Thread.sleep(500);
//			System.out.println("Scrolled time: " + i);
//		}
//		System.out.println("****************Scrolled down end****************");
//
//		System.out.println("****************Scrolled up starts****************");
//		for (int i = 0; i < 8; i++) {
//			JavascriptExecutor jab = (JavascriptExecutor) driver;
//			jab.executeScript("window.scrollBy(0,-350)", "");
//			Thread.sleep(500);
//			System.out.println("Scrolled time: -" + i);
//		}
//		System.out.println("****************Scrolled up end****************");
		
		Thread.sleep(5000);
		
		
		Select selectColor = new Select(driver.findElement(By.id("input-option240")));
		selectColor.selectByVisibleText("Grey (SKU: LR3C-1200 )");
		Thread.sleep(5000);
		
		Select selectColor1 = new Select(driver.findElement(By.id("input-option240")));
		selectColor1.selectByVisibleText("Bisque (SKU: LR3C-1000 )");
		Thread.sleep(1000);
		
		Select selectColor2 = new Select(driver.findElement(By.id("input-option240")));
		selectColor2.selectByVisibleText("Grey (SKU: LR3C-1200 )");
		Thread.sleep(1000);

		System.out.println("clicking on Add to cart button");
		// WebElement buyNowBtn = driver.findElement(By.xpath("//input[@value='Buy
		// Now']"));
		WebElement addToCartBtn = driver.findElement(By.xpath("//input[@value='Add to Cart']"));
		addToCartBtn.isDisplayed();
		addToCartBtn.click();
		Thread.sleep(5000);
		for (int i = 0; i < 1; i++) {
			JavascriptExecutor jsbe1 = (JavascriptExecutor) driver;
			jsbe1.executeScript("window.scrollBy(0,-250)", "");
			Thread.sleep(1000);
			System.out.println("Scrolled time:-" + i);
		}

		System.out.println("Scrolled to top");
		Thread.sleep(5000);

		System.out.println("********Lets click on cart button********");
		WebElement cartIcon = driver.findElement(By.xpath("//*[@class='cart-icon']"));
		cartIcon.isDisplayed();
		System.out.println("Cart icon is displayed");
		cartIcon.click();
		System.out.println("Clicked on cart button");
		Thread.sleep(3000);

		for (int i = 0; i < 1; i++) {
			JavascriptExecutor jsec1 = (JavascriptExecutor) driver;
			jsec1.executeScript("window.scrollBy(0,550)", "");
			Thread.sleep(1000);
			System.out.println("Scrolled time:-" + i);
		}
		Thread.sleep(3000);
		WebElement checkoutBtn = driver.findElement(By.xpath("(//a[contains(text(),'Checkout')])[2]"));
		checkoutBtn.isDisplayed();
		System.out.println("Checkout button is displayed");
		checkoutBtn.click();
		Thread.sleep(1000);

		for (int i = 0; i < 1; i++) {
			JavascriptExecutor jse1 = (JavascriptExecutor) driver;
			jse1.executeScript("window.scrollBy(0,250)", "");
			Thread.sleep(1000);
			System.out.println("Scrolled time:-" + i);
		}

		System.out.println("Entering user details");
		WebElement firstName = driver.findElement(By.xpath("(//*[@name=\"payment_address[firstname]\"])[2]"));
		firstName.sendKeys("hello");

		WebElement lastName = driver.findElement(By.xpath("(//input[@name='payment_address[lastname]'])[2]"));
		lastName.sendKeys("hello");

		WebElement email = driver.findElement(By.xpath("(//input[@name='payment_address[email]'])[2]"));
		email.sendKeys("hello@gmail.com");

		WebElement telephone = driver.findElement(By.xpath("(//input[@name='payment_address[telephone]'])[2]"));
		telephone.sendKeys("1236547890");

		WebElement flat = driver.findElement(By.xpath("(//input[@name='payment_address[address_2]'])[2]"));
		flat.sendKeys("abc");

		WebElement address = driver.findElement(By.xpath("(//input[@name='payment_address[address_1]'])[2]"));
		address.sendKeys("this is address");

		WebElement city = driver.findElement(By.xpath("(//input[@name='payment_address[city]'])[2]"));
		city.sendKeys("City");

		WebElement postCode = driver.findElement(By.xpath("(//input[@name='payment_address[postcode]'])[2]"));
		postCode.sendKeys("123456");

		Select selectStateDD = new Select(driver.findElement(By.xpath("(//*[@name='payment_address[zone_id]'])[2]")));
		selectStateDD.selectByVisibleText("Northern Territory");

		Select selectCountryDD = new Select(
				driver.findElement(By.xpath("(//*[@name='payment_address[country_id]'])[2]")));
		selectCountryDD.selectByVisibleText("Australia");

		for (int i = 0; i < 1; i++) {
			JavascriptExecutor jse2 = (JavascriptExecutor) driver;
			jse2.executeScript("window.scrollBy(0,550)", "");
			Thread.sleep(1000);
			System.out.println("Scrolled time:-" + i);
		}

		System.out.println("Entering credit card details");
		WebElement creditCardRadioBtn = driver.findElement(By.xpath("(//*[@name='payment_method'])[1]"));
		creditCardRadioBtn.click();

		WebElement ccHolder = driver.findElement(By.xpath("//input[@name=\"cc_holder\"]"));
		ccHolder.sendKeys("testingName");

		WebElement ccNumber = driver.findElement(By.xpath("//input[@name=\"cc_number\"]"));
		ccNumber.sendKeys("1236412326541236");

		Select ccExpDateDD = new Select(driver.findElement(By.xpath("//*[@name='cc_expire_date_month']")));
		ccExpDateDD.selectByVisibleText("03");

		Select ccExpYearDD = new Select(driver.findElement(By.xpath("//*[@name='cc_expire_date_year']")));
		ccExpYearDD.selectByVisibleText("2023");

		WebElement ccV = driver.findElement(By.xpath("//input[@name='cc_cvv2']"));
		ccV.sendKeys("123");

		for (int i = 0; i < 2; i++) {
			JavascriptExecutor jse3 = (JavascriptExecutor) driver;
			jse3.executeScript("window.scrollBy(0,550)", "");
			Thread.sleep(1000);
			System.out.println("Scrolled time:-" + i);
		}

		Select hearAboutDD = new Select(driver.findElement(By.id("dropdownHduSource")));
		hearAboutDD.selectByVisibleText("Google Ads");

		for (int i = 0; i < 1; i++) {
			JavascriptExecutor jse4 = (JavascriptExecutor) driver;
			jse4.executeScript("window.scrollBy(0,250)", "");
			Thread.sleep(1000);
			System.out.println("Scrolled time:-" + i);
		}

		WebElement orderComment = driver.findElement(By.xpath("//*[@name='comment']"));
		orderComment.sendKeys("Hurry...!!!");

		WebElement termsChkBox = driver.findElement(By.xpath("//input[@name='confirm_terms']"));
		termsChkBox.click();

		WebElement confirmOrderBtn = driver.findElement(By.xpath("//*[contains(text(),'CONFIRM ORDER')]"));

		// confirmOrderBtn.click();

	}

	@AfterClass
	public void tearDown() {
		// System.out.println("Stop driver");
		//driver.quit();
		// System.out.println("Stop appium service");
		// appiumService.stop();
		System.out.println("Closing and uninstalling the application");
	}
}
