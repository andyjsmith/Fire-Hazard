package firehazard;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class core extends ApplicationAdapter {
    SpriteBatch batch;
    BitmapFont font;
    DubstepGun dubstepGun = new DubstepGun();

    @Override
    public void create() {
        // Define the SpriteBatch for drawing and the BitmapFont for drawing text
        batch = new SpriteBatch();
        font = new BitmapFont();

        // Load the dubstep gun
        dubstepGun.loadGun();
    }

    @Override
    public void dispose() {
    }

    @Override
    public void render() {
        // Clear the screen and set the color
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        // Update the dubstep gun's rendering
        dubstepGun.update();

        // Drawing the FPS counter
        batch.begin();
        font.draw(batch, "FPS: " + Gdx.graphics.getFramesPerSecond(), 20, 20);
        batch.end();
    }
}
