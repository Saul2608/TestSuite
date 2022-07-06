

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebTestSuite extends BaseTestSuite {


    @Test
    public void FormTest() {

        var menu = new MenuPage(driver);
        menu.navigateToFormsPage();

    }

    @Test
    public void PlanetTest(){

        var menu = new MenuPage(driver);
        menu.navigateToPlanetsPage();

    }

    @Test
    public void FormsInsertTest(){

        var menu = new MenuPage(driver);
        menu.navigateToFormsPage();

        var formspage = new FormsPage(driver);

        formspage.setName("Saul");
        formspage.setEmail("saul@email.com");
        formspage.setState("NSW");
        formspage.pressAgree();
        formspage.pressButton();


        Assertions.assertEquals("Thanks for your feedback Saul",formspage.getPopupMenuText());
    }


    @Test
    public void ErrorMessageTest(){

        var menu = new MenuPage(driver);
        menu.navigateToFormsPage();

        var formspage = new FormsPage(driver);

        formspage.pressButton();
        formspage.getErrorName();
        formspage.getErrorEmail();
        formspage.getErrorAgree();


        Assertions.assertEquals("Your name is required", formspage.getErrorName());
        Assertions.assertEquals("Your email is required", formspage.getErrorEmail());
        Assertions.assertEquals("You must agree to continue", formspage.getErrorAgree());

    }

    @Test
    public void DistanceToJupiterTest()
    {

        var menu = new MenuPage(driver);
        menu.navigateToPlanetsPage();

        var planetsPage = new PlanetsPage(driver);
        var jupiter = planetsPage.findPlanetTileByName("jupiter");
        Assertions.assertEquals("778,500,000 km", jupiter.getPlanetDistance());


    }

    @Test
    public void LargestPlanetDistance()
    {


        var menu = new MenuPage(driver);
        menu.navigateToPlanetsPage();

        var planetDistance = new PlanetDistance(driver);
        var distance = planetDistance.findPlanetTileByDistance("2,871,000,000 km");
        Assertions.assertEquals("Uranus", distance.getPlanetTileHeading());



    }

}
