package test;

import tictactoe.TicTacToeBoard;
import tictactoe.TicTacToeBoardImpl_Porter;

public class TicTacToeTest {
	
	public static void main(String[] args) {
		String output = "";
		output += position(0, 0) + " ";
		output += position(0, 1) + " ";
		output += position(0, 2) + " ";
		output += position(1, 0) + " ";
		output += position(1, 1) + " ";
		output += position(1, 2) + " ";
		output += position(2, 0) + " ";
		output += position(2, 1) + " ";
		output += position(2, 2);
		System.out.println(output);
	}
	
	public static int position(int row, int column) {
        assert row < 3 && row >= 0 && column < 3 && column >= 0;
        return row * 3 + column;
    }

}
