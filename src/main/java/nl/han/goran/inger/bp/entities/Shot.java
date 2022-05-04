package nl.han.goran.inger.bp.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

public class Shot extends DynamicSpriteEntity {
    protected Shot(Coordinate2D initialLocation) {
        super("shoot/shoot1.png", initialLocation);
    }
}
