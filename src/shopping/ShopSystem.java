package shopping;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import javax.swing.JTextArea;

import java.util.Vector;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/6/27 09:27
 */
class ShopSystem extends JPanel {

    private static final long serialVersionUID = 1L;

    private JButton addButton;
    // 添加
    private JButton delButton;
    // 删除
    private JButton emptybutton;
    // 清空
    private JButton paybutton;
    // 付款
    private JButton billbutton;
    // 清单
    private JButton clsButton;
    // 清屏
    private JButton topScreenButton, bottomScreenButton;
    // 首位末尾
    private JTextField nameField;
    private JTextField numField;
    private JTextField priceField;
    private JTextArea recordTextArea;
    // 记录
    private JScrollPane screen;
    // 记录的屏幕
    private Vector<Goods> data;
    // 存放商品的数组
    private String s;
    // 记录里的字符串，用拼接的方式累加

    ButtonListener listener = new ButtonListener();
    private JTextArea textArea;

    ShopSystem() {
        setLayout(null);
        setPreferredSize(new Dimension(640, 400));

        JLabel nameLabel = new JLabel("品名");
        nameLabel.setBounds(21, 10, 54, 15);
        add(nameLabel);

        nameField = new JTextField(10);
        nameField.setBounds(90, 7, 66, 21);
        add(nameField);
        nameField.setColumns(10);

        JLabel numLabel = new JLabel("数量");
        numLabel.setBounds(173, 10, 54, 15);
        add(numLabel);

        numField = new JTextField(10);
        numField.setBounds(249, 7, 66, 21);
        add(numField);
        numField.setColumns(10);

        JLabel priceLabel = new JLabel("单价");
        priceLabel.setBounds(332, 10, 54, 15);
        add(priceLabel);

        priceField = new JTextField(10);
        priceField.setBounds(396, 7, 66, 21);
        add(priceField);
        priceField.setColumns(10);

        addButton = new JButton("添加");
        addButton.setBounds(480, 10, 66, 23);
        addButton.setBackground(Color.white);
        add(addButton);

        delButton = new JButton("删除");
        delButton.setBounds(562, 10, 71, 23);
        add(delButton);

        emptybutton = new JButton("清空");
        emptybutton.setBounds(38, 56, 93, 23);
        add(emptybutton);

        paybutton = new JButton("付款");
        paybutton.setBounds(147, 56, 93, 23);
        add(paybutton);

        billbutton = new JButton("清单");
        billbutton.setBounds(260, 56, 93, 23);
        add(billbutton);

        clsButton = new JButton("清屏");
        clsButton.setBounds(381, 56, 93, 23);
        add(clsButton);

        topScreenButton = new JButton("首位");
        topScreenButton.setBounds(525, 314, 93, 23);
        add(topScreenButton);

        bottomScreenButton = new JButton("末位");
        bottomScreenButton.setBounds(525, 347, 93, 23);
        add(bottomScreenButton);

        recordTextArea = new JTextArea(15, 40);
        recordTextArea.setBounds(382, 128, 228, 257);
        recordTextArea.setLineWrap(true);
        // 如果内容过长。自动换行
        recordTextArea.setEditable(false);
        // add(recordTextArea);

        screen = new JScrollPane(recordTextArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        screen.setSize(401, 270);
        screen.setLocation(100, 100);
        screen.setBackground(Color.white);
        add(screen);

        // 初始化数组
        data = new Vector<Goods>(30, 10);
        s = "";
        addButton.addActionListener(listener);
        delButton.addActionListener(listener);
        emptybutton.addActionListener(listener);
        paybutton.addActionListener(listener);
        billbutton.addActionListener(listener);
        clsButton.addActionListener(listener);
        topScreenButton.addActionListener(listener);
        bottomScreenButton.addActionListener(listener);

    }

    private class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == addButton) {
                try {
                    String name = nameField.getText();
                    int num = Integer.parseInt(numField.getText());
                    double price = Double.parseDouble(priceField.getText());
                    data.add(new Goods(name, num, price));
                    s += "添加第" + data.size() + "条记录：" + data.get(data.size() - 1).toString() + "\n";
                    recordTextArea.setText(s);
                } catch (Exception exception) {
                    numField.setText(null);
                    priceField.setText(null);
                    JOptionPane.showMessageDialog(null, "输入不合法");
                }

            } else if (e.getSource() == delButton) {
                if (data.size() == 0) {
                    JOptionPane.showMessageDialog(null, "购物车里无商品，请先添加商品！");
                    return;
                }
                String str = "您购物车里的物品有：\n";
                for (int i = 0; i < data.size(); i++) {
                    str += "第" + (i + 1) + "种：" + data.get(i).toString() + "\n";
                }
                str += "请输入欲删除的物品序号：";
                String n = JOptionPane.showInputDialog(str);
                int num = -1;
                if (n != null && !n.isEmpty()) {
                    num = Integer.parseInt(n);
                }

                if (num != -1) {
                    num--;
                    if (num < data.size()) {
                        JOptionPane.showMessageDialog(null, " 物品：" + data.get(num).toString() + "\n" + "已删除！");
                        s += "删除1件物品：" + data.get(num).toString() + "\n";
                        data.remove(num);
                    } else {
                        JOptionPane.showMessageDialog(null, "对不起！该物品不存在！");
                    }
                    recordTextArea.setText(s);
                }
            } else if (e.getSource() == emptybutton) {
                s = "";
                while (data.size() != 0) {
                    data.remove(0);
                }
                recordTextArea.setText(s);
            } else if (e.getSource() == paybutton) {
                if (data.size() == 0) {
                    s += "请先添加商品";
                    recordTextArea.setText(s);
                    return;
                }
                double sum = 0.0;
                for (int i = 0; i < data.size(); i++) {
                    sum += data.get(i).getSum();
                }

                s += "您购买了" + data.size() + "件物品，总计：" + sum + "元。请付款，谢谢。\n";
                recordTextArea.setText(s);
                // 付完款后清空购物车
                while (data.size() != 0) {
                    data.remove(0);
                }
            } else if (e.getSource() == billbutton) {
                if (data.size() == 0) {
                    s += "购物车里无商品";
                    recordTextArea.setText(s);
                    return;
                }
                s += "您购物车里的物品有：\n";
                for (int i = 0; i < data.size(); i++) {
                    s += "第" + (i + 1) + "种：" + data.get(i).toString() + "\n";
                }
                recordTextArea.setText(s);
            } else if (e.getSource() == clsButton) {
                s = "";
                recordTextArea.setText(s);
            } else if (e.getSource() == topScreenButton) {
                recordTextArea.setCaretPosition(0);
            } else if (e.getSource() == bottomScreenButton) {
                recordTextArea.setCaretPosition(s.length());
            }

        }
    }
}