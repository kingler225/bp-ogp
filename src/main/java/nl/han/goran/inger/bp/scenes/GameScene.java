package nl.han.goran.inger.bp.scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.EntitySpawnerContainer;
import com.github.hanyaeger.api.scenes.DynamicScene;
import nl.han.goran.inger.bp.entities.Kometen;
import nl.han.goran.inger.bp.entities.KometenSpawner;

public class GameScene extends DynamicScene implements EntitySpawnerContainer {

    public void setupScene() {
        setBackgroundImage("background/bg-preview-big.png", true);
    }

    public void setupEntities() {

    }

    @Override
    public void setupEntitySpawners() {
        addEntitySpawner(new KometenSpawner(getWidth(), getHeight()));
    }
}
