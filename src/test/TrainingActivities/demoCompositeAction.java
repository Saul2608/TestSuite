import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class demoCompositeAction {
    public static void main(String[] args) throws Exception
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\4881\\Tools\\Installs\\Chromedriverupdate_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/key_presses");

        WebElement textBox = driver.findElement(By.id("target"));
        Actions act = new Actions(driver);
        act.sendKeys(textBox, Keys.TAB).pause(5000).sendKeys(textBox, Keys.SPACE).build().perform();
        Thread.sleep(5000);
        driver.close();
    }
}
