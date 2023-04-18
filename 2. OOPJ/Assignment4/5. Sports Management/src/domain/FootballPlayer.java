package domain;

public class FootballPlayer extends Player {

	private int goalsScored; 
	private int assists;
	
	public FootballPlayer(String name, int age, String team, int score, int goalsScored, int assists) {
		super(name, age, team, score);
		this.goalsScored = goalsScored;
		this.assists = assists;
	}

	public int getGoalsScored() {
		return goalsScored;
	}

	public void setGoalsScored(int goalsScored) {
		this.goalsScored = goalsScored;
	}

	public int getAssists() {
		return assists;
	}

	public void setAssists(int assists) {
		this.assists = assists;
	}

	@Override
	public double play() {
		// TODO Auto-generated method stub
		return super.play();
	}

	@Override
	public String toString() {
		return "FootballPlayer [goalsScored=" + goalsScored + ", assists=" + assists + "]";
	} 
	
	
	
	
}
