package worldCup;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerNumberModel;
import java.awt.Font;

public class WorldCup extends JPanel {
	private JTextField teamNameField1;
	private JTextField teamNameField2;
	private JTextField teamNameField3;
	private JTextField teamNameField4;
	private Team team[] = new Team[4];

	/**
	 * Create the panel.
	 */
	public WorldCup() {
		setLayout(null);

		JLabel teamNameLabel = new JLabel("请先输入四个球队名");
		teamNameLabel.setFont(new Font("宋体", Font.PLAIN, 16));
		teamNameLabel.setBounds(23, 24, 156, 21);
		add(teamNameLabel);

		teamNameField1 = new JTextField();
		teamNameField1.setBounds(26, 81, 80, 25);
		add(teamNameField1);
		teamNameField1.setColumns(10);

		teamNameField2 = new JTextField();
		teamNameField2.setBounds(132, 81, 80, 25);
		add(teamNameField2);
		teamNameField2.setColumns(10);

		teamNameField3 = new JTextField();
		teamNameField3.setBounds(238, 81, 80, 25);
		add(teamNameField3);
		teamNameField3.setColumns(10);

		teamNameField4 = new JTextField();
		teamNameField4.setBounds(344, 81, 80, 25);
		add(teamNameField4);
		teamNameField4.setColumns(10);

		JButton confirmButton = new JButton("确定");
		confirmButton.setBounds(88, 123, 93, 23);
		add(confirmButton);

		JButton resetButton = new JButton("重置");
		resetButton.setBounds(269, 123, 93, 23);
		add(resetButton);

		JLabel NameLabelA1 = new JLabel("");
		NameLabelA1.setHorizontalAlignment(SwingConstants.RIGHT);
		NameLabelA1.setBounds(23, 184, 100, 25);
		add(NameLabelA1);

		JSpinner spinnerA1 = new JSpinner();
		spinnerA1.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinnerA1.setBounds(146, 184, 35, 25);
		add(spinnerA1);

		JLabel VsLabel1 = new JLabel("VS");
		VsLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		VsLabel1.setBounds(204, 184, 40, 25);
		add(VsLabel1);

		JSpinner spinnerB1 = new JSpinner();
		spinnerB1.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinnerB1.setBounds(267, 184, 35, 25);
		add(spinnerB1);

		JLabel NameLabelB1 = new JLabel("");
		NameLabelB1.setBounds(325, 184, 100, 25);
		add(NameLabelB1);

		JLabel NameLabelA2 = new JLabel("");
		NameLabelA2.setHorizontalAlignment(SwingConstants.RIGHT);
		NameLabelA2.setBounds(23, 219, 100, 25);
		add(NameLabelA2);

		JSpinner spinnerA2 = new JSpinner();
		spinnerA2.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinnerA2.setBounds(146, 219, 35, 25);
		add(spinnerA2);

		JLabel VsLabel2 = new JLabel("VS");
		VsLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		VsLabel2.setBounds(204, 219, 40, 25);
		add(VsLabel2);

		JSpinner spinnerC1 = new JSpinner();
		spinnerC1.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinnerC1.setBounds(267, 219, 35, 25);
		add(spinnerC1);

		JLabel NameLabelC1 = new JLabel("");
		NameLabelC1.setBounds(325, 219, 100, 25);
		add(NameLabelC1);

		JLabel NameLabelA3 = new JLabel("");
		NameLabelA3.setHorizontalAlignment(SwingConstants.RIGHT);
		NameLabelA3.setBounds(23, 254, 100, 25);
		add(NameLabelA3);

		JSpinner spinnerA3 = new JSpinner();
		spinnerA3.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinnerA3.setBounds(146, 254, 35, 25);
		add(spinnerA3);

		JLabel VsLabel3 = new JLabel("VS");
		VsLabel3.setHorizontalAlignment(SwingConstants.CENTER);
		VsLabel3.setBounds(204, 254, 40, 25);
		add(VsLabel3);

		JSpinner spinnerD1 = new JSpinner();
		spinnerD1.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinnerD1.setBounds(267, 254, 35, 25);
		add(spinnerD1);

		JLabel NameLabelD1 = new JLabel("");
		NameLabelD1.setBounds(325, 254, 100, 25);
		add(NameLabelD1);

		JLabel NameLabelB2 = new JLabel("");
		NameLabelB2.setHorizontalAlignment(SwingConstants.RIGHT);
		NameLabelB2.setBounds(23, 289, 100, 25);
		add(NameLabelB2);

		JSpinner spinnerB2 = new JSpinner();
		spinnerB2.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinnerB2.setBounds(146, 289, 35, 25);
		add(spinnerB2);

		JLabel VsLabel4 = new JLabel("VS");
		VsLabel4.setHorizontalAlignment(SwingConstants.CENTER);
		VsLabel4.setBounds(204, 289, 40, 25);
		add(VsLabel4);

		JSpinner spinnerC2 = new JSpinner();
		spinnerC2.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinnerC2.setBounds(267, 289, 35, 25);
		add(spinnerC2);

		JLabel NameLabelC2 = new JLabel("");
		NameLabelC2.setBounds(325, 289, 100, 25);
		add(NameLabelC2);

		JLabel NameLabelB3 = new JLabel("");
		NameLabelB3.setHorizontalAlignment(SwingConstants.RIGHT);
		NameLabelB3.setBounds(23, 324, 100, 25);
		add(NameLabelB3);

		JSpinner spinnerB3 = new JSpinner();
		spinnerB3.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinnerB3.setBounds(146, 324, 35, 25);
		add(spinnerB3);

		JLabel VsLabel5 = new JLabel("VS");
		VsLabel5.setHorizontalAlignment(SwingConstants.CENTER);
		VsLabel5.setBounds(204, 324, 40, 25);
		add(VsLabel5);

		JSpinner spinnerD2 = new JSpinner();
		spinnerD2.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinnerD2.setBounds(267, 324, 35, 25);
		add(spinnerD2);

		JLabel NameLabelD2 = new JLabel("");
		NameLabelD2.setBounds(325, 324, 100, 25);
		add(NameLabelD2);

		JLabel NameLabelC3 = new JLabel("");
		NameLabelC3.setHorizontalAlignment(SwingConstants.RIGHT);
		NameLabelC3.setBounds(23, 359, 100, 25);
		add(NameLabelC3);

		JSpinner spinnerC3 = new JSpinner();
		spinnerC3.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinnerC3.setBounds(146, 359, 35, 25);
		add(spinnerC3);

		JLabel VsLabel6 = new JLabel("VS");
		VsLabel6.setHorizontalAlignment(SwingConstants.CENTER);
		VsLabel6.setBounds(204, 359, 40, 25);
		add(VsLabel6);

		JSpinner spinnerD3 = new JSpinner();
		spinnerD3.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinnerD3.setBounds(267, 359, 35, 25);
		add(spinnerD3);

		JLabel NameLabelD3 = new JLabel("");
		NameLabelD3.setBounds(325, 359, 100, 25);
		add(NameLabelD3);

		JButton sortButton1 = new JButton("自定义排序");
		sortButton1.setBounds(7, 424, 140, 30);
		sortButton1.setVisible(false);
		add(sortButton1);

		JButton sortButton2 = new JButton("Arrays类排序");
		sortButton2.setBounds(154, 424, 140, 30);
		sortButton2.setVisible(false);
		add(sortButton2);

		JButton sortButton3 = new JButton("Collections类排序");
		sortButton3.setBounds(301, 424, 140, 30);
		sortButton3.setVisible(false);
		add(sortButton3);

		confirmButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				NameLabelA1.setText(teamNameField1.getText());
				NameLabelA2.setText(teamNameField1.getText());
				NameLabelA3.setText(teamNameField1.getText());
				NameLabelB1.setText(teamNameField2.getText());
				NameLabelB2.setText(teamNameField2.getText());
				NameLabelB3.setText(teamNameField2.getText());
				NameLabelC1.setText(teamNameField3.getText());
				NameLabelC2.setText(teamNameField3.getText());
				NameLabelC3.setText(teamNameField3.getText());
				NameLabelD1.setText(teamNameField4.getText());
				NameLabelD2.setText(teamNameField4.getText());
				NameLabelD3.setText(teamNameField4.getText());
				sortButton1.setVisible(true);
				sortButton2.setVisible(true);
				sortButton3.setVisible(true);
			}
		});
		resetButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) { // 全部清空重置
				teamNameField1.setText("");
				teamNameField2.setText("");
				teamNameField3.setText("");
				teamNameField4.setText("");
				NameLabelA1.setText("");
				NameLabelA2.setText("");
				NameLabelA3.setText("");
				NameLabelB1.setText("");
				NameLabelB2.setText("");
				NameLabelB3.setText("");
				NameLabelC1.setText("");
				NameLabelC2.setText("");
				NameLabelC3.setText("");
				NameLabelD1.setText("");
				NameLabelD2.setText("");
				NameLabelD3.setText("");
				sortButton1.setVisible(false);
				sortButton2.setVisible(false);
				sortButton3.setVisible(false);
			}
		});

		sortButton1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				team[0] = new Team(teamNameField1.getText());
				team[1] = new Team(teamNameField2.getText());
				team[2] = new Team(teamNameField3.getText());
				team[3] = new Team(teamNameField4.getText());
				team[0].game(team[0], team[1], (int) spinnerA1.getValue(), (int) spinnerB1.getValue());
				team[0].game(team[0], team[2], (int) spinnerA2.getValue(), (int) spinnerC1.getValue());
				team[0].game(team[0], team[3], (int) spinnerA3.getValue(), (int) spinnerD1.getValue());
				team[1].game(team[1], team[2], (int) spinnerB2.getValue(), (int) spinnerC2.getValue());
				team[1].game(team[1], team[3], (int) spinnerB3.getValue(), (int) spinnerD2.getValue());
				team[2].game(team[2], team[3], (int) spinnerC3.getValue(), (int) spinnerD3.getValue());
				Sort1 sort1 = new Sort1();// 自定义排序
				sort1.sort(team);
				JOptionPane.showMessageDialog(null, sort1.sort(team));
			}
		});
		sortButton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				team[0] = new Team(teamNameField1.getText());
				team[1] = new Team(teamNameField2.getText());
				team[2] = new Team(teamNameField3.getText());
				team[3] = new Team(teamNameField4.getText());
				team[0].game(team[0], team[1], (int) spinnerA1.getValue(), (int) spinnerB1.getValue());
				team[0].game(team[0], team[2], (int) spinnerA2.getValue(), (int) spinnerC1.getValue());
				team[0].game(team[0], team[3], (int) spinnerA3.getValue(), (int) spinnerD1.getValue());
				team[1].game(team[1], team[2], (int) spinnerB2.getValue(), (int) spinnerC2.getValue());
				team[1].game(team[1], team[3], (int) spinnerB3.getValue(), (int) spinnerD2.getValue());
				team[2].game(team[2], team[3], (int) spinnerC3.getValue(), (int) spinnerD3.getValue());
				Sort2 sort2 = new Sort2();// Arrays类排序
				sort2.sort(team);
				JOptionPane.showMessageDialog(null, sort2.sort(team));
			}
		});
		sortButton3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				team[0] = new Team(teamNameField1.getText());
				team[1] = new Team(teamNameField2.getText());
				team[2] = new Team(teamNameField3.getText());
				team[3] = new Team(teamNameField4.getText());
				team[0].game(team[0], team[1], (int) spinnerA1.getValue(), (int) spinnerB1.getValue());
				team[0].game(team[0], team[2], (int) spinnerA2.getValue(), (int) spinnerC1.getValue());
				team[0].game(team[0], team[3], (int) spinnerA3.getValue(), (int) spinnerD1.getValue());
				team[1].game(team[1], team[2], (int) spinnerB2.getValue(), (int) spinnerC2.getValue());
				team[1].game(team[1], team[3], (int) spinnerB3.getValue(), (int) spinnerD2.getValue());
				team[2].game(team[2], team[3], (int) spinnerC3.getValue(), (int) spinnerD3.getValue());
				Sort3 sort3 = new Sort3();// Collections类排序
				sort3.sort(team);
				JOptionPane.showMessageDialog(null, sort3.sort(team));
			}
		});

	}
}
