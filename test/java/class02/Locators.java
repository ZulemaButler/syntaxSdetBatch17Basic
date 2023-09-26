package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {
        //instance
        WebDriver driver=new ChromeDriver();

        //navigate to webside
        driver.get("http://35.175.58.98/input-form-locator.php");

        //max the window
        driver.manage().window().maximize();

        //locate the webElement by first name
       WebElement firstName =driver.findElement(By.id("first_name"));
       firstName.sendKeys("Porcha");

       //locate the webElement last name
        WebElement lastName=driver.findElement(By.name("last_name"));
        lastName.sendKeys("Bonilla");

        //locate the WebElement email
        WebElement email = driver.findElement(By.className("form-control-01"));
        email.sendKeys("ZXButler@mac.com");

        //locate the button and click on it
        WebElement submitBtn = driver.findElement(By.tagName("button"));
       submitBtn.click();

       //locate the WebElement by Link
       WebElement linkBtn= driver.findElement(By.linkText("Link"));
       linkBtn.click();

       //locate partial linkText
        WebElement clickHere = driver.findElement(By.partialLinkText("Here."));
        clickHere.click();
    }
}
