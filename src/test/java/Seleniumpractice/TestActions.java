package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestActions {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MaxManoj\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Azure_webpage(driver,"https://itera-qa.azurewebsites.net/home/automation" );
        Thread.sleep(2000);

        //Hovertolocation(driver, "https://freecrm.com/");
        //GooglesearchTest(driver, "https://google.com");
        Doubleclick(driver, "https://demoqa.com/buttons");

    }

    public static void Azure_webpage(WebDriver driver, String url) throws InterruptedException {

        driver.get(url);
        Actions actions = new Actions(driver);

        WebElement element = driver.findElement(By.xpath("//input[@id='name']"));

        actions.moveToElement(element)
                .click()
                .sendKeys("Manoj T")
                .sendKeys(Keys.TAB)
                .sendKeys("112455")
                .sendKeys(Keys.TAB)
                .sendKeys("maxassaa@df")
                .sendKeys(Keys.TAB)
                .sendKeys("masasa@aaa")
                .sendKeys(Keys.TAB)
                .sendKeys("ichihara japan")
                .build ()
                .perform();

        Thread.sleep(3000);
        driver.quit();

    }
    public static void Hovertolocation (WebDriver driver, String url) throws InterruptedException {
        driver.get(url);
        Actions actions = new Actions(driver);

        WebElement element = driver.findElement(By.xpath("//a[text()='Free CRM']"));

        actions.moveToElement(element)
                .build()
                .perform();
        Thread.sleep(3000);
        driver.quit();
    }
    public static void GooglesearchTest (WebDriver driver, String url) throws InterruptedException {
        driver.get(url);
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//input[@title='Search']"));
        actions.keyDown(element, Keys.SHIFT)
                .sendKeys("facebook down")
                .keyUp(element, Keys.SHIFT)
                .keyDown(element,Keys.SHIFT)
                .sendKeys("a")
                .sendKeys("x")
                .keyUp(element, Keys.SHIFT)
                //.sendKeys(Keys.ARROW_DOWN)
                //.sendKeys(Keys.ARROW_DOWN)
                //.sendKeys(Keys.ENTER)
                .build()
                .perform();

        Thread.sleep(3000);
        driver.quit();

    }
    public static void Doubleclick (WebDriver driver, String url) throws InterruptedException {
        driver.get(url);
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
        actions.moveToElement(element)
                .doubleClick()
                .build()
                .perform();
        Thread.sleep(2000);
        WebElement element1 = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
        actions.moveToElement(element1)
                .contextClick()
                .build()
                .perform();

        Thread.sleep(3000);
        driver.quit();
    }
}
