package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPageObjects {
	public AccountPageObjects(WebDriver driver) {
	     PageFactory.initElements(driver, this);
	 }

//Account new Xpath

@FindBy(xpath = "//a[text()='Join now']") 
	 private WebElement joinnow;
  
  @FindBy(xpath = "//*[@id=\"first-name\"]") 
	 private WebElement firstname;
  
  @FindBy(xpath = "//*[@id=\"last-name\"]") 
	 private WebElement lastname;
  
  @FindBy(xpath = "//*[@id=\"join-email\"]") 
	 private WebElement email;
  
  @FindBy(xpath = "//*[@id=\"join-password\"]") 
	 private WebElement password;
  
  @FindBy(xpath = "//*[@id=\"submit-join-form-text\"]") 
	 private WebElement agreejoin;
  
  //Account new method implementation
  public void join_now() {
		joinnow.click();
		 }
  public void enterFirstName(String Firstname) {
	  firstname.sendKeys(Firstname);
	}
  public void enter_LasttName(String Lastname) {
	  lastname.sendKeys(Lastname);
	}
  public void password(String pwd) {
	  password.sendKeys(pwd);
	}
  public void email(String email1) {
	  email.sendKeys(email1);
	}
  public void submitbtn() {
	  agreejoin.click();
	}




}
