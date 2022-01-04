package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext {

	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Priya/Desktop/Demo.html");
		driver.findElement(By.linkText("Google")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Goo")).click();
		driver.navigate().back();
	}
}
	
//whenever a part of the text is changing we go for Partial link text.
//mostly numbers will change