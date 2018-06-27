package angryBird;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/6/27 10:23
 */
public class AngryBird extends JPanel {
    private final int WIDTH = 500, HEIGHT = 500;
    private final int DELAY = 30, IMAGE_SIZE = 50;
    private ImageIcon image01;
    private Timer timer;
    private double a = 0.3;
    private double x, y, moveX, moveY;

    //-----------------------------------------------------------------
    // Sets up the panel, including the timer for the animation.
    //-----------------------------------------------------------------
    public AngryBird() {
        timer = new Timer(DELAY, new ReboundListener());
        image01 = new ImageIcon("src\\image\\angryBird.png");

        x = 0;
        y = 0;
        moveX = 3;
        moveY = 0;

        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.black);
        timer.start();
    }

    //-----------------------------------------------------------------
    // Draws the image in the current location.
    //-----------------------------------------------------------------
    @Override
    public void paintComponent(Graphics page) {
        super.paintComponent(page);
        image01.paintIcon(this, page, (int) x, (int) y);

    }

    //*****************************************************************
    // Represents the action listener for the timer.
    //*****************************************************************
    private class ReboundListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            x += moveX;
            moveY += a;
            y += moveY;
            if (x <= 0 || x >= WIDTH - IMAGE_SIZE) {
                moveX = moveX * -1;
            }

            if (y <= 0 || y >= HEIGHT - IMAGE_SIZE) {
                moveY = moveY * -1;
            }

            repaint();
        }
    }
}


