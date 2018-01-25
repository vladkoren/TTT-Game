
public class gameField {
	char field[][] = new char[3][3];
	gameField() {
		
	}
	void setSquare(int x, int y, char icon) {
		field[x][y] = icon;
	}
	char getSquare(int x, int y) {
		return field[x][y];
	}
}
