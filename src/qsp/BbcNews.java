package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BbcNews {
	static {
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.bbc.com/");
		List<WebElement> allNews = driver.findElements(By.xpath("(//ul[@class='top-list__list'])[1]//h3"));
		for(int i=0;i<allNews.size();i++)
		{
			String text=allNews.get(i).getText();
			System.out.println(text);
		}
		driver.close();
	}
}

