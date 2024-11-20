package campusConnect.testcases;

import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import campusConnect.base.Base;
import campusConnect.pages.HomePageUrlAndButtonPage;

public class HomePageUrlAndButtonTest extends Base {
	
	

    HomePageUrlAndButtonPage homePageUrlAndButtonPage;

    public HomePageUrlAndButtonTest() {
        super();
    }
    
    public WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = initializeBrowserAndOpenApplicationURL(prop.getProperty("browserName"));
        homePageUrlAndButtonPage = new HomePageUrlAndButtonPage(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
   
    
    private static void saveFailUrlToFile(String testName, String failUrl) {
        String filePath = System.getProperty("user.dir") + "\\failurl.txt";
        System.out.println("File path: " + filePath);

        try (FileWriter writer = new FileWriter(filePath, true)) {
            writer.write(testName + "=" + failUrl + "\n");
            System.out.println("Fail URL saved to " + filePath);
        } catch (IOException e) {
            System.err.println("Error saving fail URL to file: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("An unexpected exception occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }

    
    
    @Test(priority = 0)
    public void TotalLinkTest() throws InterruptedException {
        List<WebElement> alltags = driver.findElements(By.tagName("a"));
        System.out.println("Total anchor tags are: " + alltags.size());
        
        for(int i=0;i<alltags.size();i++)
        {
        	System.out.println("Link on page are "+alltags.get(i).getAttribute("href"));
        	System.out.println("Link on page are "+alltags.get(i).getText());

        }
        
    }
    @Test(priority = 1)
    public void foxUniversityButton() throws InterruptedException {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));

        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='summary']")));
            Assert.fail("Test case failed: Element with xpath '//div[@id='summary']' is present.");
        } catch (TimeoutException e) {
            System.out.println("Test case passed: Element with xpath '//div[@id='summary']' is not present.");
        } catch (Throwable t) {
            System.out.println("An unexpected throwable occurred: " + t.getMessage());
            t.printStackTrace();
            saveFailUrlToFile("foxUniversityButton", driver.getCurrentUrl());
        }
    }
    @Test(priority = 2)
    public void MyCartButton() throws InterruptedException {
    	homePageUrlAndButtonPage.MyCartBtnClick();
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='summary']")));
            Assert.fail("Test case failed: Element with xpath '//div[@id='summary']' is present.");
        } catch (TimeoutException e) {
            System.out.println("Test case passed: Element with xpath '//div[@id='summary']' is not present.");
        } catch (Throwable t) {
            System.out.println("An unexpected throwable occurred: " + t.getMessage());
            t.printStackTrace();
            saveFailUrlToFile("MyCartButton", driver.getCurrentUrl());
        }
    }
    @Test(priority = 3)
    public void preI20Button() throws InterruptedException {
    	homePageUrlAndButtonPage.preI20BtnClick();
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='summary']")));
            Assert.fail("Test case failed: Element with xpath '//div[@id='summary']' is present.");
        } catch (TimeoutException e) {
            System.out.println("Test case passed: Element with xpath '//div[@id='summary']' is not present.");
        } catch (Throwable t) {
            System.out.println("An unexpected throwable occurred: " + t.getMessage());
            t.printStackTrace();
            saveFailUrlToFile("preI20Button", driver.getCurrentUrl());
        }
        
    }
    @Test(priority = 4)
    public void posti20Button() throws InterruptedException {
    	homePageUrlAndButtonPage.posti20BtnClick();
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='summary']")));
            Assert.fail("Test case failed: Element with xpath '//div[@id='summary']' is present.");
        } catch (TimeoutException e) {
            System.out.println("Test case passed: Element with xpath '//div[@id='summary']' is not present.");
        } catch (Throwable t) {
            System.out.println("An unexpected throwable occurred: " + t.getMessage());
            t.printStackTrace();
            saveFailUrlToFile("posti20Button", driver.getCurrentUrl());
        }
    
    }
    @Test(priority = 5)
    public void visaAssistButton() throws InterruptedException {
    	homePageUrlAndButtonPage.visaAssistBtnClick();
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='summary']")));
            Assert.fail("Test case failed: Element with xpath '//div[@id='summary']' is present.");
        } catch (TimeoutException e) {
            System.out.println("Test case passed: Element with xpath '//div[@id='summary']' is not present.");
        } catch (Throwable t) {
            System.out.println("An unexpected throwable occurred: " + t.getMessage());
            t.printStackTrace();
            saveFailUrlToFile("visaAssistButton", driver.getCurrentUrl());
        }
    }
    @Test(priority = 6)
    public void strategyButton() throws InterruptedException {
    	homePageUrlAndButtonPage.strategyBtnClick();
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='summary']")));
            Assert.fail("Test case failed: Element with xpath '//div[@id='summary']' is present.");
        } catch (TimeoutException e) {
            System.out.println("Test case passed: Element with xpath '//div[@id='summary']' is not present.");
        } catch (Throwable t) {
            System.out.println("An unexpected throwable occurred: " + t.getMessage());
            t.printStackTrace();
            saveFailUrlToFile("strategyButton", driver.getCurrentUrl());
        }
    }
    @Test(priority = 7)
    public void adhocButton() throws InterruptedException {
        homePageUrlAndButtonPage.adhocBtnClick();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='summary']")));
            Assert.fail("Test case failed: Element with xpath '//div[@id='summary']' is present.");
        } catch (TimeoutException e) {
            System.out.println("Test case passed: Element with xpath '//div[@id='summary']' is not present.");
        } catch (Throwable t) {
            System.out.println("An unexpected throwable occurred: " + t.getMessage());
            t.printStackTrace();
            saveFailUrlToFile("adhocButton", driver.getCurrentUrl());
        }
    }

    @Test(priority = 8)
    public void loginButton() throws InterruptedException {
    	homePageUrlAndButtonPage.loginBtnClick();
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='summary']")));
            Assert.fail("Test case failed: Element with xpath '//div[@id='summary']' is present.");
        } catch (TimeoutException e) {
            System.out.println("Test case passed: Element with xpath '//div[@id='summary']' is not present.");
        } catch (Throwable t) {
            System.out.println("An unexpected throwable occurred: " + t.getMessage());
            t.printStackTrace();
            saveFailUrlToFile("loginButton", driver.getCurrentUrl());
        }
    }
    @Test(priority = 9)
    public void signupButton() throws InterruptedException {
    	homePageUrlAndButtonPage.signupBtnClick();
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='summary']")));
            Assert.fail("Test case failed: Element with xpath '//div[@id='summary']' is present.");
        } catch (TimeoutException e) {
            System.out.println("Test case passed: Element with xpath '//div[@id='summary']' is not present.");
        } catch (Throwable t) {
            System.out.println("An unexpected throwable occurred: " + t.getMessage());
            t.printStackTrace();
            saveFailUrlToFile("signupButton", driver.getCurrentUrl());
        }
    }
    @Test(priority = 10)
    public void preI20AllServicesButton() throws InterruptedException {
    	homePageUrlAndButtonPage.preI20AllServicesBtnClick();
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='summary']")));
            Assert.fail("Test case failed: Element with xpath '//div[@id='summary']' is present.");
        } catch (TimeoutException e) {
            System.out.println("Test case passed: Element with xpath '//div[@id='summary']' is not present.");
        } catch (Throwable t) {
            System.out.println("An unexpected throwable occurred: " + t.getMessage());
            t.printStackTrace();
            saveFailUrlToFile("preI20AllServicesButton", driver.getCurrentUrl());
        }
    }
    @Test(priority = 11)
    public void posti20AllServicesButton() throws InterruptedException {
    	homePageUrlAndButtonPage.posti20AllServicesBtnClick();
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='summary']")));
            Assert.fail("Test case failed: Element with xpath '//div[@id='summary']' is present.");
        } catch (TimeoutException e) {
            System.out.println("Test case passed: Element with xpath '//div[@id='summary']' is not present.");
        } catch (Throwable t) {
            System.out.println("An unexpected throwable occurred: " + t.getMessage());
            t.printStackTrace();
            saveFailUrlToFile("posti20AllServicesButton", driver.getCurrentUrl());
        }
    }
    @Test(priority = 12)
    public void visaAssistAllServicesButton() throws InterruptedException {
    	homePageUrlAndButtonPage.visaAssistAllServicesBtnClick();
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='summary']")));
            Assert.fail("Test case failed: Element with xpath '//div[@id='summary']' is present.");
        } catch (TimeoutException e) {
            System.out.println("Test case passed: Element with xpath '//div[@id='summary']' is not present.");
        } catch (Throwable t) {
            System.out.println("An unexpected throwable occurred: " + t.getMessage());
            t.printStackTrace();
            saveFailUrlToFile("visaAssistAllServicesButton", driver.getCurrentUrl());
        }
    }
    @Test(priority = 13)
    public void strategyServicesAllServicesButton() throws InterruptedException {
    	homePageUrlAndButtonPage.strategyServicesAllServicesBtnClick();
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='summary']")));
            Assert.fail("Test case failed: Element with xpath '//div[@id='summary']' is present.");
        } catch (TimeoutException e) {
            System.out.println("Test case passed: Element with xpath '//div[@id='summary']' is not present.");
        } catch (Throwable t) {
            System.out.println("An unexpected throwable occurred: " + t.getMessage());
            t.printStackTrace();
            saveFailUrlToFile("strategyServicesAllServicesButton", driver.getCurrentUrl());
        }
    }
    @Test(priority = 14)
    public void privacyPolicyButton() throws InterruptedException {
    	homePageUrlAndButtonPage.privacyPolicyBtnClick();
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='summary']")));
            Assert.fail("Test case failed: Element with xpath '//div[@id='summary']' is present.");
        } catch (TimeoutException e) {
            System.out.println("Test case passed: Element with xpath '//div[@id='summary']' is not present.");
        } catch (Throwable t) {
            System.out.println("An unexpected throwable occurred: " + t.getMessage());
            t.printStackTrace();
            saveFailUrlToFile("privacyPolicyButton", driver.getCurrentUrl());
        }
    }
    @Test(priority = 15)
    public void termsofUseButton() throws InterruptedException {
    	homePageUrlAndButtonPage.termsofUseBtnClick();
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='summary']")));
            Assert.fail("Test case failed: Element with xpath '//div[@id='summary']' is present.");
        } catch (TimeoutException e) {
            System.out.println("Test case passed: Element with xpath '//div[@id='summary']' is not present.");
        } catch (Throwable t) {
            System.out.println("An unexpected throwable occurred: " + t.getMessage());
            t.printStackTrace();
            saveFailUrlToFile("termsofUseButton", driver.getCurrentUrl());
        }
    }
    @Test(priority = 16)
    public void coockiePolicyButton() throws InterruptedException {
    	homePageUrlAndButtonPage.coockiePolicyClick();
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='summary']")));
            Assert.fail("Test case failed: Element with xpath '//div[@id='summary']' is present.");
        } catch (TimeoutException e) {
            System.out.println("Test case passed: Element with xpath '//div[@id='summary']' is not present.");
        } catch (Throwable t) {
            System.out.println("An unexpected throwable occurred: " + t.getMessage());
            t.printStackTrace();
            saveFailUrlToFile("coockiePolicyButton", driver.getCurrentUrl());
        }
    }
    
    @Test(priority = 17)
    public void donotSellMyInformationButton() throws InterruptedException {
    	homePageUrlAndButtonPage.donotSellMyInformationBtnClick();
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='summary']")));
            Assert.fail("Test case failed: Element with xpath '//div[@id='summary']' is present.");
        } catch (TimeoutException e) {
            System.out.println("Test case passed: Element with xpath '//div[@id='summary']' is not present.");
        } catch (Throwable t) {
            System.out.println("An unexpected throwable occurred: " + t.getMessage());
            t.printStackTrace();
            saveFailUrlToFile("donotSellMyInformationButton", driver.getCurrentUrl());
        }
    }
    @Test(priority = 18)
    public void securityPolicyButton() throws InterruptedException {
    	homePageUrlAndButtonPage.securityPolicyBtnClick();
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='summary']")));
            Assert.fail("Test case failed: Element with xpath '//div[@id='summary']' is present.");
        } catch (TimeoutException e) {
            System.out.println("Test case passed: Element with xpath '//div[@id='summary']' is not present.");
        } catch (Throwable t) {
            System.out.println("An unexpected throwable occurred: " + t.getMessage());
            t.printStackTrace();
            saveFailUrlToFile("securityPolicyButton", driver.getCurrentUrl());
        }
    }
    @Test(priority = 19)
    public void cancellationRefundPolicyButton() throws InterruptedException {
    	homePageUrlAndButtonPage.cancellationRefundPolicyBtnClick();
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='summary']")));
            Assert.fail("Test case failed: Element with xpath '//div[@id='summary']' is present.");
        } catch (TimeoutException e) {
            System.out.println("Test case passed: Element with xpath '//div[@id='summary']' is not present.");
        } catch (Throwable t) {
            System.out.println("An unexpected throwable occurred: " + t.getMessage());
            t.printStackTrace();
            saveFailUrlToFile("cancellationRefundPolicyButton", driver.getCurrentUrl());
        }
    }
    @Test(priority = 20)
    public void disputeRefundPolicyButton() throws InterruptedException {
    	homePageUrlAndButtonPage.disputeRefundPolicyBtnClick();
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='summary']")));
            Assert.fail("Test case failed: Element with xpath '//div[@id='summary']' is present.");
        } catch (TimeoutException e) {
            System.out.println("Test case passed: Element with xpath '//div[@id='summary']' is not present.");
        } catch (Throwable t) {
            System.out.println("An unexpected throwable occurred: " + t.getMessage());
            t.printStackTrace();
            saveFailUrlToFile("disputeRefundPolicyButton", driver.getCurrentUrl());
        }
    }
    @Test(priority = 21)
    public void paymentPolicy() throws InterruptedException {
    	homePageUrlAndButtonPage.paymentPolicyBtnClick();
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='summary']")));
            Assert.fail("Test case failed: Element with xpath '//div[@id='summary']' is present.");
        } catch (TimeoutException e) {
            System.out.println("Test case passed: Element with xpath '//div[@id='summary']' is not present.");
        } catch (Throwable t) {
            System.out.println("An unexpected throwable occurred: " + t.getMessage());
            t.printStackTrace();
            saveFailUrlToFile("paymentPolicy", driver.getCurrentUrl());
        }
    }
}
