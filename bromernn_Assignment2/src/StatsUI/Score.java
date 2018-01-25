/**
 * Nathan Bromer
 * Assignment #1
 * Due Date: 01/25/2018
 * IT2040C/34/Spring 2018
 * Description: This class calculates and displays the player's stats on a leaderboard
 */
package StatsUI;

public class Score {
	
	private int kills;
	private int assists;
	private int deaths;
	int score;
	
	/**
	 * @param kills: The player's total kills obtained in the match
	 * @param assists: The player's total assists obtained in the match
	 * @param deaths: The player's total deaths in the match
	 */
	public Score(int kills, int assists, int deaths) {
		setKills(kills);
		setAssists(assists);
		setDeaths(deaths);
	}
	
	public String toString() {
		return "Score: " + getScore() + " Kills: " + getKills() + " Assists: " + getAssists() + " Deaths: " + getDeaths();
	}
	
	/**
	 * number of kills the player received
	 * @return number of kills
	 */
	public int getKills() {
		return kills;
	}
	public void setKills(int kills) {
		this.kills = kills;
	}
	
	/**
	 * number of assists the player received
	 * @return number of assists
	 */
	public int getAssists() {
		return assists;
	}
	public void setAssists(int assists) {
		this.assists = assists;
	}
	
	/**
	 * number of player deaths
	 * @return number of deaths
	 */
	public int getDeaths() {
		return deaths;
	}
	public void setDeaths(int deaths) {
		this.deaths = deaths;
	}
	
	/**
	 * player score
	 * @return score
	 */
	public int getScore() {
		score = kills * 100 + assists * 50;//Calculation of the score
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}

}
