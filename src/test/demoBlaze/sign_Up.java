import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class sign_Up {
    private WebDriver driver;
    public sign_Up (WebDriver driver){this.driver = driver;}

        By signUpPage = By.xpath("//*[@id=\"signin2\"]");
        By userName = By.id("sign-username");
        By passWord = By.id("sign-password");
        By closeSignUp = By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[1]");
        By pressXButton = By.xpath("//*[@id=\"signInModal\"]/div/div/div[1]/button/span");
        By signUpButton = By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]");

        public sign_Up clickSignUpPage()
        {
            driver.findElement(signUpPage).click();
            return this;
        }

        public sign_Up fillUserName(String name)
        {
            driver.findElement(userName).sendKeys(name);
            return this;
        }

        public sign_Up fillPassWord(String pass)
        {
            driver.findElement(passWord).sendKeys(pass);
            return this;
        }

        public sign_Up clickClose()
        {
            driver.findElement(closeSignUp).click();
            return this;
        }

        public sign_Up clickXButton()
        {
            driver.findElement(pressXButton);
            return this;
        }

        public sign_Up clickSubmit()
        {
            driver.findElement(signUpButton).click();
            return this;
        }

        public sign_Up alertTextSuccess()
        {
            String alertText = driver.switchTo().alert().getText();
            Assertions.assertEquals("Sign up successful.", alertText);
            System.out.println(alertText);
            driver.switchTo().alert().accept();
            return this;
        }

        public sign_Up alertTextFill()
        {
            String alertText = driver.switchTo().alert().getText();
            Assertions.assertEquals("Please fill out Username and Password.", alertText);
            System.out.println(alertText);
            driver.switchTo().alert().accept();
            return this;
        }

        public sign_Up alertTextExists()
        {
            String alertText = driver.switchTo().alert().getText();
            Assertions.assertEquals("This user already exist.", alertText);
            System.out.println(alertText);
            driver.switchTo().alert().accept();
            return this;
        }

}
