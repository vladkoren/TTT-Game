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
	char [][] field = new char[3][3]; //game field
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
				if(player1.ifHisTurn==true) {
					btn00.setIcon(player1.getIcon());
					field[0][0] = player1.getType();
					player1.ifHisTurn = false;
				}
				else {
					btn00.setIcon(player2.getIcon());
					field[0][0] = player2.getType();
					player1.ifHisTurn = true;
				}
				btn00.setEnabled(false);
				printFieldConsole();
				nextTurn();
				checkForWin();
			}
		});
		btn00.setBounds(90, 100, 100, 100);
		frmTtt.getContentPane().add(btn00);
		
		btn01 = new JButton("");
		btn01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(player1.ifHisTurn==true) {
					btn01.setIcon(player1.getIcon());
					field[0][1] = player1.getType();
					player1.ifHisTurn = false;
				}
				else {
					btn01.setIcon(player2.getIcon());
					field[0][1] = player2.getType();
					player1.ifHisTurn = true;
				}
				btn01.setEnabled(false);
				printFieldConsole();
				nextTurn();
				checkForWin();
			}
		});
		btn01.setBounds(200, 100, 100, 100);
		frmTtt.getContentPane().add(btn01);
		
		btn02 = new JButton("");
		btn02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(player1.ifHisTurn==true) {
					btn02.setIcon(player1.getIcon());
					field[0][2] = player1.getType();
					player1.ifHisTurn = false;
				}
				else {
					btn02.setIcon(player2.getIcon());
					field[0][2] = player2.getType();
					player1.ifHisTurn = true;
				}
				btn02.setEnabled(false);
				printFieldConsole();
				nextTurn();
				checkForWin();
			}
		});
		btn02.setBounds(310, 100, 100, 100);
		frmTtt.getContentPane().add(btn02);
		
		btn10 = new JButton("");
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(player1.ifHisTurn==true) {
					btn10.setIcon(player1.getIcon());
					field[1][0] = player1.getType();
					player1.ifHisTurn=false;
				}
				else {
					btn10.setIcon(player2.getIcon());
					field[1][0] = player2.getType();
					player1.ifHisTurn=true;
				}
				btn10.setEnabled(false);
				printFieldConsole();
				nextTurn();
				checkForWin();
			}
		});
		btn10.setBounds(90, 211, 100, 100);
		frmTtt.getContentPane().add(btn10);
		
		btn11 = new JButton("");
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(player1.ifHisTurn==true) {
					btn11.setIcon(player1.getIcon());
					field[1][1] = player1.getType();
					player1.ifHisTurn=false;
				}
				else {
					btn11.setIcon(player2.getIcon());
					field[1][1] = player2.getType();
					player1.ifHisTurn=true;
				}
				btn11.setEnabled(false);
				printFieldConsole();
				nextTurn();
				checkForWin();
			}
		});
		btn11.setBounds(200, 211, 100, 100);
		frmTtt.getContentPane().add(btn11);
		
		btn12 = new JButton("");
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(player1.ifHisTurn==true) {
					btn12.setIcon(player1.getIcon());
					field[1][2] = player1.getType();
					player1.ifHisTurn=false;
				}
				else {
					btn12.setIcon(player2.getIcon());
					field[1][2] = player2.getType();
					player1.ifHisTurn=true;
				}
				btn12.setEnabled(false);
				printFieldConsole();
				nextTurn();
				checkForWin();
			}
		});
		btn12.setBounds(310, 211, 100, 100);
		frmTtt.getContentPane().add(btn12);
		
		btn20 = new JButton("");
		btn20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(player1.ifHisTurn==true) {
					btn20.setIcon(player1.getIcon());
					field[2][0] = player1.getType();
					player1.ifHisTurn=false;
				}
				else {
					btn20.setIcon(player2.getIcon());
					field[2][0] = player2.getType();
					player1.ifHisTurn=true;
				}
				btn20.setEnabled(false);
				printFieldConsole();
				nextTurn();
				checkForWin();
			}
		});
		btn20.setBounds(90, 322, 100, 100);
		frmTtt.getContentPane().add(btn20);
		
		btn21 = new JButton("");
		btn21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(player1.ifHisTurn==true) {
					btn21.setIcon(player1.getIcon());
					field[2][1] = player1.getType();
					player1.ifHisTurn=false;
				}
				else {
					btn21.setIcon(player2.getIcon());
					field[2][1] = player2.getType();
					player1.ifHisTurn=true;
				}
				btn21.setEnabled(false);
				printFieldConsole();
				nextTurn();
				checkForWin();
			}
		});
		btn21.setBounds(200, 322, 100, 100);
		frmTtt.getContentPane().add(btn21);
		
		btn22 = new JButton("");
		btn22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(player1.ifHisTurn==true) {
					btn22.setIcon(player1.getIcon());
					field[2][2] = player1.getType();
					player1.ifHisTurn=false;
				}
				else {
					btn22.setIcon(player2.getIcon());
					field[2][2] = player2.getType();
					player1.ifHisTurn=true;
				}
				btn22.setEnabled(false);
				printFieldConsole();
				nextTurn();
				checkForWin();
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
		if( ((field[0][0]==field[0][1])&&(field[0][1]==field[0][2]))) {
			if(field[0][0]==player1.getType()) {
				win(player1);
			}
			else if(field[0][0]==player2.getType()) {
				win(player2);
			}
		}
		else if(((field[1][0]==field[1][1])&&(field[1][1]==field[1][2]))){
			if(field[1][1]==player1.getType()) {
				win(player1);
			}
			else if(field[1][1]==player2.getType()){
				win(player2);
			}
		}
		else if (((field[2][0]==field[2][1])&&(field[1][1]==field[2][2]))) {
			if(field[2][1]==player1.getType()) {
				win(player1);
			}
			else if(field[2][1]==player2.getType()){
				win(player2);
			}
		}
		else if((field[0][0]==field[1][0])&&(field[1][0]==field[2][0])) {
			if(field[0][0]==player1.getType()) {
				win(player1);
			}
			else if(field[0][0]==player2.getType()){
				win(player2);
			}
		}
		else if((field[0][1]==field[1][1])&&(field[1][1]==field[2][1])) {
			if(field[0][1]==player1.getType()) {
				win(player1);
			}
			else if(field[0][1]==player2.getType()){
				win(player2);
			}
		}
		else if((field[0][2]==field[1][2])&&(field[2][1]==field[2][2])) {
			if(field[0][2]==player1.getType()) {
				win(player1);
			}
			else if(field[0][2]==player2.getType()){
				win(player2);
			}
		}
		else if(((field[0][0]==field[1][1])&&(field[1][1]==field[2][2])||((field[0][2]==field[1][1])&&(field[1][1]==field[2][0])))){
			if(field[1][1]==player1.getType()) {
				win(player1);
			}
			else if(field[1][1]==player2.getType()){
				win(player2);
			}
		}
	}
	void printFieldConsole() {
		for(int x = 0; x<3; x++) {
			for(int y = 0; y<3; y++) {
				System.out.print(field[x][y]);
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
