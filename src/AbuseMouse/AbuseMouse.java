package abuseMouse;

import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.Calendar;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/6/25 08:22
 */
class AbuseMouse extends JPanel {
    private static final long serialVersionUID = 1L;
    private int sum = 0, setTime = 60;
    private boolean running = false;
    private JLabel timeLabel;
    private JButton beginButton;
    private JButton pushButton;
    private JSpinner spinner;
    private Calendar tstart, tend;
    private Timer timer;

    AbuseMouse() {
        setLayout(null);
        setPreferredSize(new Dimension(400, 400));

        JLabel label = new JLabel("选择挑战时间");
        label.setBounds(22, 49, 144, 33);
        label.setFont(new Font("微软雅黑", Font.PLAIN, 24));
        add(label);

        beginButton = new JButton("开始挑战");
        beginButton.setBounds(273, 49, 103, 33);
        beginButton.setBackground(Color.white);
        add(beginButton);

        pushButton = new JButton("PUSH");
        pushButton.setBounds(133, 246, 133, 67);
        pushButton.setFont(new Font("宋体", Font.PLAIN, 38));
        pushButton.setBackground(Color.white);
        add(pushButton);

        timeLabel = new JLabel("剩余**秒");
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        timeLabel.setFont(new Font("宋体", Font.PLAIN, 24));
        timeLabel.setBounds(133, 168, 133, 43);
        add(timeLabel);

        spinner = new JSpinner();
        spinner.setBounds(188, 49, 63, 33);
        spinner.setModel(new SpinnerNumberModel(setTime, 1, null, 1));
        add(spinner);

        timer = new Timer(100, e -> {
            tend = Calendar.getInstance();
            long t = tend.getTimeInMillis() - tstart.getTimeInMillis();
            t /= 1000;
            timeLabel.setText("剩余" + (setTime - t) + "秒");
            if (t == setTime) {
                timer.stop();
                JOptionPane.showMessageDialog(null, "点击了" + sum + "下");
                beginButton.setVisible(true);
                pushButton.setText("PUSH");
                spinner.setEnabled(true);
                sum = 0;
            }
        });

        beginButton.addActionListener(e -> {
            beginButton.setVisible(false);
            running = true;
            setTime = (int) spinner.getValue();
            spinner.setEnabled(false);
            tstart = Calendar.getInstance();
            timer.start();
        });

        pushButton.addActionListener(e -> {
            if (running) {
                sum++;
                pushButton.setText("" + sum);
            }
        });
    }
}
