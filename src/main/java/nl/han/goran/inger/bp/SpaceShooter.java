package nl.han.goran.inger.bp;

import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.api.entities.impl.CustomFont;
import nl.han.goran.inger.bp.scenes.StartScene;

public class SpaceShooter extends YaegerGame {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void setupGame() {
        setGameTitle("Space Shooter");
        setSize(new Size(800, 600));
    }

    @Override
    public void setupScenes() {
        var startSceneFont = new CustomFont("fonts/RobotoMono-Medium.ttf", 50);
        addScene(0, new StartScene(startSceneFont));
    }
}
