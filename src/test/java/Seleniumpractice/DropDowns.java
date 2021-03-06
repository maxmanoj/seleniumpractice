package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MaxManoj\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://itera-qa.azurewebsites.net/home/automation");
        Thread.sleep(2000);

                WebElement element = driver.findElement(By.xpath("//select[@class='custom-select']"));

                Select dropdown = new Select(element);
        //byIndex
        //Byvalue
        //Byvisbletext
        dropdown.selectByIndex(6);
        dropdown.selectByValue("3");
        dropdown.selectByVisibleText("Denmark");


        Thread.sleep(6000);
        driver.quit();

            }
}
