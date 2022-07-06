

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuPage {
    private WebDriver driver;

    public MenuPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void navigateToFormsPage()
    {
        WebElement formsMenu = driver.findElement(By.cssSelector("[aria-label=forms]"));
        formsMenu.click();

    }

    public void navigateToPlanetsPage()
    {
        WebElement planetsMenu = driver.findElement(By.cssSelector("[aria-label=planets]"));
        planetsMenu.click();

    }
}
