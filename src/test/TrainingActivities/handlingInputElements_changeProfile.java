import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class handlingInputElements_changeProfile {
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\4881\\Tools\\Installs\\Chromedriverupdate_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.bpbonline.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("My Account")).click();
        driver.findElement(By.name("email_address")).sendKeys("bpb@bpb.com");
        driver.findElement(By.name("password")).sendKeys("bpb@123");
        driver.findElement(By.id("tdb1")).click();

        driver.findElement(By.linkText("View or change my account information.")).click();
        if (driver.findElement(By.xpath("//input[@value='m']")).isSelected())
        {
            driver.findElement(By.xpath("//input[@value='f']")).click();
        }
        else
        {
            driver.findElement(By.xpath("//input[@value='m']")).click();
        }

        driver.findElement(By.name("telephone")).clear();
        driver.findElement(By.name("telephone")).sendKeys("0100111001");
        driver.findElement(By.id("tdb5")).click();
        if (driver.getPageSource().contains("account has been successfully updated"))
        {
            System.out.println("Account changed successfully");
        }
        else
        {
            System.out.println("Account information not changed");
        }
        driver.findElement(By.linkText("Log Off")).click();
        driver.findElement(By.linkText("Continue")).click();
        driver.close();
    }
}
