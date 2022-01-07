package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iteratest {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MaxManoj\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://itera-qa.azurewebsites.net/Login");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@name='Username']")).sendKeys("Manoj");

    }
}
