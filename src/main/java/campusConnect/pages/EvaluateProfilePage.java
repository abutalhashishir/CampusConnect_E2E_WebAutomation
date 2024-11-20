package campusConnect.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EvaluateProfilePage {

	WebDriver driver;
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	private WebElement fristName;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	private WebElement lastName;
	
	@FindBy(xpath="//select[@class='form-control']")
	private WebElement selectCourse;
	
	@FindBy(xpath="//input[@placeholder='Phone']")
	private WebElement phoneNumber;
	
	@FindBy(xpath="//textarea[@placeholder='Message']")
	private WebElement message;
	
	@FindBy(xpath="//input[@value='Request A Quote']")
	private WebElement requestToQuoteBTN;
	
	public EvaluateProfilePage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);	
	}
	
	public void EvaluateProfile(String FristNameText,String LastNameText, String PhoneNumberText, String MessageText) throws InterruptedException {
		
		fristName.sendKeys(FristNameText);
		Thread.sleep(2000);
		lastName.sendKeys(LastNameText);
		Thread.sleep(2000);
		Select select = new Select(selectCourse);
		Thread.sleep(2000);
        select.selectByVisibleText("Music Lesson");
        Thread.sleep(2000);
		phoneNumber.sendKeys(PhoneNumberText);
		Thread.sleep(2000);
		message.sendKeys(MessageText);
		Thread.sleep(2000);
		requestToQuoteBTN.click();
		Thread.sleep(2000);
		
		
	}
}
