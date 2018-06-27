package shopping;

import javax.swing.*;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/6/27 09:14
 */
public class ShoppingDemo {
	public static void main(String[] args) {
		JFrame frame = new JFrame("购物车");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.getContentPane().add(new ShopSystem());
		frame.pack();
		frame.setVisible(true);
	}
}
