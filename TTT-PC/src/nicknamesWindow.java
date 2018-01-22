import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class nicknamesWindow {

	public JFrame frame;
	private JTextField player1field;
	private JTextField player2field;
	JLabel warnLabel;

	public nicknamesWindow() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("TTT");
		frame.setBounds(100, 100, 450, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPlayer = new JLabel("Player 1 :");
		lblPlayer.setBounds(40, 39, 70, 14);
		frame.getContentPane().add(lblPlayer);
		
		player1field = new JTextField();
		player1field.setBounds(124, 36, 86, 20);
		frame.getContentPane().add(player1field);
		player1field.setColumns(10);
		
		JLabel lblPlayer_1 = new JLabel("Player 2 :");
		lblPlayer_1.setBounds(220, 39, 70, 14);
		frame.getContentPane().add(lblPlayer_1);
		
		player2field = new JTextField();
		player2field.setBounds(300, 36, 86, 20);
		frame.getContentPane().add(player2field);
		player2field.setColumns(10);
		
		JButton startBtn = new JButton("Start");
		startBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(player1field.getText().equals(player2field.getText()))) {  //If nicknames don't equal each other
				gameWindow gameWindow = new gameWindow(player1field.getText(), player2field.getText()); //creating game window
				gameWindow.frmTtt.setVisible(true);
				frame.setVisible(false); //disabling this window
				}
				else { //If nicknames equal each other
					warnLabel.setText("Please, choose different nicknames.");
				}
			}
		});
		startBtn.setBounds(170, 100, 89, 23);
		frame.getContentPane().add(startBtn);
		
		warnLabel = new JLabel("");
		warnLabel.setBounds(10, 136, 414, 14);
		frame.getContentPane().add(warnLabel);
	}
}
