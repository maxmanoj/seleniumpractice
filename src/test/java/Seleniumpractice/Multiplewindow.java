package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Multiplewindow {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MaxManoj\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/browser-windows");
        Thread.sleep(3000);

        String parentwindow = driver.getWindowHandle();

        driver.findElement(By.xpath("//button[@id='tabButton']")).click();
        Thread.sleep(3000);

        Set<String> set = driver.getWindowHandles();

        Iterator itr= set.iterator();
        while (itr.hasNext()){

            String childwindow =itr.next().toString();

            if (!childwindow.equals(parentwindow)){
                driver.switchTo().window(childwindow);
                Thread.sleep(3000);

                System.out.println(driver.findElement(By.xpath("//h1")).getText());
                driver.close();
            }
            driver.switchTo().window(parentwindow);
        }


    }
}
