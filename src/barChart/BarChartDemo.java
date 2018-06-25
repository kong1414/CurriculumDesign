package barChart;

import java.util.Random;

import javax.swing.JFrame;

public class BarChartDemo {
	public static void main(String[] args) {
		// 初始化信息
		int x[] = { 98, 88, 77, 66, 55, 44, 30, 88, 85, 99, 76, 99, 95 };
		int[] a = new int[5];
		for (int i = 0; i < x.length; i++) {
			if (x[i] < 60 && x[i] >= 0)
				a[0]++;
			else if (x[i] >= 60 && x[i] <= 70)
				a[1]++;
			else if (x[i] > 70 && x[i] <= 80)
				a[2]++;
			else if (x[i] > 80 && x[i] <= 90)
				a[3]++;
			else
				a[4]++;
		}
		JFrame frame = new JFrame("Bar Chart");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BarChart panel = new BarChart(a);

		frame.getContentPane().add(panel);

		frame.pack();
		frame.setVisible(true);
	}

}
