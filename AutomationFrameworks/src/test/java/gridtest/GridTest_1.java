package gridtest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;

public class GridTest_1 {
	RemoteWebDriver driver;
  @Test
  public void f() {
	  driver.get("https://www.facebook.com/");
	  System.out.println(driver.getTitle());
  }
  
  
  @BeforeMethod
  public void beforeMethod() throws MalformedURLException {
  
	  DesiredCapabilities cap=DesiredCapabilities.chrome();
	 
	  //ip address of node computer instead of localhost
	  
	  String nodeurl="http://localhost:5556/wd/hub";   
	  
	  driver=new RemoteWebDriver(new URL(nodeurl),cap);
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}
