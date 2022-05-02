package nl.han.goran.inger.bp.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.DynamicCircleEntity;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

public class Kometen extends DynamicCircleEntity{

    /**
     * Create a new {@link DynamicCircleEntity} on the given {@code initialLocation}.
     *
     * @param initialLocation the initial position at which this {@link DynamicCircleEntity} should be placed
     */
    protected Kometen(Coordinate2D initialLocation) {
        super(initialLocation);
    }
}

