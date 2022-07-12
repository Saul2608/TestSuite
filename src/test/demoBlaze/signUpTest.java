import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.jupiter.api.Order;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class signUpTest {
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
    public void testAClickClose()throws Exception
    {
        driver.get("https://www.demoblaze.com/");
        sign_Up closeBtn = new sign_Up(driver);
        closeBtn.clickSignUpPage();
        Thread.sleep(1000);
        closeBtn.clickClose();
        Thread.sleep(1000);
        closeBtn.clickSignUpPage();
        Thread.sleep(1000);
        closeBtn.clickXButton();
        Thread.sleep(1000);

    }

    @Test
    @Order(1)
    public void testANoFill()throws Exception
    {
        driver.get("https://www.demoblaze.com/");
        sign_Up noFill = new sign_Up(driver);
        noFill.clickSignUpPage();
        Thread.sleep(1000);
        noFill.clickSubmit();
        Thread.sleep(1000);
        noFill.alertTextFill();
        Thread.sleep(1000);
        noFill.clickClose();
        Thread.sleep(1000);


    }

    @Test
    @Order(2)
    public void testCreateUser()throws Exception
    {
        driver.get("https://www.demoblaze.com/");
        sign_Up createUser = new sign_Up(driver);
        createUser.clickSignUpPage();
        Thread.sleep(1000);
        createUser.fillUserName("Test123");
        createUser.fillPassWord("123");
        Thread.sleep(1000);
        createUser.clickSubmit();
        Thread.sleep(1000);
        createUser.alertTextSuccess();

    }

    @Test
    @Order(3)
    public void testUserExists()throws Exception
    {
        driver.get("https://www.demoblaze.com/");
        sign_Up createUser = new sign_Up(driver);
        createUser.clickSignUpPage();
        Thread.sleep(1000);
        createUser.fillUserName("Test123");
        createUser.fillPassWord("123");
        Thread.sleep(1000);
        createUser.clickSubmit();
        Thread.sleep(1000);
        createUser.alertTextExists();

    }

    @After
    public void cleanup()
    {
        driver.quit();
    }

}
