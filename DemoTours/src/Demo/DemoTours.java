package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

public class DemoTours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/JARVIS/Downloads/selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Lakshya");
		driver.findElement(By.name("lastName")).sendKeys("Wadhwa");
		driver.findElement(By.name("phone")).sendKeys("9971748720");
		driver.findElement(By.name("userName")).sendKeys("rhymezboy@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("C-1203, Exotica Eastern Court");
		driver.findElement(By.name("address2")).sendKeys("Crossing Republik");
		driver.findElement(By.name("city")).sendKeys("Ghaziabad");
		driver.findElement(By.name("state")).sendKeys("Uttar Pradesh");
		driver.findElement(By.name("postalCode")).sendKeys("201010");
		driver.findElement(By.name("country")).click();
		//driver.findElement(By.name("country")).sendKeys("India");
		//driver.findElement(By.name("country")).sendKeys(Keys.ENTER);
		
		char[] chars = "abcdefghijklmnopqrstuvwxyz1234567890".toCharArray();
		StringBuilder sb = new StringBuilder(10);
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
		    char c = chars[random.nextInt(chars.length)];
		    sb.append(c);
		}
		String output = sb.toString();
		
		driver.findElement(By.name("email")).sendKeys(output+"@gmail.com");
		driver.findElement(By.name("password")).sendKeys("pass#123");
		driver.findElement(By.name("confirmPassword")).sendKeys("pass#123");
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[18]/td/input")).click();
		
//New Page
		driver.findElement(By.linkText("sign-in")).click();
		
//Sign In Page
		driver.findElement(By.name("userName")).sendKeys(output+"@gmail.com");
		driver.findElement(By.name("password")).sendKeys("pass#123");
		driver.findElement(By.name("login")).click();
		
		
		
	}

}
