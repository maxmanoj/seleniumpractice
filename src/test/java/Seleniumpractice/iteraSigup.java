package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class iteraSigup {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MaxManoj\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://itera-qa.azurewebsites.net/home/automation");
        Thread.sleep(2000);

        //label[text()='First name']
        //label[contains(text(),'First name')]
        //input[@id='FirstName' and @name='FirstName']
        //input[@id='FirstName' or @name='FirstName']
        //*[@id='FirstName' or @name='FirstName']

        driver.findElement(By.xpath("//input[@id='female']")).click();
        Thread.sleep(5000);

        WebElement element= driver.findElement(By.xpath("//input[@id='female']"));

        if(element.isSelected()){
            System.out.println("Female is selected");
        }else{
            System.out.println(" not selected");
        }
if (driver.findElement(By.xpath("//input[@id='male']")).isSelected()){
    System.out.println("male is selected");
}else{
    System.out.println("male is nt selected");
}
        if (driver.findElement(By.xpath("//input[@id='other']")).isEnabled()){
            System.out.println("other is enabled");
        }else{
            System.out.println("other is nt enabled");
        }
        if (driver.findElement(By.xpath("//h1[@class='display-3']")).isDisplayed()){
            System.out.println("page is displayed");
        }else{
            System.out.println("page is not dispalyed");
        }

        List<String> list = new ArrayList<String>();

        list.add("monday");
        list.add("tuesday");
        list.add("wednesday");
        list.add("thursday");
        list.add("friday");
        list.add("saturday");
        list.add("sunday");

        String dynxpath = "//input[@id='%s']";

        for(int i=0;i<list.size();i++){

            WebElement CheckBox = deriveXpath(dynxpath,driver,list.get(i));
            CheckBox.click();
        }

        driver.findElement(By.xpath("//input[@id='monday']")).click();
        Thread.sleep(5000);


        driver.quit();
    }

    public static WebElement deriveXpath(String dynxpath,WebDriver driver,String str){
        String a = String.format(dynxpath,str);
        System.out.println(a);
        return driver.findElement(By.xpath(String.format(dynxpath,str)));
    }
}
