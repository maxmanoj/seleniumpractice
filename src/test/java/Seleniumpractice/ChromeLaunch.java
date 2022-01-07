package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class ChromeLaunch {
        public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\MaxManoj\\Documents\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            driver.get("https://itera-qa.azurewebsites.net/home/automation");
            Thread.sleep(1000);
//By id
            //driver.findElement(By.id("name")).sendKeys("PUTHIN");
            //Thread.sleep(5000);
//By classname
            //driver.findElement(By.className("form-control")).sendKeys("puttin");
            //Thread.sleep(5000);

            // Absolute Xpath --> /
            driver.findElement(By.xpath("html/body/div/div[2]/div[2]/div[1]/input")).sendKeys("PUTHIN");
            Thread.sleep(5000);
            //html/body/div/div[2]/div[2]/div[1]/input

            // Relative Xpath --> //
           //driver.findElement(By.xpath("//input[@id='name']")).sendKeys("PUTIN");
            //htmltag[@attribute='value']



        }
    }
