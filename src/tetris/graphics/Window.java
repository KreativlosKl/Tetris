package tetris.graphics;

/*
    Project: Tetris
    
    Class created by BiVieh
    Website: BiVieh-Dev.de
*/

import javax.swing.*;

public class Window {

    public static final int WIDTH = 500, HEIGHT = 1000;
    private JFrame frame;
    private JLabel label;

    public Window(String title) {
        frame = new JFrame(title);
        frame.setSize(Window.WIDTH, Window.HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);

        label = new JLabel();
        label.setBounds(0, 0, Window.WIDTH, Window.HEIGHT);
        frame.add(label);
    }

    public JLabel getLabel() {
        return label;
    }
}
