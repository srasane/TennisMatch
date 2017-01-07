
public class TennisMatch {
	
	public static void main(String [] args){
		Player player1 = new Player("Serena Williams");
		Player player2 = new Player("Maria Sharapova");
		
		Game game = new Game(player1, player2);
		game.setNewScore(player1); //serena 15
		game.setNewScore(player2); // Maria 15
		System.out.println(game.getMatchStatus());
		game.setNewScore(player1); //serena 30
		System.out.println(game.getMatchStatus());
		game.setNewScore(player1); //serena 40 
		System.out.println(game.getMatchStatus());
		game.setNewScore(player1); //serena game 
		System.out.println(game.getMatchStatus());
		
		
		player1 = new Player("Serena Williams");
		player2 = new Player("Venus Williams");
		
		game = new Game(player1, player2);
		game.setNewScore(player1); //serena 15
		game.setNewScore(player2); // Venus 15
		System.out.println(game.getMatchStatus());
		game.setNewScore(player1); //serena 30
		game.setNewScore(player2); //Venus 30
		System.out.println(game.getMatchStatus());
		game.setNewScore(player1); //serena 40 
		game.setNewScore(player2); //Venus 40
		System.out.println(game.getMatchStatus());
		game.setNewScore(player2); //Venus Advantage 
		System.out.println(game.getMatchStatus());
		game.setNewScore(player2); //Venus Game 
		System.out.println(game.getMatchStatus());
		
		
		player1 = new Player("Venus Williams");
		player2 = new Player("Maria Sharapova");
		
		game = new Game(player1, player2);
		game.setNewScore(player1); //Venus 15
		game.setNewScore(player2); // Maria 15
		System.out.println(game.getMatchStatus());
		game.setNewScore(player2); //Maria 30
		System.out.println(game.getMatchStatus());
		game.setNewScore(player1); //Venus 30
		game.setNewScore(player2); //Maria 40
		System.out.println(game.getMatchStatus());
		game.setNewScore(player2); //Maria Game 
		System.out.println(game.getMatchStatus());
			
	}

}
