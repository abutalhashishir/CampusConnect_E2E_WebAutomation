package campusConnect.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import campusConnect.base.Base;
import campusConnect.pages.StrategyPage;

public class StrategyTest extends Base {
    
    StrategyPage strategyPage;

    public StrategyTest() {
        super();
    }

    public WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = initializeBrowserAndOpenApplicationURL(prop.getProperty("browserName"));
        strategyPage = new StrategyPage(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test(priority = 1)
    public void strategyProductAddToCartTest() throws InterruptedException {
    	strategyPage.strategyAddToCartProduct();
		Assert.assertTrue(strategyPage.retriveAddToCartSuccessMessage().contains(dataProp.getProperty("strategyAddddToCartSuccessfullyHeading")), "Add to Cart Product is not displayed in the search results");

    }
}