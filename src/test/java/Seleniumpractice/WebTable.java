package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import static java.lang.Thread.sleep;

public class WebTable {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MaxManoj\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//b[text()='Admin']")).click();

        List<WebElement> col = driver.findElements(By.xpath("//table[@id='resultTable']/thead/tr/th"));

        int index=2;

        for (int i=1;i<col.size();i++){
            String str = driver.findElement(By.xpath("//table[@id='resultTable']/thead/tr/th["+ index +"]")).getText();
            index++;
            System.out.print(str+ "       ");
        }

        System.out.println();

        List<WebElement> Lrow = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));

        for (int i = 1; i <= Lrow.size(); i++) {
            String str = "";
            for (int j = 2; j <= col.size(); j++) {

                if (j == 2) {

                    str = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + i + "]/td[" + j + "]/a")).getText();
                } else {
                    str = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + i + "]/td[" + j + "]")).getText();
                }
                System.out.print(str + "     ");
            }
            System.out.println();

        }

        Thread.sleep(5000);
        driver.quit();
    }
}
