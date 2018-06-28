package wallClock;

import javax.swing.JFrame;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/6/28 14:20
 */
public class WallClockDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Wall Clock");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new WallClock());
        frame.pack();
        frame.setVisible(true);
    }
}
