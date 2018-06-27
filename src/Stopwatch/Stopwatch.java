package Stopwatch;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.Font;

public class Stopwatch {

	private JFrame frame;
	private boolean runningState;
	// 0表示暂停中，1表示运行中
	private String[] timelist;
	private int count = 0;
	// MM为分钟 SS为秒 MS为100毫秒HH为小时
	int MM = 0;
	int SS = 0;
	int MS = 0;
	int HH = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Stopwatch window = new Stopwatch();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Stopwatch() {
		this.runningState = false;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 503);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd E a HH:mm:ss");
		timelist = new String[10];

		JButton startButton;
		JButton countAndResetButton;
		JButton pauseAndContiueButton;
		JLabel timingLabel;
		JLabel currentTimeLabel;

		startButton = new JButton("开始");
		startButton.setBounds(170, 142, 100, 30);
		frame.getContentPane().add(startButton);

		countAndResetButton = new JButton("计数");
		countAndResetButton.setBounds(97, 142, 100, 30);
		countAndResetButton.setVisible(false);
		frame.getContentPane().add(countAndResetButton);

		pauseAndContiueButton = new JButton("暂停");
		pauseAndContiueButton.setBounds(236, 142, 100, 30);
		pauseAndContiueButton.setVisible(false);
		frame.getContentPane().add(pauseAndContiueButton);

		timingLabel = new JLabel("00:00:00:0", JLabel.CENTER);
		timingLabel.setFont(new Font("宋体", Font.PLAIN, 50));
		timingLabel.setBounds(72, 48, 289, 76);
		frame.getContentPane().add(timingLabel);

		currentTimeLabel = new JLabel(dateformat.format(new Date()));
		currentTimeLabel.setBounds(121, 10, 192, 15);
		frame.getContentPane().add(currentTimeLabel);

		JList list = new JList();
		list.setFont(new Font("宋体", Font.PLAIN, 18));
		list.setBounds(97, 197, 239, 236);
		frame.getContentPane().add(list);

		Calendar cal = Calendar.getInstance();

		// 当前时间的定时器类
		ActionListener currentTimeListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evt) {
				currentTimeLabel.setText(dateformat.format(new Date()));
			}
		};
		new Timer(1000, currentTimeListener).start();

		// 秒表计时定时器
		ActionListener runTime = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				MS += 1;
				if (MS >= 10) {
					SS++;
					MS = 0;
				}
				if (SS >= 60) {
					MM++;
					SS = 0;
				}
				if (MM >= 60) {
					HH++;
					MM = 0;
				}
				timingLabel.setText(String.format("%02d:%02d:%02d:%1d", HH, MM, SS, MS));
			}
		};

		Timer runTimer = new Timer(100, runTime);

		// 交互代码

		startButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				setRunningState(true);
				runTimer.start();
				countAndResetButton.setVisible(true);
				pauseAndContiueButton.setVisible(true);
				startButton.setVisible(false);
			}
		});
		countAndResetButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (isRunningState()) {
					if (count < 9) {
						timelist[count] = count + 1 + ". " + timingLabel.getText();
						count++;
						list.setListData(timelist);
					}

				} else {
					startButton.setVisible(true);
					countAndResetButton.setVisible(false);
					pauseAndContiueButton.setVisible(false);
					list.setListData(new String[] {});
					timingLabel.setText("00:00:00:0");
					timelist = new String[10];
					count = 0;
					pauseAndContiueButton.setText("暂停");
					countAndResetButton.setText("计数");
					// MM为分钟 SS为秒 MS为100毫秒HH为小时
					MM = 0;
					SS = 0;
					MS = 0;
					HH = 0;
				}

			}
		});
		pauseAndContiueButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (isRunningState()) {
					runTimer.stop();
					setRunningState(!isRunningState());
					pauseAndContiueButton.setText("继续");
					countAndResetButton.setText("重置");
				} else {
					runTimer.start();
					setRunningState(!isRunningState());
					pauseAndContiueButton.setText("暂停");
					countAndResetButton.setText("计数");
				}
			}
		});

	}

	public boolean isRunningState() {
		return runningState;
	}

	public void setRunningState(boolean runningState) {
		this.runningState = runningState;
	}
}
