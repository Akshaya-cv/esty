package Pagepkg;


	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import com.etzy.Baseclass.Baseclass;
import com.etzy.actiondriver.Action;

	public class Cartpage extends Baseclass {
		
		@FindBy(xpath = "//*[@id=\"listing-page-cart\"]/div[6]/div[1]/div[1]/div[2]/div/div/div[1]")
		WebElement quantity;
			
		@FindBy(xpath = "//*[@id=\"listing-page-cart\"]/div[6]/div[1]/div[3]/div[2]/div/form/div/button")
		WebElement addtocart;
		
		
		@FindBy(xpath = "//*[@id=\"multi-shop-cart-list\"]/div[1]/div[1]/div/div/div/form/div[2]/div[1]/button")
		WebElement Proceedtopay;
		
		
		@FindBy(xpath = "//*[@id=\"shipping-address-form\"]/div[2]/button/span[1]")
		
		WebElement payment;
		
		public Cartpage() {
			PageFactory.initElements(getDriver(), this);
		}

		private Object driver;
		
		
		public void enterQuantity(int i) throws Throwable {
			Action.type(quantity, i);
		}
		public  void  Addcart() throws Throwable
		{
			Thread.sleep(2000);
			Action.click(driver,addtocart);
			Action.LaunchNewWindow(driver);
			Thread.sleep(2000);

			Thread.sleep(2000);
			Action.click(driver,Proceedtopay);
			Thread.sleep(2000);
			Action.click(driver,payment);

		}
	}