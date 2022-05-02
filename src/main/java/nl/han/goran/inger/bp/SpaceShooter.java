package nl.han.goran.inger.bp;

import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;
import nl.han.goran.inger.bp.scenes.GameScene;

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
        addScene(0, new GameScene());

    }
}
