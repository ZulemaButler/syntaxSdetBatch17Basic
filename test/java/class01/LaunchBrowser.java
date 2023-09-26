package class01;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {
       //declare the instance of WebDriver
        WebDriver driver=new ChromeDriver();

       //use the driver.get() method
        driver.get("https://www.google.com"); //navigate to a particular URL

                //maximize your window
        driver.manage().window().maximize();

                //get the url of the website
        String currentUrl= driver.getCurrentUrl(); //it gets the URL
        System.out.println("The current URL is: "+currentUrl);

            //get the title
        String title =driver.getTitle();  //gets the app page
        System.out.println("The tittle of the page is "+title);


        //added a wait for 2 second to slow the closing of window
        //delete the sleep after you are done with the script
       Thread.sleep(2000);


                //close the browser
        driver.quit();



        //close the browser
       // driver.quit();

    }
}
