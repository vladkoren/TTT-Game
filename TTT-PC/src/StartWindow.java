import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StartWindow {

	private JFrame frmTtt;
	private static StartWindow startWindow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					startWindow = new StartWindow();
					startWindow.frmTtt.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StartWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTtt = new JFrame();
		frmTtt.setTitle("TTT");
		frmTtt.setBounds(100, 100, 350, 120);
		frmTtt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTtt.getContentPane().setLayout(null);
		
		JButton playerGameBtn = new JButton("1vs1 game");
		playerGameBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nicknamesWindow window = null;
				window = new nicknamesWindow();
				window.frame.setVisible(true);
				startWindow.frmTtt.setVisible(false);
			}
		});
		playerGameBtn.setBounds(45, 30, 100, 23);
		frmTtt.getContentPane().add(playerGameBtn);
		
		JButton btnNewButton = new JButton("AI game");
		btnNewButton.setEnabled(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(189, 30, 100, 23);
		frmTtt.getContentPane().add(btnNewButton);
	}
}
