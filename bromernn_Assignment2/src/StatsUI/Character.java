/**
 * Nathan Bromer
 * Assignment #1
 * Due Date: 01/25/2018
 * IT2040C/34/Spring 2018
 * Description: This is to show the character the player picked
 */
package StatsUI;

public class Character {

	private String operatorName;
	
	public Character(String operatorName){
		setOperatorName(operatorName);
	}
	
	public String toString() {
		return "Operator Chosen: " + getOperatorName();
	}
	
	/**
	 * players operator chosen
	 * @return name of that operator
	 */
	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

}
