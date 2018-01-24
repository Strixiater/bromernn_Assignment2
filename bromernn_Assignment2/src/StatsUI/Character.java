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
