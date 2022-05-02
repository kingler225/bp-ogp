package nl.han.goran.inger.bp.scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import nl.han.goran.inger.bp.entities.Kometen;

public class GameScene extends DynamicScene {

    public void setupScene() {
        setBackgroundImage("background/bg-preview-big.png", true);
    }

    public void setupEntities() {
        var groteKometen = new Kometen(new Coordinate2D(70, 430));
        addEntity(groteKometen);
    }
}
