package pageunitest;

import org.testng.annotations.BeforeTest;

import helper.ResourceHelper;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class BaseUnitTestCase {
	protected WebDriver driver;
	protected ResourceHelper resourceHelper = new ResourceHelper();
	protected JavascriptExecutor executor;
	
	@BeforeTest
	public void launch() {
		String chromeDriverPath = resourceHelper.getAbsolutePath("driver/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);

		// Add options to Google Chrome. The window-size is important for responsive sites
		ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
		options.addArguments("window-size=1200x600");
		
		driver = new ChromeDriver(options);

		executor = (JavascriptExecutor)driver;
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		String className = getClass().getSimpleName().replace("UnitTest", "");
		String resourcePath = "pages/" + className + ".html"; 

		driver.get("file://" + resourceHelper.getAbsolutePath(resourcePath));
	}

	@AfterTest
	public void quit() throws InterruptedException {
		driver.quit();
	}
}
