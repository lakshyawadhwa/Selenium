package SelTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\Selenium\\chromedriver.exe");
		WebDriver driver = new  ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.findElement(By.id("search")).sendKeys("eminem");
		driver.findElement(By.id("search-icon-legacy")).click();
		driver.findElement(By.partialLinkText("Caterpillar ft. Eminem, King Green")).click();
			}
}