package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {
    public static void main(String[] args) throws InterruptedException {
       //starts the
        WebDriver driver=new ChromeDriver();

        //go to google.com
        driver.get("https:www.google.com"); // you cannot navigate it waits for the whole page to load

        //max the window
        driver.manage().window().maximize();

        //slow down to observe the processes
        Thread.sleep(2000);

        //go to Facebook.com navigate allows you to move fwd/backwards/refresh--does not wait for page to load
        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(2000);

        //go back
        driver.navigate().back();
        Thread.sleep(2000);

        //go fwd
        driver.navigate().forward();
        Thread.sleep(2000);

        //refresh
        driver.navigate().refresh();

        //closes the window
        driver.close();

        //close the drive/ all tabs
        driver.quit();
    }
}
