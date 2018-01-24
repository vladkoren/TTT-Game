import javax.swing.Icon;

public class bot extends player {
	int difficult;
	char field[][] = new char[2][2];
		bot(int difficult, Icon icon){
			super("Bot", icon);
		}
	void easyBot(){
		while(true) {
			
			if (super.ifHisTurn == true) {
				turn();
			}
		}
	}
	void turn() {
		int x = randomNumber(0,2);
		int y = randomNumber(0,2);
		if( (field[x][y]!='x')&&(field[x][y]!='0')) {
			field[x][y]=super.getType();
		}
	}
	int randomNumber(int min, int max) {
		return min + (int) (Math.random() * max);
	}
}
