package guessGame;

import javax.swing.*;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/6/27 10:10
 */
public class GuessGameDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GuessGame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GuessGame p = new GuessGame();
        frame.getContentPane().add(p);
        frame.pack();
        frame.setVisible(true);

    }
}
