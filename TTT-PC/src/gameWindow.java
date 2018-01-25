import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class gameWindow {

	public JFrame frmTtt;
	private JLabel infoLbl;
	player player1;
	player player2;
	gameField field = new gameField(); //game field
	Icon xIcon = new ImageIcon("res/img/xIcon.png");
	Icon oIcon = new ImageIcon("res/img/oIcon.png");
	JButton btn00;
	JButton btn01;
	JButton btn02;
	JButton btn10;
	JButton btn11;
	JButton btn12;
	JButton btn20;
	JButton btn21;
	JButton btn22;


	public gameWindow(String nickname1, String nickname2) {
		player1 = new player(nickname1, xIcon);
		player2 = new player(nickname2, oIcon);
		player1.setType('x');
		player2.setType('0');
		initialize();
		printFieldConsole();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTtt = new JFrame();
		frmTtt.setTitle("TTT");
		frmTtt.setBounds(100, 100, 500, 500);
		frmTtt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTtt.getContentPane().setLayout(null);
		
		infoLbl = new JLabel("");
		infoLbl.setBounds(10, 11, 372, 30);
		frmTtt.getContentPane().add(infoLbl);
		
		btn00 = new JButton("");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				buttonPressed(btn00, 0, 0);
			}
		});
		btn00.setBounds(90, 100, 100, 100);
		frmTtt.getContentPane().add(btn00);
		
		btn01 = new JButton("");
		btn01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonPressed(btn01, 0, 1);
			}
		});
		btn01.setBounds(200, 100, 100, 100);
		frmTtt.getContentPane().add(btn01);
		
		btn02 = new JButton("");
		btn02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonPressed(btn02, 0, 2);
			}
		});
		btn02.setBounds(310, 100, 100, 100);
		frmTtt.getContentPane().add(btn02);
		
		btn10 = new JButton("");
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonPressed(btn10, 1, 0);
			}
		});
		btn10.setBounds(90, 211, 100, 100);
		frmTtt.getContentPane().add(btn10);
		
		btn11 = new JButton("");
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonPressed(btn11, 1, 1);
			}
		});
		btn11.setBounds(200, 211, 100, 100);
		frmTtt.getContentPane().add(btn11);
		
		btn12 = new JButton("");
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonPressed(btn12, 1, 2);
			}
		});
		btn12.setBounds(310, 211, 100, 100);
		frmTtt.getContentPane().add(btn12);
		
		btn20 = new JButton("");
		btn20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonPressed(btn20, 2, 0);
			}
		});
		btn20.setBounds(90, 322, 100, 100);
		frmTtt.getContentPane().add(btn20);
		
		btn21 = new JButton("");
		btn21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonPressed(btn21, 2, 1);
			}
		});
		btn21.setBounds(200, 322, 100, 100);
		frmTtt.getContentPane().add(btn21);
		
		btn22 = new JButton("");
		btn22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonPressed(btn22, 2, 2);
			}
		});
		btn22.setBounds(310, 322, 100, 100);
		frmTtt.getContentPane().add(btn22);
		
		infoLbl.setText(player1.getNickname() + "'s turn");
		
		JButton restartBtn = new JButton("Restart");
		restartBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nicknamesWindow window = null;
				window = new nicknamesWindow();
				window.frame.setVisible(true);
				frmTtt.setVisible(false);
			}
		});
		restartBtn.setBounds(385, 15, 89, 23);
		frmTtt.getContentPane().add(restartBtn);
		player1.ifHisTurn = true;
	}
	
	void checkForWin() {  //checking for win
		if( ((field.getSquare(0, 0)==field.getSquare(0, 1))&&(field.getSquare(0, 1)==field.getSquare(0, 2)))) {
			if(field.getSquare(0, 0)==player1.getType()) {
				win(player1);
			}
			else if(field.getSquare(0, 0)==player2.getType()) {
				win(player2);
			}
		}
		else if(((field.getSquare(1, 0)==field.getSquare(1, 1))&&(field.getSquare(1, 1)==field.getSquare(1, 2)))){
			if(field.getSquare(1, 0)==player1.getType()) {
				win(player1);
			}
			else if(field.getSquare(1, 0)==player2.getType()){
				win(player2);
			}
		}
		else if (((field.getSquare(2, 0)==field.getSquare(2, 1))&&(field.getSquare(2, 1)==field.getSquare(2, 2)))) {
			if(field.getSquare(2, 0)==player1.getType()) {
				win(player1);
			}
			else if(field.getSquare(2, 0)==player2.getType()){
				win(player2);
			}
		}
		else if((field.getSquare(0, 0)==field.getSquare(1, 0))&&(field.getSquare(1, 0)==field.getSquare(2, 0))) {
			if(field.getSquare(0, 0)==player1.getType()) {
				win(player1);
			}
			else if(field.getSquare(0, 0)==player2.getType()){
				win(player2);
			}
		}
		else if((field.getSquare(0, 1)==field.getSquare(1, 1))&&(field.getSquare(1, 1)==field.getSquare(2, 1))) {
			if(field.getSquare(0, 1)==player1.getType()) {
				win(player1);
			}
			else if(field.getSquare(0, 1)==player2.getType()){
				win(player2);
			}
		}
		else if((field.getSquare(0, 2)==field.getSquare(1, 2))&&(field.getSquare(1, 2)==field.getSquare(2, 2))) {
			if(field.getSquare(0, 2)==player1.getType()) {
				win(player1);
			}
			else if(field.getSquare(0, 2)==player2.getType()){
				win(player2);
			}
		}
		else if(((field.getSquare(0, 0)==field.getSquare(1, 1))&&(field.getSquare(1, 1)==field.getSquare(2, 2))||((field.getSquare(0, 2)==field.getSquare(1, 1))&&(field.getSquare(1, 1)==field.getSquare(2, 0))))){
			if(field.getSquare(1, 1)==player1.getType()) {
				win(player1);
			}
			else if(field.getSquare(1, 1)==player2.getType()){
				win(player2);
			}
		}
	}
	void buttonPressed(JButton btn, int x, int y) {
		if(player1.ifHisTurn==true) {
			btn.setIcon(player1.getIcon());
			player1.turn(x, y, field);
			player1.ifHisTurn=false;
			player2.ifHisTurn=true;
		}
		else {
			btn.setIcon(player2.getIcon());
			player2.turn(x, y, field);
			player1.ifHisTurn=true;
			player2.ifHisTurn=false;
		}
		btn.setEnabled(false);
		printFieldConsole();
		nextTurn();
		checkForWin();
	}
	void printFieldConsole() {
		for(int x = 0; x<3; x++) {
			for(int y = 0; y<3; y++) {
				System.out.print(field.getSquare(x, y));
			}
			System.out.println();
		}
		System.out.println();
	}
	void nextTurn() {
		if(player1.ifHisTurn==true) {
			infoLbl.setText(player1.getNickname() + "'s turn");
		}
		else {
			infoLbl.setText(player2.getNickname() + "'s turn");
		}
	}
	void win(player player) {
		infoLbl.setText(player.getNickname() + " wins!");
		btn00.setEnabled(false);
		btn01.setEnabled(false);
		btn02.setEnabled(false);
		btn10.setEnabled(false);
		btn11.setEnabled(false);
		btn12.setEnabled(false);
		btn20.setEnabled(false);
		btn21.setEnabled(false);
		btn22.setEnabled(false);
	}
}
