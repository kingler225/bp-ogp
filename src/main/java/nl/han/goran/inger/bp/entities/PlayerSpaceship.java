package nl.han.goran.inger.bp.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

public class PlayerSpaceship extends DynamicSpriteEntity {
    public PlayerSpaceship(Coordinate2D initialLocation) {
        super("player/sprites/player1.png", initialLocation);
    }
}
