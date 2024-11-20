package campusConnect.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import campusConnect.base.Base;
import campusConnect.pages.HomeButtonPage;

public class HomeButtonTest extends Base {
    
    HomeButtonPage homeButtonPage;

    public HomeButtonTest() {
        super();
    }

    public WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = initializeBrowserAndOpenApplicationURL(prop.getProperty("browserName"));
        homeButtonPage = new HomeButtonPage(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test(priority = 1)
    public void foxUniversityButton() throws InterruptedException {
    	homeButtonPage.foxUniversityButtonClick();
    }
    @Test(priority = 2)
    public void MyCartButton() throws InterruptedException {
    	homeButtonPage.MyCartBtnClick();
    }
    @Test(priority = 3)
    public void preI20Button() throws InterruptedException {
    	homeButtonPage.preI20BtnClick();
    }
    @Test(priority = 4)
    public void posti20Button() throws InterruptedException {
    	homeButtonPage.posti20BtnClick();
    }
    @Test(priority = 5)
    public void visaAssistButton() throws InterruptedException {
    	homeButtonPage.visaAssistBtnClick();
    }
    @Test(priority = 6)
    public void strategyButton() throws InterruptedException {
    	homeButtonPage.strategyBtnClick();
    }
    @Test(priority = 7)
    public void adhocButton() throws InterruptedException {
    	homeButtonPage.adhocBtnClick();
    }
    @Test(priority = 8)
    public void loginButton() throws InterruptedException {
    	homeButtonPage.loginBtnClick();
    }
    @Test(priority = 9)
    public void signupButton() throws InterruptedException {
    	homeButtonPage.signupBtnClick();
    }
    @Test(priority = 10)
    public void preI20AllServicesButton() throws InterruptedException {
    	homeButtonPage.preI20AllServicesBtnClick();
    }
    @Test(priority = 11)
    public void posti20AllServicesButton() throws InterruptedException {
    	homeButtonPage.posti20AllServicesBtnClick();
    }
    @Test(priority = 12)
    public void visaAssistAllServicesButton() throws InterruptedException {
    	homeButtonPage.visaAssistAllServicesBtnClick();
    }
    @Test(priority = 13)
    public void strategyServicesAllServicesButton() throws InterruptedException {
    	homeButtonPage.strategyServicesAllServicesBtnClick();
    }
    @Test(priority = 14)
    public void privacyPolicyButton() throws InterruptedException {
    	homeButtonPage.privacyPolicyBtnClick();
    }
    @Test(priority = 15)
    public void termsofUseButton() throws InterruptedException {
    	homeButtonPage.termsofUseBtnClick();
    }
    @Test(priority = 16)
    public void coockiePolicyButton() throws InterruptedException {
    	homeButtonPage.coockiePolicyClick();
    }
    @Test(priority = 17)
    public void donotSellMyInformationButton() throws InterruptedException {
    	homeButtonPage.donotSellMyInformationBtnClick();
    }
    @Test(priority = 18)
    public void securityPolicyButton() throws InterruptedException {
    	homeButtonPage.securityPolicyBtnClick();
    }
    @Test(priority = 19)
    public void cancellationRefundPolicyButton() throws InterruptedException {
    	homeButtonPage.cancellationRefundPolicyBtnClick();
    }
    @Test(priority = 20)
    public void disputeRefundPolicyButton() throws InterruptedException {
    	homeButtonPage.disputeRefundPolicyBtnClick();
    }
    @Test(priority = 21)
    public void paymentPolicy() throws InterruptedException {
    	homeButtonPage.paymentPolicyBtnClick();
    }
}