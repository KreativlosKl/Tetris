package tetris.game;

/*
    Project: Tetris
    
    Class created by BiVieh
    Website: BiVieh-Dev.de
*/

import tetris.graphics.environment.Background;
import tetris.graphics.Window;

import java.awt.*;

public class Game implements Runnable {

    private Thread thread;
    private Window window;

    private Background background;

    public Game(String title) {
        thread = new Thread(this);
        window = new Window(title);

        background = new Background();
    }

    public void start() {
        thread.start();
    }

    private void tick() {

    }

    private void render(Graphics g) {
        background.render(g);
    }

    @Override
    public void run() {
        while(true) {
            tick();
            render(window.getLabel().getGraphics());
        }
    }
}
