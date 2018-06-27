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
    private ImageIcon T1, T2, T3, My, Com;
    private JButton B1, B2, B3;
    private int my = 0, com = 0;
    private int tf;
    private ButtonListener listener = new ButtonListener();

    public GuessGame() {
        setBackground(Color.yellow);
        setPreferredSize(new Dimension(400, 300));
        T1 = new ImageIcon("src\\image\\石头.png");
        T2 = new ImageIcon("src\\image\\剪子.png");
        T3 = new ImageIcon("src\\image\\布.png");
        My = new ImageIcon("src\\image\\请选择.png");
        Com = new ImageIcon("src\\image\\请选择.png");
        B1 = new JButton("石头");
        B2 = new JButton("剪子");
        B3 = new JButton("布");
        B1.addActionListener(listener);
        B2.addActionListener(listener);
        B3.addActionListener(listener);
        add(B1);
        add(B2);
        add(B3);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        g.setColor(Color.white);
        g.fillRect(0, 0, 400, 300);
        My.paintIcon(this, g, 80, 80);
        Com.paintIcon(this, g, 230, 80);
        g.setColor(Color.black);
        g.setFont(new Font("Arial", Font.BOLD, 18));
        g.drawString("          ( You )       " + my + "      VS      " + com + "      ( Computer  )", 0, 60);
        g.drawString(" VS", 190, 130);
        if (tf == 1) {
            g.drawString("          You Win !", 120, 220);
        } else if (tf == -1) {
            g.drawString("     Computer Win !", 120, 220);
        } else {
            g.drawString("It ends in a draw !", 120, 220);
        }
    }

    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            Random n = new Random();
            tf = 0;
            int i = n.nextInt(3) + 1;
            if (i == 1) {
                Com = T1;
            } else if (i == 2) {
                Com = T2;
            } else {
                Com = T3;
            }

            if (event.getSource() == B1) {
                My = T1;
                if (i == 2) {
                    tf = 1;
                } else if (i == 1) {
                    tf = 0;
                } else {
                    tf = -1;
                }
            } else if (event.getSource() == B2) {
                My = T2;
                if (i == 2) {
                    tf = 0;
                } else if (i == 1) {
                    tf = -1;
                } else {
                    tf = 1;
                }
            } else {
                My = T3;
                if (i == 2) {
                    tf = -1;
                } else if (i == 1) {
                    tf = 1;
                } else {
                    tf = 0;
                }
            }

            if (tf == 1) {
                my += 1;
            } else if (tf == -1) {
                com += 1;
            }
            System.out.println(my + " " + com);
            repaint();
        }

    }
}