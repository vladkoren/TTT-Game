import javax.swing.Icon;

public class player {
	private String name;
	private char type;
	boolean ifHisTurn;
	private Icon icon;
	
	public player(String nickname, Icon inIcon) { //Initializing player
		setNickname(nickname);
		setIcon(inIcon);
	}
	
	void setNickname(String nickname){ //set player's nickname
		name = nickname;
	}
	
	String getNickname() { //return player's nickname
		return name;
	}
	
	void setType(char enterType) {  //set player's symbol('x' or '0')
		if((enterType =='x') || (enterType=='0')) {
			type = enterType;
		}
	}	
	
	char getType() { //return player's symbol
		return type;
	}	
	
	void setIcon(Icon inIcon) {
		icon = inIcon;
	}
	
	Icon getIcon() {
		return icon;
	}
	
	void turn(int x, int y, gameField field) {
		field.setSquare(x, y, type);
	}
	
}
