
public enum Score {
	
	//“love”, “fifteen”, “thirty”, and “forty”
	LOVE(0),
	FIFTEEN(1),
	THIRTY(2),
	FORTY(3),
	GAME(4),
	ADVANTAGE(5);
	
	private final int score;
	
	private Score(int scoreIn){
		score = scoreIn;
	}

    public int getScore() {
        return this.score;
    }
    
    public  Score getNext() {
//        return this.ordinal() < Score.values().length - 1
//            ? Score.values()[this.ordinal() + 1]
//            : null; //TODO returniing proper value
    	
    	if(this.ordinal() < Score.values().length - 2){
          return   Score.values()[this.ordinal() + 1];
    	}
    	if(this.ordinal() == GAME.getScore()){
    		return GAME;
    	}
    	if(this.ordinal() == ADVANTAGE.getScore()){
    		return GAME;
    	}
    	return null;
    }
}
