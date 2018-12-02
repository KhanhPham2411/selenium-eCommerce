package test;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import org.openqa.selenium.TakesScreenshot;

public class BaseTestCase {
	protected WebDriver driver;
	
	@BeforeTest
	public void launch() {
		System.setProperty("webdriver.chrome.driver","E:\\Personal\\Jobs\\20180824 Shopee\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}
	
	@AfterTest
	public void quit() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	  
	@AfterMethod
	public void onFailure(ITestResult testResult) throws IOException {
		if (testResult.getStatus() == ITestResult.FAILURE) {
			// take screenShot
			System.out.println(testResult.getStatus());
			String fileName = "E:\\Temp\\test-failed\\" + testResult.getName() + "-" 
				+ Arrays.toString(testResult.getParameters());
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File(fileName + ".jpg"));
			
			// capture html
			String pageSource = driver.getPageSource();

			File f = new File(fileName + ".html");
			FileWriter writer = new FileWriter(f, false);
			writer.write(pageSource);
			System.out.println("Report Created is in Location : " + f.getAbsolutePath());
			writer.close();
		}        
	}
}
