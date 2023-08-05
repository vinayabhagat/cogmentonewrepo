package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.UtilClass;

public class LoginPage extends BaseClass {
	
	@FindBy(name="email")
	private WebElement email ;
	
	@FindBy(name="password")
	private WebElement password ;
	
	@FindBy(xpath="//div[text()='Login']")
	private WebElement Login ;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginFunctionality(String Email,String pass)
	{
      UtilClass.sendKeys(email, Email);
      UtilClass.sendKeys(password, pass);
     
	}
	
	public void clickOnLogin()
	{
		 UtilClass.click(Login);
	}
	

}
