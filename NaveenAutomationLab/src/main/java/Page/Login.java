package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Login extends Base.TestBase{
// GOFT3 User can be able to login the page
	
		@FindBy(xpath="//input[@placeholder='Email']")
		WebElement Email;
		
		@FindBy(xpath="//input[@id='password']")
		WebElement Password;
		
		@FindBy(xpath="//button[@type='submit']")
		WebElement Submit;

//Initializing the Page Objects:
	public Login(){
		PageFactory.initElements(driver, this);
	}
	public CreateCompany login(String em, String pwd) throws InterruptedException{
		Email.sendKeys(em);
		Password.sendKeys(pwd);
		Submit.click();
		/*JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();", loginBtn);*/
		Thread.sleep(2000);
		return new CreateCompany();
	}

}
