package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebAlerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MaxManoj\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/alerts");
        Thread.sleep(3000);
         driver.findElement(By.xpath("//button[@id='alertButton']")).click();
         driver.switchTo().alert().accept();

        driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
        driver.switchTo().alert().dismiss();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@id=\"promtButton\"]")).click();
        Thread.sleep(3000);
        String str = driver.switchTo().alert().getText();
        System.out.println("this is response"+ str);
        driver.switchTo().alert().sendKeys("Sample text");
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        Thread.sleep(3000);

        if (Isalertspresent (driver)){
            System.out.println("Alert is present");
        }else{
            System.out.println("Alert is not present");
        }

        driver.quit();
    }
    public static boolean Isalertspresent(WebDriver driver){

        try {
            driver.switchTo().alert();
            return true;
        }catch (NoAlertPresentException ex){
            return false;

        }
    }

}
