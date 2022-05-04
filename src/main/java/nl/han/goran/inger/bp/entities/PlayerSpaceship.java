package nl.han.goran.inger.bp.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Direction;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.userinput.KeyListener;
import javafx.scene.input.KeyCode;
import nl.han.goran.inger.bp.scenes.GameScene;

import java.util.Set;

public class PlayerSpaceship extends DynamicSpriteEntity implements KeyListener  {
    //    TODO: gebruik de andere player sprites wanneer het ship omhoog of omlaag gaat.
    final GameScene gameScene;
    public PlayerSpaceship(Coordinate2D initialLocation, GameScene gameScene) {
        // de resource en size in deze class en de StartScreenPlayer class zijn hetzelfde...
        // overerving gebruiken?
        super("player/sprites/player1.png", initialLocation, new Size(80));
        this.gameScene = gameScene;
    }

    @Override
    public void onPressedKeysChange(Set<KeyCode> set) {
        gameScene.setxPlayerLocationInScene(getLocationInScene().getX());
        gameScene.setyPlayerLocationInScene(getLocationInScene().getY());

        var speed = 7;
        if (set.contains(KeyCode.RIGHT) && set.contains(KeyCode.UP)) {
            setMotion(speed, 135d);
        } else if (set.contains(KeyCode.RIGHT) && set.contains(KeyCode.DOWN)) {
            setMotion(speed, 45d);
        } else if (set.contains(KeyCode.LEFT) && set.contains(KeyCode.UP)) {
            setMotion(speed, 225d);
        } else if (set.contains(KeyCode.LEFT) && set.contains(KeyCode.DOWN)) {
            setMotion(speed, 315d);
        } else if (set.contains(KeyCode.LEFT)) {
            setMotion(speed, Direction.LEFT);
        } else if (set.contains(KeyCode.RIGHT)) {
            setMotion(speed, Direction.RIGHT);
        } else if (set.contains(KeyCode.UP)) {
            setMotion(speed, Direction.UP);
        } else if (set.contains(KeyCode.DOWN)) {
            setMotion(speed, Direction.DOWN);
        } else {
            setSpeed(0);
        }
    }
}
