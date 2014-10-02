package bowling;

public interface SinglePlayerBowlingScoreboard {
	
	public String getPlayerName();
	
	public boolean isGameOver();
	
	public int getScore(int frameNumber);
	
	public Mark getMark(int frameNumber, int boxIndex);
	
	public int getCurrentBall();
	
	public void recordRoll(int pinsKnockedDown);
	
	public String toString();
	
}
