package worldCup;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Demo extends JFrame {
	public static void main(String[] args) {
		JFrame frame = new JFrame("WorldCup");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.getContentPane().add(new WorldCup());
		frame.setSize(465, 550);
		frame.setVisible(true);
	}
}
