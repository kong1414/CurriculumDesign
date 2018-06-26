package wallClock;

import javax.swing.JFrame;

public class WallClockDemo {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Wall Clock");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		WallClock panel = new WallClock();

		frame.getContentPane().add(panel);

		frame.pack();
		frame.setVisible(true);
	}
}
