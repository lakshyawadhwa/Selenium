package sephora;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sephora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://sephora.nnnow.com/");
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div[2]/div/div[4]/a[2]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"kc-form-login\"]/div[5]/span[2]")).click();
		driver.findElement(By.id("name")).sendKeys("Lakshya Wadhwa");
		

		char[] chars = "0123456789".toCharArray();
		StringBuilder sb = new StringBuilder(10);
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
		    char c = chars[random.nextInt(chars.length)];
		    sb.append(c);
		}
		String phone = sb.toString();
		
		driver.findElement(By.id("phoneNumber")).sendKeys("9"+phone);
		
		char[] chars2 = "abcdefghijklmnopqrstuvwxyz1234567890".toCharArray();
		StringBuilder sb2 = new StringBuilder(10);
		Random random2 = new Random();
		for (int i = 0; i < 10; i++) {
		    char b = chars2[random2.nextInt(chars2.length)];
		    sb2.append(b);
		}
		String output = sb2.toString();
		
		driver.findElement(By.name("email")).sendKeys(output+"@gmail.com");
		driver.findElement(By.id("password-register")).sendKeys("password123");
		driver.findElement(By.xpath("//*[@id=\"user-registration-form\"]/div[5]/button")).click();
	
	}

}

