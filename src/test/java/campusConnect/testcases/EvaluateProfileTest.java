package campusConnect.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import campusConnect.base.Base;
import campusConnect.pages.EvaluateProfilePage;


public class EvaluateProfileTest extends Base {
    
    EvaluateProfilePage evaluateProfilePage;

    public EvaluateProfileTest() {
        super();
    }

    public WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = initializeBrowserAndOpenApplicationURL(prop.getProperty("browserName"));
        evaluateProfilePage = new EvaluateProfilePage(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test(priority = 1)
    public void EvaluateYourProfile() throws InterruptedException {
        evaluateProfilePage.EvaluateProfile(dataProp.getProperty("FristName"), dataProp.getProperty("LastName"), dataProp.getProperty("PhoneNumber"), dataProp.getProperty("Message"));
    }
}