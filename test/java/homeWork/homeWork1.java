package homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class homeWork1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement userName=driver.findElement(By.name("userName"));
        userName.sendKeys("abc");
        userName.sendKeys(Keys.CONTROL+"a");
        userName.sendKeys(Keys.DELETE);

        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.name("password"));
        password. sendKeys("admin123");
        WebElement loginBtn = driver.findElement(By.tagName("button"));
        System.out.println(loginBtn.getText());
        loginBtn.click();

    }
}
