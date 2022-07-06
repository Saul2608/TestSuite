

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PlanetDistance {

    private WebDriver driver;

    public PlanetDistance(WebDriver driver)
    {

        this.driver = driver;

    }
    private List<WebElement> getPlanetTiles()

    {
        return driver.findElements(By.className("planet"));
    }

    public PlanetTile findPlanetTileByDistance(String planetDistance)
    {
        PlanetTile foundPlanetTile = null;
        var tiles = getPlanetTiles();
        for (WebElement tile : tiles)
        {

            var currentTile = new PlanetTile(tile);
            if (currentTile.getPlanetDistance().equalsIgnoreCase(planetDistance))
            {

                foundPlanetTile = currentTile;
                break;
            }
        }

        if (foundPlanetTile == null) throw (new NotFoundException());
        return foundPlanetTile;

    }

}
