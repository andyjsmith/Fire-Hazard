package firehazard;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;

public class Core extends ApplicationAdapter {
    DubstepGun dubstepGun = new DubstepGun();

    @Override
    public void create() {
        // Load the dubstep gun
        dubstepGun.loadGun();
        Common.init();
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
        Common.batch.begin();
        dubstepGun.update();
        Common.drawFPS();
        Common.batch.end();
    }
}
