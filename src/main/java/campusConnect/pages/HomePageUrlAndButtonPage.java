package campusConnect.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePageUrlAndButtonPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//span[normalize-space()='University']")
	private WebElement FoxUniversityBtn;
	
	@FindBy(xpath = "//a[@class='navbar-btn btn btn-sm btn-primary ms-auto fs-sm']")
	private WebElement MyCartBtn;
	
	@FindBy(xpath = "//a[normalize-space()='Pre I20']")
	private WebElement preI20Btn;
	
	@FindBy(xpath = "//a[normalize-space()='Post I20']")
	private WebElement posti20Btn;
	
	@FindBy(xpath = "//a[normalize-space()='Visa Assistance']")
	private WebElement visaAssistantBtn;
	
	@FindBy(xpath = "//a[normalize-space()='Strategy']")
	private WebElement strategytBtn;
	
	@FindBy(xpath = "//a[normalize-space()='Adhoc']")
	private WebElement adhocBtn;
	
	@FindBy(xpath = "//a[normalize-space()='Login']")
	private WebElement loginBtn;
	
	@FindBy(xpath = "//a[normalize-space()='Signup']")
	private WebElement signupBtn;
	
	@FindBy(xpath = "//a[normalize-space()='mprod_prei20 two']")
	private WebElement preI20AllServicesScroll;
	@FindBy(xpath = "//div[@class='container']//a[@class='btn btn-primary rounded-0'][normalize-space()='All Service']")
	private WebElement preI20AllServicesBtn;
	
	@FindBy(xpath = "//a[normalize-space()='mprod_posti20']")
	private WebElement posti20AllServicesScroll;
	@FindBy(xpath = "//a[@class='btn btn-primary']")
	private WebElement posti20AllServicesBtn;
	
	@FindBy(xpath = "//div[@class='row']//h2[@class='mb-4']")
	private WebElement visaAssistAllServicesScroll;
	@FindBy(xpath = "//a[@href='/service/visaassist/all-services']")
	private WebElement visaAssistAllServicesBtn;
	
	@FindBy(xpath = "//h2[normalize-space()='Strategy Services']")
	private WebElement strategyServicesAllServicesScroll;
	@FindBy(xpath = "//a[@href='/service/strategy/all-services']")
	private WebElement strategyServicesAllServicesBtn;

	@FindBy(xpath = "//span[normalize-space()='info@yourdomain.com']")
	private WebElement policyFiledScroll;
	@FindBy(xpath = "//a[normalize-space()='Privacy Policy']")
	private WebElement privacyPolicyBtn;
	
	@FindBy(xpath = "//a[normalize-space()='Terms and Conditions']")
	private WebElement termsofUseBtn;
	
	@FindBy(xpath = "//a[normalize-space()='Cookie Policy']")
	private WebElement cookiePolicyBtn;

	@FindBy(xpath = "//a[normalize-space()='Donot Sell My Information (Bangladesh Rights)']")
	private WebElement donotSellMyInformationBtn;
	
	@FindBy(xpath = "//a[normalize-space()='Security Policy']")
	private WebElement securityPolicyBtn;
	
	@FindBy(xpath = "//a[normalize-space()='Cancellation & Refund Policy']")
	private WebElement cancellationRefundPolicyBtn;

	@FindBy(xpath = "//a[normalize-space()='Dispute & Refund Policy']")
	private WebElement disputeRefundPolicyBtn;

	@FindBy(xpath = "//a[normalize-space()='Payment Policy']")
	private WebElement paymentPolicyBtn;
	
	public HomePageUrlAndButtonPage(WebDriver driver) {	
		this.driver = driver;
		PageFactory.initElements(driver,this);	
	}
	
	public void foxUniversityButtonClick() throws InterruptedException {
		Thread.sleep(2000);
		FoxUniversityBtn.click();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://sbh72qol.dataflightit.com/");
		Thread.sleep(2000);
	}
	public void MyCartBtnClick() throws InterruptedException {
		Thread.sleep(2000);
		MyCartBtn.click();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://sbh72qol.dataflightit.com/cart/cart/home/mmh");
		Thread.sleep(2000);
	}
	public void preI20BtnClick() throws InterruptedException {
		Thread.sleep(2000);
		preI20Btn.click();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://sbh72qol.dataflightit.com/service/prei20/home");
		Thread.sleep(2000);
	}
	public void posti20BtnClick() throws InterruptedException {
		Thread.sleep(2000);
		posti20Btn.click();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://sbh72qol.dataflightit.com/service/posti20/home");
		Thread.sleep(2000);
	}
	public void visaAssistBtnClick() throws InterruptedException {
		Thread.sleep(2000);
		visaAssistantBtn.click();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://sbh72qol.dataflightit.com/service/visaassist/home");
		Thread.sleep(2000);
	}
	public void strategyBtnClick() throws InterruptedException {
		Thread.sleep(2000);
		strategytBtn.click();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://sbh72qol.dataflightit.com/service/strategy/home");
		Thread.sleep(2000);
	}
	public void adhocBtnClick() throws InterruptedException {
		Thread.sleep(2000);
		adhocBtn.click();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://sbh72qol.dataflightit.com/service/adhoc/home");
		Thread.sleep(2000);
	}
	public void loginBtnClick() throws InterruptedException {
		Thread.sleep(2000);
		loginBtn.click();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://sbh72qol.dataflightit.com/app/mmhauth/v2/signin");
		Thread.sleep(2000);
	}
	public void signupBtnClick() throws InterruptedException {
		Thread.sleep(2000);
		signupBtn.click();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://sbh72qol.dataflightit.com/app/mmhauth/v2/signup/request");
		Thread.sleep(2000);
	}
	
	public void preI20AllServicesBtnClick() throws InterruptedException {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebElement elementToScrollTo = preI20AllServicesScroll;
	    js.executeScript("arguments[0].scrollIntoView(true);", elementToScrollTo);
	    Thread.sleep(2000);
	    preI20AllServicesBtn.click();
	    String currentUrl = driver.getCurrentUrl();
	    Assert.assertEquals(currentUrl, "https://sbh72qol.dataflightit.com/service/prei20/all-services");
	    Thread.sleep(2000);
	}
	public void posti20AllServicesBtnClick() throws InterruptedException {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebElement elementToScrollTo = posti20AllServicesScroll;
	    js.executeScript("arguments[0].scrollIntoView(true);", elementToScrollTo);
	    Thread.sleep(2000);
	    posti20AllServicesBtn.click();
	    String currentUrl = driver.getCurrentUrl();
	    Assert.assertEquals(currentUrl, "https://sbh72qol.dataflightit.com/service/posti20/all-services");
	    Thread.sleep(2000);
	}
	public void visaAssistAllServicesBtnClick() throws InterruptedException {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebElement elementToScrollTo = visaAssistAllServicesScroll;
	    js.executeScript("arguments[0].scrollIntoView(true);", elementToScrollTo);
	    Thread.sleep(2000);
	    visaAssistAllServicesBtn.click();
	    String currentUrl = driver.getCurrentUrl();
	    Assert.assertEquals(currentUrl, "https://sbh72qol.dataflightit.com/service/visaassist/all-services");
	    Thread.sleep(2000);
	}
	public void strategyServicesAllServicesBtnClick() throws InterruptedException {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebElement elementToScrollTo = strategyServicesAllServicesScroll;
	    js.executeScript("arguments[0].scrollIntoView(true);", elementToScrollTo);
	    Thread.sleep(2000);
	    strategyServicesAllServicesBtn.click();
	    String currentUrl = driver.getCurrentUrl();
	    Assert.assertEquals(currentUrl, "https://sbh72qol.dataflightit.com/service/strategy/all-services");
	    Thread.sleep(2000);
	}
	public void privacyPolicyBtnClick() throws InterruptedException {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebElement elementToScrollTo = policyFiledScroll;
	    js.executeScript("arguments[0].scrollIntoView(true);", elementToScrollTo);
	    Thread.sleep(2000);
	    privacyPolicyBtn.click();
	    String currentUrl = driver.getCurrentUrl();
	    Assert.assertEquals(currentUrl, "https://sbh72qol.dataflightit.com/app/docs/legaldocs/privacy-policy");
	    Thread.sleep(2000);
	}
	public void termsofUseBtnClick() throws InterruptedException {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebElement elementToScrollTo = policyFiledScroll;
	    js.executeScript("arguments[0].scrollIntoView(true);", elementToScrollTo);
	    Thread.sleep(2000);
	    termsofUseBtn.click();
	    String currentUrl = driver.getCurrentUrl();
	    Assert.assertEquals(currentUrl, "https://sbh72qol.dataflightit.com/app/docs/legaldocs/terms-of-use");
	    Thread.sleep(2000);
	}
	public void coockiePolicyClick() throws InterruptedException {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebElement elementToScrollTo = policyFiledScroll;
	    js.executeScript("arguments[0].scrollIntoView(true);", elementToScrollTo);
	    Thread.sleep(2000);
	    cookiePolicyBtn.click();
	    String currentUrl = driver.getCurrentUrl();
	    Assert.assertEquals(currentUrl, "https://sbh72qol.dataflightit.com/app/docs/legaldocs/cookie-policy");
	    Thread.sleep(2000);
	}
	public void donotSellMyInformationBtnClick() throws InterruptedException {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebElement elementToScrollTo = policyFiledScroll;
	    js.executeScript("arguments[0].scrollIntoView(true);", elementToScrollTo);
	    Thread.sleep(2000);
	    donotSellMyInformationBtn.click();
	    String currentUrl = driver.getCurrentUrl();
	    Assert.assertEquals(currentUrl, "https://sbh72qol.dataflightit.com/app/docs/legaldocs/donot-sell-info");
	    Thread.sleep(2000);
	}
	public void securityPolicyBtnClick() throws InterruptedException {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebElement elementToScrollTo = policyFiledScroll;
	    js.executeScript("arguments[0].scrollIntoView(true);", elementToScrollTo);
	    Thread.sleep(2000);
	    securityPolicyBtn.click();
	    String currentUrl = driver.getCurrentUrl();
	    Assert.assertEquals(currentUrl, "https://sbh72qol.dataflightit.com/app/docs/legaldocs/security-policy");
	    Thread.sleep(2000);
	}
	public void cancellationRefundPolicyBtnClick() throws InterruptedException {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebElement elementToScrollTo = policyFiledScroll;
	    js.executeScript("arguments[0].scrollIntoView(true);", elementToScrollTo);
	    Thread.sleep(2000);
	    cancellationRefundPolicyBtn.click();
	    String currentUrl = driver.getCurrentUrl();
	    Assert.assertEquals(currentUrl, "https://sbh72qol.dataflightit.com/app/docs/legaldocs/cancel-and-refund-policy");
	    Thread.sleep(2000);
	}
	public void disputeRefundPolicyBtnClick() throws InterruptedException {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebElement elementToScrollTo = policyFiledScroll;
	    js.executeScript("arguments[0].scrollIntoView(true);", elementToScrollTo);
	    Thread.sleep(2000);
	    disputeRefundPolicyBtn.click();
	    String currentUrl = driver.getCurrentUrl();
	    Assert.assertEquals(currentUrl, "https://sbh72qol.dataflightit.com/app/docs/legaldocs/dispute-and-refund-policy");
	    Thread.sleep(2000);
	}
	public void paymentPolicyBtnClick() throws InterruptedException {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebElement elementToScrollTo = policyFiledScroll;
	    js.executeScript("arguments[0].scrollIntoView(true);", elementToScrollTo);
	    Thread.sleep(2000);
	    paymentPolicyBtn.click();
	    String currentUrl = driver.getCurrentUrl();
	    Assert.assertEquals(currentUrl, "https://sbh72qol.dataflightit.com/app/docs/legaldocs/payment-policy");
	    Thread.sleep(2000);
	}
}
