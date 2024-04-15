package Pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.etzy.actiondriver.Action;

public class Homepage {


	@FindBy(xpath="//*[@id=\"global-enhancements-search-query\"]")
	WebElement SearchBox;
	
	@FindBy(xpath = "//*[@id=\"gnav-search\"]/div/div[1]/button[2]/span/svg")
	WebElement Searchbutton;
	
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div[3]/div[12]/div[2]/div[9]/div[1]/div/div/ol/li[1]/div/div/a/div[1]/div/div/div/img")
	WebElement Homefavourite;
	
	@FindBy(xpath = "//*[@id=\"listing-page-cart\"]/div[6]/div[1]/div[1]/div[2]/div/div/div[1]")
	WebElement quantity;
	
	@FindBy(xpath = "//*[@id=\"listing-page-cart\"]/div[6]/div[1]/div[3]/div[2]/div/form/div/button")
	WebElement addtocart;
	
	
	@FindBy(xpath = "//*[@id=\"multi-shop-cart-list\"]/div[1]/div[1]/div/div/div/form/div[2]/div[1]/button")
	WebElement Proceedtopay;

	private Object driver;
	
	
	public Homepage() {
		PageFactory.initElements(getDriver(), this);
	}

	
	
	private WebDriver getDriver() {
		// TODO Auto-generated method stub
		return null;
	}


	public  Cartpage Addproduct() throws Throwable
	{
		Thread.sleep(2000);
		Action.selectBySendkeys(SearchBox,"Homefavourite");
		Action.sleep(driver,Searchbutton);
		Thread.sleep(2000);
		Action.click(driver,Homefavourite);
		Thread.sleep(2000);
		Action.LaunchNewWindow(driver);
		return new Cartpage();
	
	}



}
	
	
	
	


