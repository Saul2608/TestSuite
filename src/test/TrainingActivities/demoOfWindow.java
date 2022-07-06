import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class demoOfWindow {
       public static void main(String[] args)
       {
              System.setProperty("webdriver.chrome.driver", "C:\\Users\\4881\\Tools\\Installs\\Chromedriverupdate_win32\\chromedriver.exe");
              WebDriver driver = new ChromeDriver();
              driver.get("https://the-internet.herokuapp.com/windows");
              driver.findElement(By.linkText("Click Here")).click();
              Set<String> allWindowHandles = driver.getWindowHandles();
              for (String handle : allWindowHandles)
              {
                     System.out.println(handle);
              }
              Object[] windows = allWindowHandles.toArray();
              driver.switchTo().window(windows[1].toString());
              if (driver.getPageSource().contains("New Window"))
              {
                     System.out.println("we are now on the new window");
                     System.out.println("closing child window");
                     driver.close();
              }
              System.out.println("closing the main window");
              driver.switchTo().window(windows[0].toString());
              driver.close();
       }
}
