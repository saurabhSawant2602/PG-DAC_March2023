package domain;

public class SportsMangement {

	public SportsMangement() {
		adjustPlay();
		printRecord();
		printScore();

	}

	Player arr[] = new Player[] { new CricketPlayer("Rohit", 35, "India", 350, 105, 0),
			new FootballPlayer("Cristiano", 37, "Portugal", 5, 2, 1),
			new CricketPlayer("Hardik", 30, "India", 410, 45, 2), new CricketPlayer("Virat", 34, "India", 300, 91, 0),
			new FootballPlayer("Lionel", 35, "Argentina", 3, 1, 0),
			new CricketPlayer("Jadeja", 31, "India", 250, 58, 4) };

	public void adjustPlay() {
		for (int i = 0; i < arr.length; i++) {
			int score = 0;
			if (arr[i] instanceof CricketPlayer) {
				CricketPlayer player = (CricketPlayer) arr[i];
				player.setScore(player.getWicketsTaken() >= 1 ? player.getRunsScored() + 10 : player.getRunsScored());
			}
			if (arr[i] instanceof FootballPlayer) {
				FootballPlayer player = (FootballPlayer) arr[i];
				player.setScore(player.getAssists() >= 1 ? player.getGoalsScored() + 5 : player.getGoalsScored());
			}
		}
	}

	public void printScore() {

		double total = 0;
		for (Player player : arr) {
			total += player.play();
		}
		System.out.println("=========================================");
		System.out.println();
		System.out.println(" Total Score of the Team  " + total);
		System.out.println();
		System.out.println("=========================================");
	}

	public void printRecord() {
		System.out.println("==========================================");
		System.out.println();
		System.out.println("PlayScore (Player wise)");
		System.out.println();
		System.out.println("==========================================");
		
		
		System.out.println(String.format("%-15s%-10s%-10s", "Name", "Score", "Player Type"));
		for (Player player : arr) {
			
            System.out.println("");
			System.out.println(String.format("%-15s%-10d%-10s", player.getName(), player.getScore(),
					(player instanceof CricketPlayer ? "Cricketer" : "FootBaller")));
		}

	}
}
