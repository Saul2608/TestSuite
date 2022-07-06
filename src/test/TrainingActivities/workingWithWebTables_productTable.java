import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class workingWithWebTables_productTable {
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\4881\\Tools\\Installs\\Chromedriverupdate_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.bpbonline.com/index.php");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement productTable = driver.findElement(By.tagName("table"));
        List<WebElement> rows = productTable.findElements(By.xpath("//*/tbody/tr"));

        for (WebElement row : rows)
        {
            List<WebElement> cols = row.findElements(By.xpath("td"));
            for (WebElement col : cols)
            {
                String content = col.getText();
                System.out.println(content);
            }
        }
        driver.close();
    }
}
