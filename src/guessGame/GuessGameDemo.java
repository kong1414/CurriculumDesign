package guessGame;

import javax.swing.*;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/6/28 10:10
 */
public class GuessGameDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GuessGame");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(new GuessGame());
        frame.pack();
        frame.setVisible(true);
    }
}
