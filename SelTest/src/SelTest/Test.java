package SelTest;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/JARVIS/Downloads/Selenium/chromedriver");
		WebDriver driver = new  ChromeDriver();
		driver.manage().window().fullscreen();

		driver.get("https://www.youtube.com");


		/*JavascriptExecutor js=(JavascriptExecutor)driver;

        WebElement abc = driver.findElement(By.id("search"));

        js.executeScript("arguments[0].setAttribute('style', 'background: red; border: 3px solid green;')", abc);*/
		
		driver.findElement(By.id("search")).sendKeys("infinity war");
        driver.findElement(By.id("search")).sendKeys(Keys.ENTER);
		
		//driver.findElement(By.xpath(" //*[@id=\"search-icon-legacy\"]/yt-icon")).click();

        Thread.sleep(4000);

        JavascriptExecutor js=(JavascriptExecutor)driver;

        WebElement abcd = driver.findElement(By.partialLinkText("Official Trailer"));

        js.executeScript("arguments[0].setAttribute('style', 'background: red; border: 3px solid black;')", abcd);

        driver.findElement(By.partialLinkText("Official Trailer")).click();

        Thread.sleep(20000);
        driver.close();
			}
}