package domain;

public class CricketPlayer extends Player {

	private int runsScored;
	private int wicketsTaken;

	public CricketPlayer(String name, int age, String team, int score, int runsScored, int wicketsTaken) {
		super(name, age, team, score);
		this.runsScored = runsScored;
		this.wicketsTaken = wicketsTaken;
	}

	public int getRunsScored() {
		return runsScored;
	}

	public void setRunsScored(int runsScored) {
		this.runsScored = runsScored;
	}

	public int getWicketsTaken() {
		return wicketsTaken;
	}

	public void setWicketsTaken(int wicketsTaken) {
		this.wicketsTaken = wicketsTaken;
	}

	@Override
	public double play() {

		return super.play();
	}

	@Override
	public String toString() {
		return "CricketPlayer [runsScored=" + runsScored + ", wicketsTaken=" + wicketsTaken + "]";
	}
	
	

}
