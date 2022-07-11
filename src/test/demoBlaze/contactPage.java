import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class contactPage {
    public static void main(String[] args) throws Exception
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\4881\\Tools\\Installs\\Chromedriverupdate_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.demoblaze.com/");

        WebElement contact = driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a"));
        contact.click();

        WebElement email = driver.findElement(By.id("recipient-email"));
                email.sendKeys("saul.mckenzie@accesshq.com");
        WebElement name = driver.findElement(By.id("recipient-name"));
                name.sendKeys("Saul");
        WebElement message = driver.findElement(By.id("message-text"));
                message.sendKeys("This is an automated test");
        Thread.sleep(2000);

        WebElement send = driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]"));
        send.click();
        Thread.sleep(2000);
        String alertText = driver.switchTo().alert().getText();

        Assertions.assertEquals("Thanks for the message!!", alertText);
        System.out.println(alertText);
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(1000);
        driver.close();

    }
}
