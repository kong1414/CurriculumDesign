package shopping;

import javax.swing.JFrame;

public class ShoppingDemo {
	public static void main(String[] args) {
		JFrame frame = new JFrame("购物车");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new ShopSystem());

		frame.pack();
		frame.setVisible(true);
	}
}
