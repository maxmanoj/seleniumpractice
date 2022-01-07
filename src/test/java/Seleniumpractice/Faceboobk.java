package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class Faceboobk {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MaxManoj\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");
        sleep(2000);
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("maxxmanoj@gmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("aaaa");
        driver.findElement(By.xpath("//button[@name='login']")).click();

    }
}
