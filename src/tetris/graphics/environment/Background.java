package tetris.graphics.environment;

/*
    Project: Tetris
    
    Class created by BiVieh
    Website: BiVieh-Dev.de
*/

import tetris.graphics.Renderable;
import tetris.graphics.Window;

import java.awt.*;

public class Background implements Renderable {

    public void render(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, tetris.graphics.Window.WIDTH, Window.HEIGHT);
    }
}
