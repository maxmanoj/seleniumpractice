package Seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HrmLive {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MaxManoj\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");
        //Xpath axes:::::
        //div[@class='form-horizontal']/child::div[1]/child::div/child::input
        //span[text()='Username']/preceding-sibling::input
        //span[text()='Username']/preceding-sibling::input/parent::div
        //div[@id='divUsername']/following-sibling::div[2]
        //input[@id='Surname']/ancestor::div[1]

        driver.quit();
    }
}
