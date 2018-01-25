/**
 * Nathan Bromer
 * Assignment #1
 * Due Date: 01/25/2018
 * IT2040C/34/Spring 2018
 * Description: The testing class of all the information 
 */
package StatsUI;

public class Main {

	public static void main(String[] args) {
		
		/**
		 * Player 1 information
		 */
		System.out.println("Player 1");
		Loadout Hud = new Loadout("Primary", "Secondary", "Leathal", "Loadout1", 0);
		System.out.println(Hud.toString());
		
		Character operator = new Character("Sledge");
		System.out.println(operator.toString());
		
		Score score = new Score(10, 5, 4);
		System.out.println(score.toString());
		
		/**
		 * Player 2 Information
		 */
		System.out.println("Player 2");
		Loadout Hud2 = new Loadout("MP5", "Tac11", "Flashbang", "Rush", 2);
		System.out.println(Hud2.toString());
		
		Character operator2 = new Character("Ash");
		System.out.println(operator2.toString());
		
		Score score2 = new Score(12, 7, 3);
		System.out.println(score2.toString());
	

	}

}
