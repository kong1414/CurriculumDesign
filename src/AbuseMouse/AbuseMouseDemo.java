package abuseMouse;

import javax.swing.*;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/6/25 08:30
 */
public class AbuseMouseDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Abuse Mouse");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(new AbuseMouse());
        frame.pack();
        frame.setVisible(true);
    }
}
