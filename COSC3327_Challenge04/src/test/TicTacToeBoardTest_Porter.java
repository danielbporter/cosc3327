package test;

import org.junit.Before;
import org.junit.Test;

import tictactoe.Mark;
import tictactoe.TicTacToeBoard;
import tictactoe.TicTacToeBoardImpl_Porter;

public class TicTacToeBoardTest_Porter {
	
	private TicTacToeBoard board;

	@Before
	public void setUp() {
		board = new TicTacToeBoardImpl_Porter();
	}
	
	@Test
	public void emptyBoardTest() {
		for(int row = 0; row < TicTacToeBoard.ROW_COUNT; row++) {
			for(int column = 0; column < TicTacToeBoard.COLUMN_COUNT; column++) {
				assert(board.getMark(row, column) == null);
			}
		}
		assert !board.isGameOver();
	}

	@Test
	public void fullBoardTest() {
		board.setMark(0, 0);
		board.setMark(0, 1);
		board.setMark(0, 2);
		board.setMark(1, 1);
		board.setMark(1, 0);
		board.setMark(1, 2);
		board.setMark(2, 1);
		board.setMark(2, 0);
		board.setMark(2, 2);
	}
	
	@Test
	public void checkHorizontalWin() {
		board.setMark(0, 0);
		board.setMark(1, 1);
		board.setMark(0, 2);
		board.setMark(1, 0);
		board.setMark(0, 1);
		assert board.getWinner() == Mark.X;
		
		setUp();
		board.setMark(1, 0);
		board.setMark(0, 0);
		board.setMark(2, 0);
		board.setMark(0, 1);
		board.setMark(1, 1);
		board.setMark(0, 2);
		assert board.getWinner() == Mark.O;
		
	}
	
	@Test
	public void checkVerticalWin() {
		board.setMark(1, 1);
		board.setMark(0, 2);
		board.setMark(1, 2);
		board.setMark(2, 2);
		board.setMark(1, 0);
		assert board.getWinner() == Mark.X;		
	}
	
	@Test
	public void checkDescendingDiagonalWin() {
		board.setMark(0, 1);
		board.setMark(0, 0);
		board.setMark(1, 0);
		board.setMark(1, 1);
		board.setMark(0, 2);
		board.setMark(2, 1);
		board.setMark(2, 0);
		board.setMark(2, 2);
		assert board.getWinner() == Mark.O;
	}
	
	@Test
	public void checkAscendingDiagonalWin() {
		board.setMark(0, 0);
		board.setMark(2, 0);
		board.setMark(0, 1);
		board.setMark(1, 1);
		board.setMark(1, 0);
		board.setMark(2, 1);
		board.setMark(2, 2);
		board.setMark(0, 2);
		assert board.getWinner() == Mark.O;
	}
	
	/* Begin getMark invalid tests */
	@Test(expected=AssertionError.class)
	public void invalidGetMarkNegativeRow() {
		board.getMark(-1,1);
	}
	
	@Test(expected=AssertionError.class)
	public void invalidGetMarkNegativeColumn() {
		board.getMark(1,-1);
	}
	
	@Test(expected=AssertionError.class)
	public void invalidGetMarkHighRow() {
		board.getMark(3,1);
	}
	
	@Test(expected=AssertionError.class)
	public void invalidGetMarkHighColumn() {
		board.getMark(1,3);
	}
	/* End getMark invalid tests */
	
	@Test(expected=AssertionError.class)
	public void invalidSetMarkBadRC() {
		board.setMark(-1,3);
	}
	
	@Test(expected=AssertionError.class)
	public void invalidSetMarkGameOver() {
		board.setMark(0, 0);
		board.setMark(1, 1);
		board.setMark(0, 2);
		board.setMark(1, 0);
		board.setMark(0, 1);
		
		board.setMark(2, 2);
	}
	
	@Test(expected=AssertionError.class)
	public void invalidSetMarkTakenSpace() {
		board.setMark(0, 0);
		board.setMark(0, 0);
	}
	
	@Test(expected=AssertionError.class)
	public void invalidGetWinner() {
		board.getWinner();
		
	}

}
