package nl.han.goran.inger.bp.scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.YaegerEntity;
import com.github.hanyaeger.api.entities.impl.CustomFont;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.hanyaeger.api.userinput.KeyListener;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import nl.han.goran.inger.bp.entities.StartScreenPlayer;

import java.util.Set;

public class StartScene extends DynamicScene implements KeyListener {
    private CustomFont font;
    private double xStart;
    private double yStart;
    private double xPlayerLocation;
    private double yPlayerLocation;

    public StartScene(CustomFont font) {
        this.font = font;
        this.xStart = getWidth() / 2;
        this.yStart = getHeight() / 2;
        this.xPlayerLocation = this.xStart - 100;
        this.yPlayerLocation = this.yStart + 5;
    }

    @Override
    public void setupScene() {
        setBackgroundImage("background/bg-preview-big.png", true);
        setBackgroundAudio("music/exports/space-asteroids.mp3");
    }

    @Override
    public void setupEntities() {
        var offSet = 100;
        var playerSize = new Size(80);

        var textLocation = new Coordinate2D(this.xStart + offSet, yStart);
        var startGameText = new TextEntity(textLocation, "Start Game");

        var player = new StartScreenPlayer(new Coordinate2D(this.xPlayerLocation, this.yPlayerLocation), playerSize);

        startGameText.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        startGameText.setFill(Color.WHITE);
        startGameText.setFont(this.font);

        player.setAnchorPoint(AnchorPoint.CENTER_CENTER);

        addEntity(startGameText);
        addEntity(player);
    }

    @Override
    public void onPressedKeysChange(Set<KeyCode> set) {
//        if (set.contains(KeyCode.DOWN)) {
//        }
    }
}
