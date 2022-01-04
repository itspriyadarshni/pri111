package qsp;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Cssselector {

		static{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/Priya/Desktop/Demo.html");
			driver.findElement(By.cssSelector("a[id='d1']")).click();
			driver.navigate().back();
			driver.findElement(By.cssSelector("a[name='n1']")).click();
			driver.navigate().back();
			driver.findElement(By.cssSelector("a[class='c1']")).click();
			driver.navigate().back();
			driver.findElement(By.cssSelector("a[href='https://www.instagram.com/']")).click();
			//go to link, inspect ctrl+f text box will open type a[id='d1'] and check if the path is available.
			//syntax: tag[attribute name='attribute value']
	}

}
