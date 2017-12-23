import java.awt.EventQueue;

import javax.swing.JFrame;

public class gameWindow {

	public JFrame frame;
	private String player1name;
	private String player2name;


	public gameWindow(String nickname1, String nickname2) {
		initialize();
		player1name = nickname1;
		player2name = nickname2;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
