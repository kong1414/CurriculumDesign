package barChart;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class BarChart extends JPanel {
	/**
	 * Java的序列化机制
	 */
	private static final long serialVersionUID = 1L;

	int a[] = { 0, 0, 0, 0, 0 };

	public BarChart(int[] x) {
		setBackground(new Color(255, 255, 255));
		setPreferredSize(new Dimension(500, 400));
		setFont(new Font("Arial", Font.BOLD, 16));
		for (int i = 0; i <= 4; i++)
			a[i] = x[i];
	}

	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		g.setColor(new Color(192, 192, 192));
		// 背景填充
		g.fillRect(80, 80, 320, 200);
		g.setColor(Color.black);
		// 竖线和轮廓
		g.drawRect(80, 80, 320, 200);
		g.drawLine(144, 80, 144, 280);
		g.drawLine(208, 80, 208, 280);
		g.drawLine(272, 80, 272, 280);
		g.drawLine(336, 80, 336, 280);
		g.setFont(new Font("Arial", Font.PLAIN, 12));
		// y轴刻度线
		for (int i = 1; i < 16; i++)
			g.drawLine(80, 280 - i * 13, 85, 280 - i * 13);
		// x轴标注
		for (int i = 0; i < 11; i = i + 2)
			g.drawString("" + i, 80 + (i * 64) / 2 - 5, 300);

		g.drawString(" 0 ~ 59 ", 30, 265);
		g.drawString(" 60 ~ 70 ", 30, 226);
		g.drawString(" 71 ~ 80 ", 30, 187);
		g.drawString(" 81 ~ 90 ", 30, 148);
		g.drawString("91 ~ 100 ", 30, 109);

		// 画相应的条形
		for (int i = 0; i < 5; i++) {
			g.setColor(new Color(153, 153, 255));
			// 填写指定的矩形函数（int x, int y, int width, int height）
			g.fillRect(80, 254 - 13 * i * 3, 32 * a[i], 13);
			g.setColor(Color.black);
			// 绘制指定矩形的轮廓
			g.drawRect(80, 254 - 13 * i * 3, 32 * a[i], 13);
		}
	}

}
