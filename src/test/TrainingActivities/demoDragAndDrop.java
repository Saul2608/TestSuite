import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class demoDragAndDrop {
    public static void main(String[] args) throws Exception
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\4881\\Tools\\Installs\\Chromedriverupdate_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://jqueryui.com/droppable/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        WebElement drag = driver.findElement(By.id("draggable"));
        WebElement drop = driver.findElement(By.id("droppable"));

        Actions act = new Actions(driver);
        act.dragAndDrop(drag, drop).perform();
        Thread.sleep(5000);
        driver.close();

    }
    private static Actions Actions (WebDriver driver)
    {
        return null;
    }

}
