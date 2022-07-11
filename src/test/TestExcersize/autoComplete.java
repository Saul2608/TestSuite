import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class autoComplete {
    public static void main(String[] args) throws Exception
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\4881\\Tools\\Installs\\Chromedriverupdate_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://jqueryui.com/");

        WebElement clickLink = driver.findElement(By.linkText("Autocomplete"));
        clickLink.click();
        Thread.sleep(1000);
        WebElement textBox = driver.findElement(By.xpath("//*[@id=\"tags\"]"));
        textBox.sendKeys("ja");
        Thread.sleep(2000);
        WebElement selection = driver.findElement(By.id("ui-id-10"));
        selection.click();
        Thread.sleep(2000);
        driver.close();

    }
}
