package shopping;

import java.awt.*;
import java.awt.event.*;
import java.util.Vector;
import javax.swing.*;

public class Analog extends JPanel {
	private static final long serialVersionUID = 1L;
	private JButton Add, Out, Goto, Empty, Pay, Bill, Cls;
	private JButton topScreen, bottomScreen;
	private JTextField Name, Num, Price, GotoPlace;
	private JTextArea Record;
	private JScrollPane scr;
	private JLabel p1, p2, p3;
	private Vector<Goods> V;// 存放商品的数组
	private String s;
	ButtonListener listener = new ButtonListener();

	public Analog() {
		setPreferredSize(new Dimension(640, 400));
		setInterface();
		addListener();
		V = new Vector<Goods>(30, 10);
		s = "";
	}

	public void addListener() {
		Add.addActionListener(listener);
		Out.addActionListener(listener);
		//Goto.addActionListener(listener);
		Empty.addActionListener(listener);
		Pay.addActionListener(listener);
		Bill.addActionListener(listener);
		Cls.addActionListener(listener);
		topScreen.addActionListener(listener);
		bottomScreen.addActionListener(listener);
	}

	public void setInterface() {
		p1 = new JLabel("品名：");
		p2 = new JLabel("数量：");
		p3 = new JLabel("单价：");
		Name = new JTextField(10);
		Num = new JTextField(10);
		Price = new JTextField(10);
		Add = new JButton("添加");
		Add.setBackground(Color.white);
		Out = new JButton("删除");
		Out.setBackground(Color.white);
		add(p1);
		add(Name);
		add(p2);
		add(Num);
		add(p3);
		add(Price);
		add(Add);
		add(Out);
		add(Box.createHorizontalStrut(30000));
		
		Empty = new JButton("清空");
		Empty.setBackground(Color.white);
		Pay = new JButton("付款");
		Pay.setBackground(Color.white);
		Bill = new JButton("清单");
		Bill.setBackground(Color.white);
		Cls = new JButton("清屏");
		Cls.setBackground(Color.white);
		topScreen = new JButton("首位");
		topScreen.setBackground(Color.white);
		bottomScreen = new JButton("末位");
		bottomScreen.setBackground(Color.white);

		add(Empty);
		add(Pay);
		add(Bill);
		add(Cls);
		add(topScreen);
		add(bottomScreen);
		add(Box.createHorizontalStrut(30000));

		Record = new JTextArea(15, 40);
		Record.setLineWrap(true);// 如果内容过长。自动换行
		Record.setEditable(false);

		scr = new JScrollPane(Record, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scr.setBackground(Color.white);

		add(scr);
	}

	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == Add) {
				String name;
				int num;
				double price;
				name = Name.getText();
				num = Integer.parseInt(Num.getText());
				price = Double.parseDouble(Price.getText());
				V.add(new Goods(name, num, price));
				s += "添加第" + V.size() + "条记录：" + V.get(V.size() - 1).toString() + "\n";
				Record.setText(s);
			} else if (event.getSource() == Pay) {
				double sum = 0.0;
				for (int i = 0; i < V.size(); i++) {
					sum += V.get(i).getSum();
				}
				s += "您购买了" + V.size() + "件物品，总计：" + sum + "元。请付款，谢谢。\n";
				Record.setText(s);
			} else if (event.getSource() == Cls) {
				s = "";
				Record.setText(s);
			} else if (event.getSource() == Empty) {
				s = "";
				while (V.size() != 0)
					V.remove(0);
				Record.setText(s);
			} else if (event.getSource() == Bill) {
				s += "您购物车里的物品有：\n";
				for (int i = 0; i < V.size(); i++) {
					s += "第" + (i + 1) + "种：" + V.get(i).toString() + "\n";
				}
				Record.setText(s);
			} else if (event.getSource() == Out) {
				String str = "您购物车里的物品有：\n";
				for (int i = 0; i < V.size(); i++) {
					str += "第" + (i + 1) + "种：" + V.get(i).toString() + "\n";
				}
				str += "请输入欲删除的物品序号：";
				String n = JOptionPane.showInputDialog(str);
				int num = -1;
				if (n != null && !n.isEmpty())
					num = Integer.parseInt(n);

				if (num != -1) {
					num--;
					if (num < V.size()) {
						JOptionPane.showMessageDialog(null,
								" 物品：" + V.get(num).toString() + "\n" + "                           已删除！");
						s += "删除1件物品：" + V.get(num).toString() + "\n";
						V.remove(num);
					} else {
						JOptionPane.showMessageDialog(null, "对不起！该物品不存在！");
					}
					Record.setText(s);
				}
			} else if (event.getSource() == topScreen) {
				Record.setCaretPosition(0);
			} else if (event.getSource() == bottomScreen) {
				Record.setCaretPosition(s.length());
			}
		}
	}
}