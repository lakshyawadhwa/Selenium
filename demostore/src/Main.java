import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {



    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/JARVIS/Downloads/selenium/chromedriver");
        WebDriver driver=new ChromeDriver();
    driver.get("http://store.demoqa.com/wp-login.php?action=register");
        driver.findElement(By.name("user_login")).sendKeys("rhymezby");
        driver.findElement(By.name("user_email")).sendKeys("rhymezby@gmail.com");
    }
}
