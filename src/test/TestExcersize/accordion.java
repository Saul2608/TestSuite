import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class accordion {
    public static void main(String[] args) throws Exception
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\4881\\Tools\\Installs\\Chromedriverupdate_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://jqueryui.com/");

        WebElement clickLink = driver.findElement(By.linkText("Accordion"));
        clickLink.click();

        driver.switchTo().frame(0);
        Thread.sleep(2000);
        WebElement section2 = driver.findElement(By.xpath("//*[@id=\"ui-id-3\"]"));
        section2.click();
        Thread.sleep(2000);
        WebElement section3 = driver.findElement(By.xpath("//*[@id=\"ui-id-5\"]"));
        section3.click();
        Thread.sleep(2000);
        WebElement section4 = driver.findElement(By.xpath("//*[@id=\"ui-id-7\"]"));
        section4.click();
        Thread.sleep(2000);
        driver.close();
    }
}
