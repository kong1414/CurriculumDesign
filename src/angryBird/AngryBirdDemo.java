package angryBird;

import javax.swing.*;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/6/27 10:22
 */
public class AngryBirdDemo {
    public static void main (String[] args)
    {
        JFrame frame = new JFrame("愤怒的小鸟");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new AngryBird());
        frame.pack();
        frame.setVisible(true);
    }

}
