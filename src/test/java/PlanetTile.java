

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PlanetTile

{

    private WebElement element;

    public PlanetTile(WebElement el)
    {
        this.element = el;
    }

    public String getPlanetTileHeading() {

        return element.findElement(By.tagName("h2")).getText();

    }

    public String getPlanetDistance() {

        return element.findElement(By.className("distance")).getText();

    }
}