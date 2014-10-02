package bowling;

public class SinglePlayerBowlingScoreboardImpl_Porter implements SinglePlayerBowlingScoreboard {
	
	private static final int MAXIMUM_ROLLS = 21;
	private String playerName;
	private int[] pinsKnockedDownArray = new int[MAXIMUM_ROLLS];
	private int rollCount = 0;
	
	public SinglePlayerBowlingScoreboardImpl_Porter(String playerName) {
		assert playerName != null : "playerName is null!";
		this.playerName = playerName;
		
	}

	/**
	 * 
	 */
	@Override
	public String getPlayerName() {
		return playerName;
	}

	@Override
	public boolean isGameOver() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getScore(int frameNumber) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Mark getMark(int frameNumber, int boxIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCurrentBall() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void recordRoll(int pinsKnockedDown) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		SinglePlayerBowlingScoreboard board = new SinglePlayerBowlingScoreboardImpl_Porter("daniel");
	}

}
