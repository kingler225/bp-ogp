package nl.han.goran.inger.bp.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

public class StartScreenPlayer extends DynamicSpriteEntity {

    public StartScreenPlayer(Coordinate2D initialLocation, Size size) {
        super("player/sprites/player1.png", initialLocation, size);
    }
}
