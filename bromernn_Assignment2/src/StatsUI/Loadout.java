/**
 * Nathan Bromer
 * Assignment #1
 * Due Date: 01/25/2018
 * IT2040C/34/Spring 2018
 * Description: The player's overall loadout information
 */
package StatsUI;

public class Loadout {
	
	private String primary;
	private String secondary;
	private String leathal;
	private String loadoutName;
	private int numberOfPerks;
	
	/**
	 * @param primary: The primary weapon the player used in their loadout
	 * @param secondary: The secondary weapon the player used on their loadout
	 * @param leathal: The leathal grenade type the player used on their loadout
	 * @param loadoutName: the loadout name for a player specific loadout
	 * @param numberOfPerks: Number of perks on a player's loadout
	 */
	public Loadout(String primary, String secondary, String leathal, String loadoutName, int numberOfPerks) {
		setPrimary(primary);
		setSecondary(secondary);
		setLeathal(leathal);
		setLoadoutName(loadoutName);
		setNumberOfPerks(numberOfPerks);
	}
	
	public String toString() {
		return getLoadoutName() + ": " + getPrimary() + ", " + getSecondary() + ", " + getLeathal() + ", " + getNumberOfPerks();
	}
	
	/**
	 * The primary weapon the player used
	 * @return the weapon used
	 */
	public String getPrimary() {
		return primary;
	}
	public void setPrimary(String primary) {
		this.primary = primary;
	}
	
	/**
	 * The secondary weapon the player used 
	 * @return the weapon used
	 */
	public String getSecondary() {
		return secondary;
	}
	public void setSecondary(String secondary) {
		this.secondary = secondary;
	}
	
	/**
	 * What type of grenade the player used
	 * @return what was used
	 */
	public String getLeathal() {
		return leathal;
	}
	public void setLeathal(String leathal) {
		this.leathal = leathal;
	}
	
	/**
	 * player's name for loadout
	 * @return loadout name
	 */
	public String getLoadoutName() {
		return loadoutName;
	}
	public void setLoadoutName(String loadoutName) {
		this.loadoutName = loadoutName;
	}
	
	/**
	 * How many perks the player used
	 * @return number of perks
	 */
	public int getNumberOfPerks() {
		return numberOfPerks;
	}
	public void setNumberOfPerks(int numberOfPerks) {
		this.numberOfPerks = numberOfPerks;
	}
	

}
