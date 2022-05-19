package nl.han.goran.inger.bp.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Direction;
import com.github.hanyaeger.api.entities.SceneBorderTouchingWatcher;
import com.github.hanyaeger.api.entities.impl.DynamicCircleEntity;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.scenes.SceneBorder;

public class Kometen extends DynamicSpriteEntity implements SceneBorderTouchingWatcher {

   public Kometen(Coordinate2D location){
       super("asteroids/asteroid.png", location);
       setMotion(2, 270d);
    }

    @Override
    public void setDirection(Direction newDirection) {
        super.setDirection(newDirection);
    }

    @Override
    public void notifyBoundaryTouching(SceneBorder border) {

    }
}

