package nl.han.goran.inger.bp.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

public class PlayerSpaceship extends DynamicSpriteEntity {
    public PlayerSpaceship(Coordinate2D initialLocation) {
        // de resource en size in deze class en de StartScreenPlayer class zijn hetzelfde...
        // overerving gebruiken?
        super("player/sprites/player1.png", initialLocation, new Size(80));
    }
}
