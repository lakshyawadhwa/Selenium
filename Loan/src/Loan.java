import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\Selenium\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			
			driver.get("https://loan.icicibank.com/asset-portal/auto-loan/check-eligibility?WT.mc_id=Desk_NLI_ProductPage_ApplyNow");
			driver.findElement(By.className("input__label-content pull-right ng-scope")).click();
			
	}

}
