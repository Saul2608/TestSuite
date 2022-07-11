import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class contact_Main {

    private WebDriver driver;

    public contact_Main (WebDriver driver)
    {
        this.driver = driver;
    }

    By contactPage = By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a");
    By contactEmail = By.id("recipient-email");
    By contactName = By.id("recipient-name");
    By contactMessage = By.id("message-text");
    By submitButton = By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]");

    public contact_Main clickContactPage()
    {
        driver.findElement(contactPage).click();
        return this;
    }

    public contact_Main insertEmail(String email)
    {
        driver.findElement(contactEmail).sendKeys(email);
        return this;
    }

    public contact_Main insertName(String name)
    {
        driver.findElement(contactName).sendKeys(name);
        return this;
    }

    public contact_Main insertMessage(String message)
    {
        driver.findElement(contactMessage).sendKeys(message);
        return this;
    }

    public contact_Main clickSubmit()
    {
        driver.findElement(submitButton).click();
        return this;
    }

    public contact_Main alertTextAgree()
    {
        String alertText = driver.switchTo().alert().getText();
        Assertions.assertEquals("Thanks for the message!!", alertText);
        System.out.println(alertText);
        driver.switchTo().alert().accept();
        return this;
    }

}
