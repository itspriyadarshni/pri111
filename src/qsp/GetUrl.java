package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrl {

	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String currentUrl=driver.getCurrentUrl();
		if(currentUrl.contains("google.com"))
		{
			System.out.println("url contains google so pass");
		}
		else
		{
			System.out.println("url does not contains google so fail");
		}
		driver.quit();
	}

}
