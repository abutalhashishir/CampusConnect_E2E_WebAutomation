package campusConnect.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PostI20Page {
	
	WebDriver driver;
	
	@FindBy(xpath="//a[normalize-space()='Post I20']")
	private WebElement postI20Btn;
	
	@FindBy(xpath="//h1[normalize-space()='Service List']")
	private WebElement scroll1;
	
	@FindBy(xpath="//a[normalize-space()='Mprod_posti20']")
	private WebElement productBtn;
	
	@FindBy(xpath="//span[@class='fw-bolder']")
	private WebElement scroll2;
	
	@FindBy(xpath="//input[@id='6']")
	private WebElement serviceBtn1;
	
	@FindBy(xpath="//h2[@class='text-primary fs-sm fw-bolder']")
	private WebElement serviceBtn2;
	
	@FindBy(xpath="//p[@class='mb-0 fw-bold']//input[@id='1']")
	private WebElement serviceBtn3;
	
	@FindBy(xpath="//input[@id='2']")
	private WebElement deliveryOption;
	
	@FindBy(xpath="//button[@class='card-link btn btn-primary btn-xs rounded-1']")
	private WebElement addToCartBtn;

	@FindBy(xpath="//a[@class='navbar-brand']")
	private WebElement scroll3;
	
	@FindBy(xpath="//i[@class='fe fe-shopping-cart px-1']")
	private WebElement myCartBtn;
	
	@FindBy(xpath="//h5[normalize-space()='Mprod_posti20']")
	private WebElement postI20AddToCartSuccessHeading;
	
	
	public PostI20Page(WebDriver driver) {    
        this.driver = driver;
        PageFactory.initElements(driver, this);    
    }
	
	public void postI20AddToCartProduct() throws InterruptedException {
		postI20Btn.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebElement sa = scroll1;
	    js.executeScript("arguments[0].scrollIntoView(true);", sa);
	    Thread.sleep(2000);
	    productBtn.click();
	    Thread.sleep(2000);
	    JavascriptExecutor js1 = (JavascriptExecutor) driver;
	    WebElement sb = scroll2;
	    js1.executeScript("arguments[0].scrollIntoView(true);", sb);
	    Thread.sleep(2000);
	    serviceBtn1.click();
	    Thread.sleep(2000);
	    serviceBtn2.click();
	    Thread.sleep(2000);
	    
	    deliveryOption.click();
	    Thread.sleep(2000);
	    addToCartBtn.click();
	    Thread.sleep(2000);
	    JavascriptExecutor js2 = (JavascriptExecutor) driver;
	    WebElement sc = scroll3;
	    js2.executeScript("arguments[0].scrollIntoView(true);", sc);
	    Thread.sleep(2000);
	    myCartBtn.click();
	    Thread.sleep(5000);
    }
	
	public String retriveAddToCartSuccessMessage() {
		
		String addToCartSuccessfullyHeadingText = postI20AddToCartSuccessHeading.getText();
		return addToCartSuccessfullyHeadingText;

	}
}