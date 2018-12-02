package test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import dataAccess.UserDataAccess;
import models.User;
import pages.CreateNewCustomerAccountPage;

public class TestCase05 extends BaseTestCase {
   @Test
   public void verifyMobileListPage() {
          driver.get("http://live.guru99.com/");
          
          driver.findElement(By.cssSelector("div.account-cart-wrapper > a")).click();
          driver.findElement(By.cssSelector("a[title=\"My Account\"]")).click();
          driver.findElement(By.cssSelector("a[title=\"Create an Account\"]")).click();
          
          CreateNewCustomerAccountPage accountPage = new CreateNewCustomerAccountPage(driver);
          UserDataAccess userDataAccess = new UserDataAccess();
          User newUser = userDataAccess.getUser();
          accountPage.createAccount(newUser);
          
          Assert.assertTrue(accountPage.isRedirected());
          Reporter.log("email registered is: " + newUser.email);
          
          driver.findElement(By.linkText("TV")).click();
          driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[1]/div/div[3]/ul/li[1]/a")).click();
          driver.findElement(By.cssSelector("button[title=\"Share Wishlist\"]")).click();
          driver.findElement(By.id("email_address")).sendKeys("test@example.com");;
          driver.findElement(By.id("message")).sendKeys("ok");
          driver.findElement(By.cssSelector("button[title=\"Share Wishlist\"]")).click();
          
          Reporter.log("Page after share Wishlist: " + driver.getTitle());
          Assert.assertEquals(driver.getTitle(), "My Wishlist");
          String message = driver.findElement(By.cssSelector("ul.messages > li")).getText();
          Reporter.log("Message after share wishlist is: " + message);
          Assert.assertEquals(message, "Your Wishlist has been shared.");
   }
}
