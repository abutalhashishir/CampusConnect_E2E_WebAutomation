package campusConnect.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import campusConnect.base.Base;
import campusConnect.pages.PreI20Page;

public class PreI20Test extends Base {
    
    PreI20Page preI20Page;

    public PreI20Test() {
        super();
    }

    public WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = initializeBrowserAndOpenApplicationURL(prop.getProperty("browserName"));
        preI20Page = new PreI20Page(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test(priority = 1)
    public void preI20ProductAddToCartTest() throws InterruptedException {
        preI20Page.preI20AddToCartProduct();
		Assert.assertTrue(preI20Page.retriveAddToCartSuccessMessage().contains(dataProp.getProperty("preI20AddddToCartSuccessfullyHeading")), "Add to Cart Product is not displayed in the search results");

    }
}
