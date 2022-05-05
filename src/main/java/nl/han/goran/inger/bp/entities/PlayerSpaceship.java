package nl.han.goran.inger.bp.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Direction;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.userinput.KeyListener;
import javafx.scene.input.KeyCode;
import nl.han.goran.inger.bp.scenes.GameScene;

import java.util.Set;

public class PlayerSpaceship extends DynamicSpriteEntity implements KeyListener {
    //    TODO: gebruik de andere player sprites wanneer het ship omhoog of omlaag gaat.
    //    TODO: toon de juiste sprite wanneer de speler schiet en pas de sprite sheet aan. Deze is nog niet goed.
    final GameScene gameScene;

    public PlayerSpaceship(Coordinate2D initialLocation, GameScene gameScene) {
        // de resource en size in deze class en de StartScreenPlayer class zijn hetzelfde...
        // overerving gebruiken?
        super("player/player_sprite_sheet.png", initialLocation, new Size(90), 1, 6);
        this.gameScene = gameScene;
    }

    @Override
    public void onPressedKeysChange(Set<KeyCode> set) {
        gameScene.setxPlayerLocationInScene(getLocationInScene().getX());
        gameScene.setyPlayerLocationInScene(getLocationInScene().getY());

        var speed = 7;
        if (set.contains(KeyCode.RIGHT) && set.contains(KeyCode.UP)) {
            setMotion(speed, 135d);
            setCurrentFrameIndex(2);
        } else if (set.contains(KeyCode.RIGHT) && set.contains(KeyCode.DOWN)) {
            setMotion(speed, 45d);
            setCurrentFrameIndex(1);
        } else if (set.contains(KeyCode.LEFT) && set.contains(KeyCode.UP)) {
            setMotion(speed, 225d);
            setCurrentFrameIndex(2);
        } else if (set.contains(KeyCode.LEFT) && set.contains(KeyCode.DOWN)) {
            setMotion(speed, 315d);
            setCurrentFrameIndex(1);
        } else if (set.contains(KeyCode.LEFT)) {
            setMotion(speed, Direction.LEFT);
            setCurrentFrameIndex(0);
        } else if (set.contains(KeyCode.RIGHT)) {
            setMotion(speed, Direction.RIGHT);
            setCurrentFrameIndex(0);
        } else if (set.contains(KeyCode.UP)) {
            setMotion(speed, Direction.UP);
            setCurrentFrameIndex(2);
        } else if (set.contains(KeyCode.DOWN)) {
            setMotion(speed, Direction.DOWN);
            setCurrentFrameIndex(1);
        } else if (set.contains(KeyCode.SPACE)) {
            setCurrentFrameIndex(3);
        } else {
            setSpeed(0);
            setCurrentFrameIndex(0);
        }
    }
}
