package wallClock;

import java.awt.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.Timer;
import java.awt.event.*;
import javax.swing.*;

public class WallClock extends JPanel {
	private static final long serialVersionUID = 1L;
	private Timer timer;
	private JLabel label;
	private int h1 = 0, h2 = 0, h3 = 0, h4 = 0;
	private int m1 = 0, m2 = 0, m3 = 0, m4 = 0;
	private int s1 = 0, s2 = 0, s3 = 0, s4 = 0;

	public WallClock() {
		setBackground(Color.white);
		setPreferredSize(new Dimension(430, 400));
		setFont(new Font("Arial", Font.BOLD, 12));
		label = new JLabel();
		label.setFont(new Font("Arial", Font.BOLD, 20));
		add(label);
		timer = new Timer(100, new ReboundListener());
		timer.start();
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		g.setColor(Color.blue);
		// 画圆形
		g.drawOval(100, 100, 200, 200);
		g.setColor(Color.black);
		// 画刻度
		g.drawString("12", 195, 125);
		g.drawString("9", 115, 205);
		g.drawString("6", 195, 285);
		g.drawString("3", 280, 205);

		Calendar ca = new GregorianCalendar();
		int h = ca.get(Calendar.HOUR); // 获取小时
		int m = ca.get(Calendar.MINUTE); // 获取分钟
		int s = ca.get(Calendar.SECOND); // 获取秒
		// System.out.println(h + " " + m + " " + s);
		// 画板刷新，避免出现绘图重复
		g.setColor(new Color(238, 238, 238));
		g.fillRect(0, 0, 400, 100);
		label.setLocation(150, 40);
		label.setText(String.format("%02d : %02d : %02d", h, m, s));

		if (h >= 12) {
			h -= 12;
		}
		// 计算总时间
		int sum = h * 3600 + m * 60 + s;
		double theta, PI = 3.14159;
		double X[] = { 200.0, 200.0 }, Y[] = { 200.0, 160 };
		// 每次偏转值
		theta = sum * 1.0 / 120;
		// 化为弧度
		theta *= (PI / 180);
		double mycos = Math.cos(theta);
		double mysin = Math.sin(theta);
		double XX, YY;
		// 将旋转前的坐标值存入XX,YY
		XX = X[1] - X[0];
		YY = Y[1] - Y[0];
		X[1] = (double) (XX * mycos - YY * mysin);
		Y[1] = (double) (XX * mysin + YY * mycos);
		X[1] = X[1] + X[0];
		Y[1] = Y[1] + Y[0];
		// 覆盖之前的指针，以免出现画面拖影
		g.setColor(new Color(238, 238, 238));
		g.drawLine(h1, h2, h3, h4);
		g.setColor(Color.black);
		h1 = (int) X[0];
		h2 = (int) Y[0];
		h3 = (int) X[1];
		h4 = (int) Y[1];
		g.drawLine(h1, h2, h3, h4);

		sum = m * 60 + s;
		X[1] = 200.0;
		Y[1] = 140.0;
		theta = sum * 1.0 / 10;
		theta *= (PI / 180);
		mycos = Math.cos(theta);
		mysin = Math.sin(theta);
		XX = X[1] - X[0];
		YY = Y[1] - Y[0];
		X[1] = (double) (XX * mycos - YY * mysin);
		Y[1] = (double) (XX * mysin + YY * mycos);
		X[1] = X[1] + X[0];
		Y[1] = Y[1] + Y[0];
		g.setColor(new Color(238, 238, 238));
		g.drawLine(m1, m2, m3, m4);
		g.setColor(Color.black);
		m1 = (int) X[0];
		m2 = (int) Y[0];
		m3 = (int) X[1];
		m4 = (int) Y[1];
		g.drawLine(m1, m2, m3, m4);

		sum = s;
		X[1] = 200.0;
		Y[1] = 120.0;
		// 计算角度
		theta = sum * 6.0;
		theta *= (PI / 180);
		mycos = Math.cos(theta);
		mysin = Math.sin(theta);
		XX = X[1] - X[0];
		YY = Y[1] - Y[0];
		X[1] = (double) (XX * mycos - YY * mysin);
		Y[1] = (double) (XX * mysin + YY * mycos);
		X[1] = X[1] + X[0];
		Y[1] = Y[1] + Y[0];
		g.setColor(new Color(238, 238, 238));
		g.drawLine(s1, s2, s3, s4);
		g.setColor(Color.black);
		s1 = (int) X[0];
		s2 = (int) Y[0];
		s3 = (int) X[1];
		s4 = (int) Y[1];
		g.drawLine(s1, s2, s3, s4);
	}

	private class ReboundListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent event) {
			repaint();
		}
	}

}