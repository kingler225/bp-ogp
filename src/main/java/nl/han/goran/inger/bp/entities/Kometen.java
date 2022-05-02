package nl.han.goran.inger.bp.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

public class Kometen extends DynamicSpriteEntity{
    public Kometen(Coordinate2D initialLocation) {
        super("asteroids/asteroid-small.png", initialLocation, new Size(1757, 126), 1, 14);
        setAutoCycle(20);
    }
}

