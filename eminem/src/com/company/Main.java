package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/JARVIS/Downloads/selenium/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://shop.eminem.com/");

        driver.findElement(By.xpath("//*[@id=\"AccessibleNav\"]/li[4]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"PageContainer\"]/main/section/div/div/div[6]/div/a")).click();
        driver.findElement(By.xpath("//*[@id=\"productSelect-option-0\"]/li[6]")).click();
        driver.findElement(By.name("add")).click();
        Thread.sleep(2000);

        driver.get("https://shop.eminem.com/3906749/checkouts/7874b9af578566db7bfbbb239b593c11?_ga=2.61686117.838703006.1529651526-399508525.1529651526");
        driver.findElement(By.name("checkout[email]")).sendKeys("rhymezboy@gmail.com");
        //driver.findElement(By.name("checkout[buyer_accepts_marketing]")).click();
        driver.findElement(By.name("checkout[shipping_address][first_name]")).sendKeys("Marshall");
        driver.findElement(By.name("checkout[shipping_address][last_name]")).sendKeys("Mathers");
        driver.findElement(By.name("checkout[shipping_address][address1]")).sendKeys("addresss1");
        driver.findElement(By.name("checkout[shipping_address][address2]")).sendKeys("addresss2");
        driver.findElement(By.name("checkout[shipping_address][city]")).sendKeys("Detroit");


        //DropDowns

        Select dropdown = new Select(driver.findElement(By.id("checkout_shipping_address_country")));
                dropdown.selectByVisibleText("United States");

        Select dropdown1 = new Select(driver.findElement(By.id("checkout_shipping_address_province")));
                dropdown1.selectByVisibleText("Michigan");

        //Final
        driver.findElement(By.name("checkout[shipping_address][zip]")).sendKeys("48201");
        driver.findElement(By.name("checkout[shipping_address][phone]")).sendKeys("833-243-8738");

    }
}
