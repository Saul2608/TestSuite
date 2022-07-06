import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class loginLogoutUsingPom {
    private WebDriver driver;

    @Before
    public void setUp() throws Exception
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\4881\\Tools\\Installs\\Chromedriverupdate_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void test() throws Exception
    {
        driver.get("http://practice.bpbonline.com/.");
        Login_Pom login = new Login_Pom(driver);
        Logout_Pom logout = new Logout_Pom(driver);
        login.clickMyAccount();
        login.loginAs("bpb@bpb.com", "bpb@123");
        login.validateLogin("My Account Information");
        logout.logOff();
    }

    @After
    public void cleanup()
    {
        driver.quit();
    }

}
