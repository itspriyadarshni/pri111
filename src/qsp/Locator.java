package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Priya/Desktop/Demo.html");
		WebElement e =driver.findElement(By.tagName("a"));
		e.click();
		driver.navigate().back();
		driver.findElement(By.id("d1")).click();
		driver.navigate().back();
		driver.findElement(By.name("n1")).click();
		driver.navigate().back();
		driver.findElement(By.className("c1")).click();
		driver.navigate().back();
		driver.findElement(By.linkText("Google")).click();
		driver.navigate().back();
		driver.findElement(By.tagName("a")).click();
	}
}

//findelement will take the first matching element
//by tag name will select all reference names
//find element will take the address of first tag(if there are multiple same tag name)
//if there is no such tag name it gives nosuchelementexception error.
//class name should be used only in by.className.
