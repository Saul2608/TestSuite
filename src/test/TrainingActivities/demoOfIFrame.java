import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.text.StringContent;

public class demoOfIFrame {
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\4881\\Tools\\Installs\\Chromedriverupdate_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(" https://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame(driver.findElement(By.id("mce_0_ifr")));
        String contents = driver.findElement(By.xpath("//p")).getText();
        System.out.println(contents);
        driver.switchTo().defaultContent();
        driver.close();

    }
}
