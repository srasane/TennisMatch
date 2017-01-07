
public class Player {

	private String playerName;
	private Score  score;
	
	public Player(String playerNameIn){
		setPlayerName(playerNameIn);
		setScore(Score.LOVE);
	}
	

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public Score getScore() {
		return score;
	}
	
	public int getScoreInt(){
		return score.getScore();
	}

	public void setScore(Score score2) {
		this.score = score2;
	}
}
