import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class workingWithDropDownElement_manufacturer {
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\4881\\Tools\\Installs\\Chromedriverupdate_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.bpbonline.com/index.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Select manufacturers = new Select(driver.findElement(By.xpath("//select[@name='manufacturers_id']")));
        List<WebElement> allmanfs = manufacturers.getOptions();
        allmanfs.remove(0);

        ArrayList<String> allNames = new ArrayList<>();
        for (WebElement man : allmanfs)
        {
            allNames.add(man.getText());
        }
        for (String manname : allNames)
        {
            manufacturers.selectByVisibleText(manname);
            manufacturers = new Select(driver.findElement(By.xpath("//select[@name='manufacturers_id']")));
            if (driver.getPageSource().contains("There are no products available in this category."))
            {
                System.out.println("The manufacturer has no products");
            }
            else
            {
                WebElement productTable = driver.findElement(By.className("productListingHeader"));
                System.out.println("\n\nThe manufacturer -"+manname +"products are listed -- ");
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
            }
        }
        driver.close();
    }
}
