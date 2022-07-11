import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class contactTest {
    private WebDriver driver;

    @Before
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\4881\\Tools\\Installs\\Chromedriverupdate_win32\\chromedriver.exe");
        driver = new ChromeDriver();


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void test() throws Exception
    {
        driver.get("https://www.demoblaze.com/");
        contact_Main contact = new contact_Main(driver);
        contact.clickContactPage();
        contact.insertEmail("");
        contact.insertName("");
        contact.insertMessage("");
        Thread.sleep(1000);
        contact.clickSubmit();
        Thread.sleep(1000);
        contact.alertTextAgree();
        Thread.sleep(1000);
    }

    @After
    public void cleanup()
    {
        driver.quit();
    }
}
