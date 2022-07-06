import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class demoOfImplicitWait {
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\4881\\Tools\\Installs\\Chromedriverupdate_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.bpbonline.com/");
        driver.findElement(By.linkText("My Account")).click();
        driver.findElement(By.name("email_address")).sendKeys("bpb@bpb.com");
        driver.findElement(By.name("password")).sendKeys("bpb@123");
        driver.findElement(By.id("tdb1")).click();
        driver.findElement(By.linkText("Log Off")).click();
        driver.findElement(By.linkText("Continue")).click();
        driver.close();
    }
}
