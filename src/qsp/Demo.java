package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

		static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String[] args) {
		ChromeDriver c=new ChromeDriver();
		c.get("https://www.instagram.com/");
		String title = c.getTitle();
		System.out.println(c.getTitle());
		System.out.println(title);
		c.close();
		

//./ means current java project i.e automation file
		//org.openqa.selenium.chrome.ChromeDriver ----fully qualified classname
		//many methods of webdriver is not available in search context hence upcasting to SC is waste. 
		//remotewebdriver is a class. implementations are provided in RWB. due to abstraction we do not upcast to RWB.
	}

}
