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
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JButton btn4;
	JButton btn5;
	JButton btn6;
	JButton btn7;
	JButton btn8;
	JButton btn9;


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
		infoLbl.setBounds(10, 11, 464, 30);
		frmTtt.getContentPane().add(infoLbl);
		
		btn1 = new JButton("");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(player1.ifHisTurn==true) {
					btn1.setIcon(player1.getIcon());
					field[0][0] = player1.getType();
					player1.ifHisTurn = false;
				}
				else {
					btn1.setIcon(player2.getIcon());
					field[0][0] = player2.getType();
					player1.ifHisTurn = true;
				}
				btn1.setEnabled(false);
				printFieldConsole();
				nextTurn();
				checkForWin();
			}
		});
		btn1.setBounds(90, 100, 100, 100);
		frmTtt.getContentPane().add(btn1);
		
		btn2 = new JButton("");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(player1.ifHisTurn==true) {
					btn2.setIcon(player1.getIcon());
					field[0][1] = player1.getType();
					player1.ifHisTurn = false;
				}
				else {
					btn2.setIcon(player2.getIcon());
					field[0][1] = player2.getType();
					player1.ifHisTurn = true;
				}
				btn2.setEnabled(false);
				printFieldConsole();
				nextTurn();
				checkForWin();
			}
		});
		btn2.setBounds(200, 100, 100, 100);
		frmTtt.getContentPane().add(btn2);
		
		btn3 = new JButton("");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(player1.ifHisTurn==true) {
					btn3.setIcon(player1.getIcon());
					field[0][2] = player1.getType();
					player1.ifHisTurn = false;
				}
				else {
					btn3.setIcon(player2.getIcon());
					field[0][2] = player2.getType();
					player1.ifHisTurn = true;
				}
				btn3.setEnabled(false);
				printFieldConsole();
				nextTurn();
				checkForWin();
			}
		});
		btn3.setBounds(310, 100, 100, 100);
		frmTtt.getContentPane().add(btn3);
		
		btn4 = new JButton("");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(player1.ifHisTurn==true) {
					btn4.setIcon(player1.getIcon());
					field[1][0] = player1.getType();
					player1.ifHisTurn=false;
				}
				else {
					btn4.setIcon(player2.getIcon());
					field[1][0] = player2.getType();
					player1.ifHisTurn=true;
				}
				btn4.setEnabled(false);
				printFieldConsole();
				nextTurn();
				checkForWin();
			}
		});
		btn4.setBounds(90, 211, 100, 100);
		frmTtt.getContentPane().add(btn4);
		
		btn5 = new JButton("");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(player1.ifHisTurn==true) {
					btn5.setIcon(player1.getIcon());
					field[1][1] = player1.getType();
					player1.ifHisTurn=false;
				}
				else {
					btn5.setIcon(player2.getIcon());
					field[1][1] = player2.getType();
					player1.ifHisTurn=true;
				}
				btn5.setEnabled(false);
				printFieldConsole();
				nextTurn();
				checkForWin();
			}
		});
		btn5.setBounds(200, 211, 100, 100);
		frmTtt.getContentPane().add(btn5);
		
		btn6 = new JButton("");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(player1.ifHisTurn==true) {
					btn6.setIcon(player1.getIcon());
					field[1][2] = player1.getType();
					player1.ifHisTurn=false;
				}
				else {
					btn6.setIcon(player2.getIcon());
					field[1][2] = player2.getType();
					player1.ifHisTurn=true;
				}
				btn6.setEnabled(false);
				printFieldConsole();
				nextTurn();
				checkForWin();
			}
		});
		btn6.setBounds(310, 211, 100, 100);
		frmTtt.getContentPane().add(btn6);
		
		btn7 = new JButton("");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(player1.ifHisTurn==true) {
					btn7.setIcon(player1.getIcon());
					field[2][0] = player1.getType();
					player1.ifHisTurn=false;
				}
				else {
					btn7.setIcon(player2.getIcon());
					field[2][0] = player2.getType();
					player1.ifHisTurn=true;
				}
				btn7.setEnabled(false);
				printFieldConsole();
				nextTurn();
				checkForWin();
			}
		});
		btn7.setBounds(90, 322, 100, 100);
		frmTtt.getContentPane().add(btn7);
		
		btn8 = new JButton("");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(player1.ifHisTurn==true) {
					btn8.setIcon(player1.getIcon());
					field[2][1] = player1.getType();
					player1.ifHisTurn=false;
				}
				else {
					btn8.setIcon(player2.getIcon());
					field[2][1] = player2.getType();
					player1.ifHisTurn=true;
				}
				btn8.setEnabled(false);
				printFieldConsole();
				nextTurn();
				checkForWin();
			}
		});
		btn8.setBounds(200, 322, 100, 100);
		frmTtt.getContentPane().add(btn8);
		
		btn9 = new JButton("");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(player1.ifHisTurn==true) {
					btn9.setIcon(player1.getIcon());
					field[2][2] = player1.getType();
					player1.ifHisTurn=false;
				}
				else {
					btn9.setIcon(player2.getIcon());
					field[2][2] = player2.getType();
					player1.ifHisTurn=true;
				}
				btn9.setEnabled(false);
				printFieldConsole();
				nextTurn();
				checkForWin();
			}
		});
		btn9.setBounds(310, 322, 100, 100);
		frmTtt.getContentPane().add(btn9);
		
		infoLbl.setText(player1.getNickname() + "'s turn");
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
		btn1.setEnabled(false);
		btn2.setEnabled(false);
		btn3.setEnabled(false);
		btn4.setEnabled(false);
		btn5.setEnabled(false);
		btn6.setEnabled(false);
		btn7.setEnabled(false);
		btn8.setEnabled(false);
		btn9.setEnabled(false);
	}
	
}
