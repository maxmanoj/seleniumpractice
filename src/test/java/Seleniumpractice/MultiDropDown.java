package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class MultiDropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MaxManoj\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://freecrm.com/");
        Thread.sleep(8000);
        List<WebElement> list  = driver.findElements(By.xpath("//a")); //for links //a, //for buttons //buttons, //for images //images

        for (int i=0; i< list.size();i++){
            System.out.println(list.get(i).getText());
        }
        System.out.println(" The total number of links present= " + list.size());

        // bootstrap handling

        driver.findElement(By.xpath("//span[@class= 'rd-navbar-submenu-toggle']")).click();
        List<WebElement> elementslist = driver.findElements(By.xpath("//ul[@class= 'rd-navbar-dropdown rd-navbar-open-right']/li/a"));

        for (int i=0; i<elementslist.size();i++){

            if(elementslist.get(i).getText().equals("Automotive CRM")){
                System.out.println(elementslist.get(i).getText() + "is selected");
                elementslist.get(i).click();
                break;
            }
        }

        Thread.sleep(6000);
        driver.quit();
    }
}
