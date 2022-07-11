import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class checkBoxRadio
{
    public static void main(String[] args) throws Exception
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\4881\\Tools\\Installs\\Chromedriverupdate_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://jqueryui.com/");

        WebElement clickLink = driver.findElement(By.linkText("Checkboxradio"));
        clickLink.click();

        driver.switchTo().frame(0);
        WebElement location=driver.findElement(By.xpath("/html/body/div/fieldset[1]/label[1]/span[2]"));
        location.click();
        WebElement rating = driver.findElement(By.xpath("/html/body/div/fieldset[2]/label[2]/span[1]"));
        rating.click();
        WebElement type = driver.findElement(By.xpath("/html/body/div/fieldset[3]/label[3]/span[1]"));
        type.click();

        Thread.sleep(5000);
        driver.close();


    }

}
