package campusConnect.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import campusConnect.base.Base;
import campusConnect.pages.PostI20Page;

public class postI20Test extends Base {
    
    PostI20Page postI20Page;

    public postI20Test() {
        super();
    }

    public WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = initializeBrowserAndOpenApplicationURL(prop.getProperty("browserName"));
        postI20Page = new PostI20Page(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test(priority = 1)
    public void postI20ProductAddToCartTest() throws InterruptedException {
    	postI20Page.postI20AddToCartProduct();
		Assert.assertTrue(postI20Page.retriveAddToCartSuccessMessage().contains(dataProp.getProperty("postI20AddddToCartSuccessfullyHeading")), "Add to Cart Product is not displayed in the search results");

    }
}
