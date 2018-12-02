package pagetest;

import org.testng.annotations.Test;

import pages.MobilePage;
import test.BaseTestCase;

public class MobilePageTest extends BaseTestCase {

    @Test
    public void testAddToCart(){
        MobilePage mobilePage = new MobilePage(driver);
        mobilePage.start();
        mobilePage.addToCart();
    }
}
