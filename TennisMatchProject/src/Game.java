
public class Game {
	
	private Player player1;
	private Player player2;
	
	public Game(Player player1In, Player player2In){
		setPlayer1(player1In);
		setPlayer2(player2In);
	}

	
	public Player getLeading(){
		if(player1.getScoreInt() > player2.getScoreInt())
			return player1;
		else if(player1.getScoreInt() < player2.getScoreInt()){
			return player2;
		}
		return null; //both are equal
	}
	
	public void setNewScore(Player player){
		if(isDeuce()){
			player.setScore(player.getScore().ADVANTAGE);
		}
		else
		player.setScore(player.getScore().getNext());
	}
	
	public boolean isDeuce(){
		return (player1.getScoreInt() == Score.FORTY.getScore() && player1.getScoreInt() == player2.getScoreInt());
	}
	
	public Player hasAdvantage(){
		if((player1.getScoreInt() > Score.FORTY.getScore() && player1.getScore() == Score.ADVANTAGE)){ //player1.getScoreInt() == player2.getScoreInt() + 1)){
			
			return player1;
		}
			
		else if((player2.getScoreInt() > Score.FORTY.getScore() &&  player1.getScore() == Score.ADVANTAGE)){//player2.getScoreInt() == player1.getScoreInt() + 1)){
			return player2;
		}	
		return null; //no advantage
	}
	
	public Player getWinner(){
		if((player1.getScoreInt() == Score.GAME.getScore()))// && player1.getScoreInt() > player2.getScoreInt() + 2))
			return player1;
		else if((player2.getScoreInt() == Score.GAME.getScore()))// && player2.getScoreInt() > player1.getScoreInt() + 2))
			return player2;
		return null; //no winner yet
		
	}
	
	public String getMatchStatus(){
		String status = "\n  " + player1.getPlayerName() + " " + player1.getScore().toString() + " " + player2.getPlayerName() + " " + player2.getScore().toString();
		if(getWinner() != null){
			return "\n" + getWinner().getPlayerName() + " wins!!!" + status;
		}	
		if(hasAdvantage() != null){
			return "\n" + hasAdvantage().getPlayerName() + " has advantage" + status;
		}
		if(isDeuce()){
			return "\n" + "deuce" + status;
		}
		
		return status; 
		
		
	}
	
	public Player getPlayer1() {
		return player1;
	}

	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}

	public Player getPlayer2() {
		return player2;
	}

	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}
	
	
}
