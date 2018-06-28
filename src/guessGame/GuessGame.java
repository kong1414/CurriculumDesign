package guessGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/6/28 10:10
 */
public class GuessGame extends JPanel {
    private static final long serialVersionUID = 1L;
    private ImageIcon t1, t2, t3, My, Com;
    private JButton b1, b2, b3;
    private int my = 0, com = 0;
    private int flag;

    public GuessGame() {
        setBackground(Color.yellow);
        setPreferredSize(new Dimension(400, 300));
        t1 = new ImageIcon("src\\image\\石头.jpg");
        t2 = new ImageIcon("src\\image\\剪刀.jpg");
        t3 = new ImageIcon("src\\image\\布.jpg");
        My = new ImageIcon("src\\image\\请选择.jpg");
        Com = new ImageIcon("src\\image\\请选择.jpg");
        b1 = new JButton("石头");
        b2 = new JButton("剪子");
        b3 = new JButton("布");
        b1.setBackground(Color.white);
        b2.setBackground(Color.white);
        b3.setBackground(Color.white);
        ButtonListener listener = new ButtonListener();
        b1.addActionListener(listener);
        b2.addActionListener(listener);
        b3.addActionListener(listener);
        add(b1);
        add(b2);
        add(b3);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        g.setColor(Color.white);
        g.fillRect(0, 0, 400, 300);
        My.paintIcon(this, g, 80, 90);
        Com.paintIcon(this, g, 230, 90);
        g.setColor(Color.black);
        g.setFont(new Font("Arial", Font.BOLD, 16));
        g.drawString(my + "      VS      " + com, 165, 240);
        g.drawString(" VS", 190, 150);
        if (flag == 1) {
            g.drawString("Win !", 180, 70);
        } else if (flag == -1) {
            g.drawString("Lose !", 180, 70);
        } else {
            g.drawString("Draw !", 180, 70);
        }
    }

    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            Random n = new Random();
            flag = 0;
            int i = n.nextInt(3) + 1;
            if (i == 1) {
                Com = t1;
            } else if (i == 2) {
                Com = t2;
            } else {
                Com = t3;
            }

            if (event.getSource() == b1) {
                My = t1;
                if (i == 2) {
                    flag = 1;
                } else if (i == 1) {
                    flag = 0;
                } else {
                    flag = -1;
                }
            } else if (event.getSource() == b2) {
                My = t2;
                if (i == 2) {
                    flag = 0;
                } else if (i == 1) {
                    flag = -1;
                } else {
                    flag = 1;
                }
            } else {
                My = t3;
                if (i == 2) {
                    flag = -1;
                } else if (i == 1) {
                    flag = 1;
                } else {
                    flag = 0;
                }
            }

            if (flag == 1) {
                my += 1;
            } else if (flag == -1) {
                com += 1;
            }
            // System.out.println(my + " " + com);
            repaint();
        }

    }
}