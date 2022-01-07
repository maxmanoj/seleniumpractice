package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MaxManoj\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/date-picker");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='datePickerMonthYearInput']")).click();
        String month = "June 2021";
        String date = "19";

        while(true){

            String calmonth = driver.findElement(By.xpath("//div[@class='react-datepicker__month-container']/div[1]/div[1]")).getText();

            if (calmonth.equals(month)){
                break;
            }else
            {
                driver.findElement(By.xpath("//div[@class='react-datepicker']/div/following-sibling::button[1]")).click();
                Thread.sleep(2000);
            }
        }

        driver.findElement(By.xpath("//div[@role='listbox']/div/div[contains(text(),'"+ date +"')]")).click();

        Thread.sleep(3000);
        driver.quit();
    }
}
