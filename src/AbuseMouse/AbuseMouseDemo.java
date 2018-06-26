package AbuseMouse;

import javax.swing.JFrame;

public class AbuseMouseDemo {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Abuse Mouse");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new AbuseMouse());
		frame.pack();
		frame.setVisible(true);
	}
}
