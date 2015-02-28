package firehazard;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Common {
    public static BitmapFont font;
    public static SpriteBatch batch;

    public static void init(){
        font = new BitmapFont();
        batch = new SpriteBatch();
    }

    public static void drawFPS(){
        font.draw(batch, "FPS: " + Gdx.graphics.getFramesPerSecond(), 20, 20);
    }
}