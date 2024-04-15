package Pagepkg;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.etzy.Baseclass.Baseclass;
import com.etzy.actiondriver.Action;

public class Loginpage extends Baseclass {
		
		Action action= new Action();
		
		
		
		@FindBy(xpath="//*[@id=\"gnav-header-inner\"]/div[3]/nav/ul/li[1]/button")
		WebElement AccountLink;
		
		@FindBy(xpath="//*[@id=\"join_neu_email_field\"]")
	    WebElement zetuserName;
		
		@FindBy(xpath="//*[@id=\"join_neu_password_field\"]")
		 WebElement zetpassword;

		@FindBy(xpath="//*[@id=\"join-neu-form\"]/div[1]/div/div[7]/div/button")
		private WebElement signInBtn;
		
		
		
		public Homepage login(String uname, String pswd,Homepage homePage) throws Throwable {
			Action.scrollByVisibilityOfElement(getDriver(), zetuserName);
			Action.type(zetuserName, uname);
			Action.type(zetpassword, pswd);
			Action.JSClick(getDriver(), signInBtn);
			Thread.sleep(2000);
			homePage=new Homepage();
			return homePage;
		}

	
}
