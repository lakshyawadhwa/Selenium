package SelTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "/Users/JARVIS/Downloads/Selenium/chromedriver");
		WebDriver driver = new  ChromeDriver();
		driver.get("https://www.youtube.com");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;

        WebElement abc = driver.findElement(By.id("search"));

        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 5px solid blue;')", abc);
		
		driver.findElement(By.id("search")).sendKeys("eminem");
		driver.findElement(By.id("search-icon-legacy")).click();
		driver.findElement(By.partialLinkText("Caterpillar ft. Eminem, King Green")).click();
			}
}