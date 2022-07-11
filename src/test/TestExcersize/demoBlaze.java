import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class demoBlaze {
    public static void main(String[] args) throws Exception
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\4881\\Tools\\Installs\\Chromedriverupdate_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.demoblaze.com/index.html");

        WebElement phone = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[3]/div/div/h4/a"));
        phone.click();
        Thread.sleep(2000);
        WebElement cart = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a"));
        cart.click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        WebElement inCart = driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[4]/a"));
        inCart.click();
        Thread.sleep(5000);
        driver.close();
    }
}
