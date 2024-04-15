package testpkg;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.model.Log;

import Pagepkg.Cartpage;
import Pagepkg.Homepage;
import Pagepkg.Loginpage;

public class Logintest {
		private Homepage homePage;
	private Object driver;
	
	@BeforeMethod
	public void setup(String browser) {
		launchApp(browser); 
	}
	
	private void launchApp(String browser) {
		// TODO Auto-generated method stub
		
	}

	
	

	@Test
	public void loginTest(String uname, String pswd) throws Throwable {
		
		Loginpage lg=new Loginpage();
		lg.login(uname, pswd, homePage);
		Cartpage cp=new Cartpage();
		cp.Addcart();
		cp.enterQuantity(1);
		Homepage hm=new Homepage();
		hm.Addproduct();
		  
		  
	}

			}

