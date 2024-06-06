package PageObject;

import javax.swing.text.Document;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mmt.base.BaseClass;

public class LoginPageObject extends BaseClass {

	public LoginPageObject() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//img[@class = 'appendLeft15 mousePointer signInByEmailButton']")
	WebElement emailiconbtn;

	@FindBy(xpath = "//input[@class = 'font14 fullWidth']")
	WebElement emailaddressfield;

	@FindBy(xpath = "//*[text()='Continue']")
	WebElement continueBtn;

	@FindBy(xpath = "//a[@class='close']")
	WebElement popuppage;

	public void loginwithvalidcreds() throws InterruptedException {

		emailiconbtn.click();
		emailaddressfield.sendKeys("srjflk@gmail.com");

		waitforElementAppear(popuppage);
		popuppage.click();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("document.getElementById('continueBtn').click();");
		Thread.sleep(3000);
		System.out.println("click on btn");
		continueBtn.click();
		Thread.sleep(1000);
		continueBtn.click();

		System.out.println("btn clicked");
	}

	public void loginwithinvalidcreds() {
		emailiconbtn.click();
		emailaddressfield.sendKeys("srjflk1@gmail.com");
	}

}
