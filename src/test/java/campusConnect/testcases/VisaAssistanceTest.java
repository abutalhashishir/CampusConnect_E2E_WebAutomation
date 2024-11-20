package campusConnect.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import campusConnect.base.Base;
import campusConnect.pages.VisaAssistancePage;

public class VisaAssistanceTest extends Base {
    
    VisaAssistancePage visaAssistancePage;

    public VisaAssistanceTest() {
        super();
    }

    public WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = initializeBrowserAndOpenApplicationURL(prop.getProperty("browserName"));
        visaAssistancePage = new VisaAssistancePage(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test(priority = 1)
    public void visaAssistanceProductAddToCartTest() throws InterruptedException {
    	visaAssistancePage.VisaAssistanceAddToCartProduct();
		Assert.assertTrue(visaAssistancePage.retriveAddToCartSuccessMessage().contains(dataProp.getProperty("visaAssistanceAddddToCartSuccessfullyHeading")), "Add to Cart Product is not displayed in the search results");

    }
}