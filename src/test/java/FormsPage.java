

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormsPage
{

    private WebDriver driver;

    public FormsPage(WebDriver driver){

        this.driver = driver;
    }

    public void setName(String name){

        var insertName = driver.findElement(By.id("name"));
        insertName.sendKeys(name);

    }

    public void setEmail(String email){

        var insertEmail = driver.findElement(By.id("email"));
        insertEmail.sendKeys(email);

    }

    public void setState(String state){

        var insertState = driver.findElement(By.id("state"));
        insertState.sendKeys(state);

    }

    public void pressAgree()
    {

        var agreeButton = driver.findElement(By.cssSelector("[for=agree]"));
        agreeButton.click();

    }

    public void pressButton(){

        var Buttons = driver.findElements(By.className("v-btn"));
        for (WebElement button : Buttons){

            if (button.getText().equalsIgnoreCase("submit")){
                button.click();
            }
        }

    }

    public String getPopupMenuText(){

        var popupMessage = driver.findElement(By.className("popup-message"));
        new WebDriverWait(driver, 10).until(d ->popupMessage.isDisplayed());
        return popupMessage.getText();

    }

    public String getErrorName(){


        return driver.findElement(By.id("name-err")).getText();


    }

    public String getErrorEmail(){

        return driver.findElement(By.id("email-err")).getText();


    }

    public String getErrorAgree(){

        return driver.findElement(By.id("agree-err")).getText();


    }



}
